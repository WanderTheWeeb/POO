package UI;

import java.util.Scanner;

public class UIMenu {
    public static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre","Noviembre", "Diciembre"};

    public static void mostarMenu(){
        System.out.println("..::Bienvenido::..");
        System.out.println("Seleccionen una opcion:");

        System.out.println("1-Maestros");
        System.out.println("2-Estudiantes");
        System.out.println("3-Salir");

        int respuesta = 0;

        do {
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("..::Maestro::..");
                    //Mostar menu maestro
                    break;
                case 2:
                    System.out.println("..::Estudiante::..");
                    //Mostrar menu estudiante
                    menuEstudiante();
                    break;
                case 3:
                    System.out.println("..::Adios::..");
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");
            }
        }while (respuesta != 3);
    }

    public static void menuEstudiante(){
        System.out.println("1-Agendar curso");
        System.out.println("2-Ver mis cursos");
        System.out.println("3-Cancelar");

        int respuesta = 0;
        do {
            Scanner sc = new Scanner(System.in);
            respuesta = Integer.valueOf(sc.nextLine());

            switch (respuesta){
                case 1:
                    System.out.println("Agendar un curso");
                    System.out.println("Seleccione un mes:");
                    for (int i = 7; i < 10; i++) {
                        System.out.println(i + "-" + MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("Ver mis cursos");
                    break;
                case 3:
                    System.out.println("Adios");
                    mostarMenu();
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");
            }
        }while(respuesta != 0);
    }
}
