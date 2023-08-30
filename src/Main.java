import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("..::Hola Mundo::..\n");

        Maestro maestro = new Maestro("Luis Morales", "luismorales04@uv.mx");
        System.out.println(maestro.getNombre());

        maestro.addCursoDisponible(new Date(), "7Hrs");
        maestro.addCursoDisponible(new Date(), "8Hrs");
        maestro.addCursoDisponible(new Date(), "9Hrs");
        maestro.addCursoDisponible(new Date(), "10Hrs");

        for (Maestro.CursoDisponible cursosDisponibles : maestro.getCursosDisponibles()){
            System.out.println("Curso disponible: Fecha: " + cursosDisponibles.getFecha() + ", Hora: " + cursosDisponibles.getHora());
        }

    }
}
