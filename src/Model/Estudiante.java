package Model;

public class Estudiante extends Usuario{
    //Atributos
    private String semestre;

    //Metodo constructor
    public Estudiante(String nombre, String correo){
        super(nombre,correo);
    }

    //Comportamientos
    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Semestre: " + semestre;
    }

    @Override
    public void mostrarInformacionUsuario() {
        System.out.println("Soy un estiante de LIS");
    }


}
