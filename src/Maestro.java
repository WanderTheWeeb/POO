public class Maestro {
    //Atributos
    public static int id = 0; //id++
    public String nombre;
    public String correo;
    public String especialidad;

    //Metodo constructor
    Maestro(){
        System.out.println("Objeto declarado.");
        id++;
    }

    Maestro(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
        System.out.println("Objeto declarado.");
        id++;
    }

    //Metodos - Comportamiento
    public void mostrarNombre(){
        System.out.println("Hola me llamo: " + nombre);
    }

    public void mostrarID(){
        System.out.println("El ID del maestro es: " + id);
    }
}
