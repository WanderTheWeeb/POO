package UI;

import java.util.Scanner;

public class UIEstudiante {
    public static void mostrarMenuEstudiante(){
        System.out.println("..::Estudiante::..");
        System.out.println("Bienvenido " + UIMenu.estudianteLogeado.getNombre());
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
                        System.out.println(i + "-" + UIMenu.MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("Ver mis cursos");
                    break;
                case 3:
                    System.out.println("Adios");
                    UIMenu.mostarMenu();
                    break;
                default:
                    System.out.println("Seleccione una opcion correcta");
            }
        }while(respuesta != 0);
    }
}
