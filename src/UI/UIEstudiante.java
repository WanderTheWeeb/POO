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

        int respuesta = 0;
        do {
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.parseInt(sc.nextLine());

            switch (respuesta) {
                case 1:
                    System.out.println("Agendar cursos");
                    reservarCurso();
                    break;
                case 2:
                    verMisCursos();
                    break;
                case 3:
                    System.out.println("Adiós");
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Seleccione una opción correcta");
            }
        } while (respuesta != 0);
    }

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

    private static void reservarCurso() {
        Scanner sc = new Scanner(System.in);
        int respuestaMaestro = 0;

        do {
            System.out.println("..::Reservar Curso::..");

            if (maestrosConCursosDisponibles.isEmpty()) {
                System.out.println("No hay cursos disponibles");
                return; // Salir de la función si no hay cursos disponibles
            }

            int j = 0;
            for (int i = 0; i < maestrosConCursosDisponibles.size(); i++) {
                j++;
                System.out.println(j + ".- Maestro: " + maestrosConCursosDisponibles.get(i).getNombre());
                System.out.println("Cursos Disponibles:");

                List<Maestro.CursoDisponible> cursosDisponibles = maestrosConCursosDisponibles.get(i).getCursosDisponibles();

                for (Maestro.CursoDisponible curso : cursosDisponibles) {
                    System.out.println(curso.toString());
                }
            }

            System.out.println("..::Selecciona un profesor::..");
            respuestaMaestro = Integer.parseInt(sc.nextLine());

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
                                }
                            } else {
                                System.out.println("Selección de curso no válida.");
                            }
                        } while (respuestaCurso == 0);
                    }
                }
            } else {
                System.out.println("Selección de maestro no válida.");
            }
        } while (respuestaMaestro != 0);
        mostrarMenuEstudiante();
    }
}
