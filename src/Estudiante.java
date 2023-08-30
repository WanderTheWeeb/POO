public class Estudiante {
    //Atributos
    private String nombre;
    private String correo;
    private String matricula;
    private String telefono;
    private String semestre;

    //Metodo constructor
    Estudiante(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    //Comportamientos
    public void mostrarNombre(){
        System.out.println("Mi nombre es: " + nombre);
    }

    public Estudiante(String nombre, String correo, String matricula, String telefono, String semestre) {
        this.nombre = nombre;
        this.correo = correo;
        this.matricula = matricula;
        this.telefono = telefono;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() != 10){
            System.out.println("Telefono incorrecto");
        }else {
            this.telefono = telefono;
        }
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
