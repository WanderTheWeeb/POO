package UI;

import Model.Estudiante;
import Model.Maestro;

import java.util.List;
import java.util.Scanner;

import static UI.UIMaestro.maestrosConCursosDisponibles;
import static UI.UIMenu.estudianteLogeado;
import static UI.UIMenu.mostrarMenu;

public class UIEstudiante {

    public static void mostrarMenuEstudiante() {
        System.out.println("..::Estudiante::..");
        System.out.println("Bienvenido " + estudianteLogeado.getNombre());
        System.out.println("1-Agendar curso");
        System.out.println("2-Ver mis cursos");
        System.out.println("3-Cancelar");

        int respuesta;
        do {
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 1 -> {
                    System.out.println("Agendar cursos");
                    reservarCurso();
                }
                case 2 -> verMisCursos();
                case 3 -> {
                    System.out.println("Adiós");
                    mostrarMenu();
                }
                default -> System.out.println("Seleccione una opción correcta");
            }
        } while (respuesta != 0);
    }

    /**
     * Este es mas bonito
     */
    private static void verMisCursos() {
        System.out.println("..::Mis cursos::.");
        Estudiante estudiante = estudianteLogeado;

        if (estudiante.getMisCursoDisponibles().isEmpty()) {
            System.out.println("No hay cursos disponibles.");
        } else {
            int j = 0;
            for (int i = 0; i < estudiante.getMisCursoDisponibles().size(); i++) {
                j++;
                System.out.println(j + ".- Fecha: " + estudiante.getMisCursoDisponibles().get(i).getFecha(null)
                        + " Hora: " + estudiante.getMisCursoDisponibles().get(i).getHora());
            }
        }
    }

    /**
     * ODIO ESTE METODO CON TODA MI ALMA
     */
    private static void reservarCurso() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("..::Reservar Curso::..");

            if (maestrosConCursosDisponibles.isEmpty()) {
                System.out.println("No hay cursos disponibles");
            }

            int j = 0;
            for (Maestro maestrosConCursosDisponible : maestrosConCursosDisponibles) {
                j++;
                System.out.println(j + ".- Maestro: " + maestrosConCursosDisponible.getNombre());
                System.out.println("Cursos Disponibles:");

                List<Maestro.CursoDisponible> cursosDisponibles = maestrosConCursosDisponible.getCursosDisponibles();

                for (Maestro.CursoDisponible curso : cursosDisponibles) {
                    System.out.println(curso.toString());
                }
            }

            System.out.println("..::Selecciona un profesor::..");
            int respuestaMaestro = Integer.parseInt(sc.nextLine());

            if (respuestaMaestro >= 1 && respuestaMaestro <= maestrosConCursosDisponibles.size()) {
                Maestro maestroSeleccionado = maestrosConCursosDisponibles.get(respuestaMaestro - 1);
                List<Maestro.CursoDisponible> cursosMaestro = maestroSeleccionado.getCursosDisponibles();

                if (cursosMaestro.isEmpty()) {
                    System.out.println("El maestro no tiene cursos disponibles.");
                } else {
                    j = 0;
                    for (Maestro.CursoDisponible curso : cursosMaestro) {
                        j++;
                        System.out.println(j + ". " + curso.toString());
                    }
                    System.out.println("El maestro seleccionado es " + maestroSeleccionado.getNombre() + "\nPresiona 1 para confirmar");
                    int respuestaConfirmacion = Integer.parseInt(sc.nextLine());
                    if (respuestaConfirmacion == 1) {
                        int respuestaCurso;
                        do {
                            System.out.println("..::Selecciona un curso::..");
                            respuestaCurso = Integer.parseInt(sc.nextLine());

                            if (respuestaCurso >= 1 && respuestaCurso <= cursosMaestro.size()) {
                                System.out.println("Has seleccionado el curso " + respuestaCurso + "\n¿Estás seguro?\nPresiona 1 para continuar\nCualquier otro número para salir");
                                int band = Integer.parseInt(sc.nextLine());
                                if (band == 1) {
                                    Maestro.CursoDisponible cursoSeleccionado = cursosMaestro.get(respuestaCurso - 1);
                                    estudianteLogeado.getMisCursoDisponibles().add(cursoSeleccionado);
                                    System.out.println("Curso reservado exitosamente.");
                                    break;
                                }
                            } else {
                                System.out.println("Selección de curso no válida.");
                            }
                        } while (true);
                    }
                }
            } else {
                System.out.println("Selección de maestro no válida.");
            }

            System.out.println("Presiona 0 para salir o cualquier otro número para continuar");
            int salir = Integer.parseInt(sc.nextLine());

            if (salir == 0) {
                break;
            }
        }
        mostrarMenuEstudiante();
    }

}
