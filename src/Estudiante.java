public class Estudiante extends Usuario{
    //Atributos
    private String semestre;

    //Metodo constructor
    Estudiante(String nombre, String correo){
        super(nombre,correo);
    }

    //Comportamientos
    public void mostrarNombre(){
        System.out.println("Mi nombre es: " + getNombre());
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
