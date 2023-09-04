import Model.Estudiante;
import Model.Maestro;
import Model.Usuario;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("..::Hola Mundo::..\n");

        Usuario usuario = new Maestro("Luis Morales", "luismorales04@uv.mx");
        usuario.mostrarInformacionUsuario();


        Maestro maestro = new Maestro("Luis Morales", "luismorales04@uv.mx");
        System.out.println(maestro);


        Estudiante estudiante = new Estudiante("Rocael", "roca@uv.mx");
        System.out.println(estudiante);
        System.out.println(estudiante.toString());

        maestro.addCursoDisponible(new Date(), "7Hrs");
        maestro.addCursoDisponible(new Date(), "8Hrs");
        maestro.addCursoDisponible(new Date(), "9Hrs");
        maestro.addCursoDisponible(new Date(), "10Hrs");

        for (Maestro.CursoDisponible cursosDisponibles : maestro.getCursosDisponibles()){
            System.out.println( cursosDisponibles );
        }

    }
}
