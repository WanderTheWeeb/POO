import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("..::Hola Mundo::..\n");

        Estudiante estudiante = new Estudiante("Rocael Lopez", "rocael@uv.mx");
        estudiante.mostrarNombre();

        estudiante.setNombre("Carlos Josue");
        estudiante.setTelefono("0123456789");

        System.out.println(estudiante.getTelefono());

        //mostarMenu();
    }
}
