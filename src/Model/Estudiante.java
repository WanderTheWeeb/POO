package Model;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Usuario{
    //Atributos
    private ArrayList<CitaMaestro> citasMaestros = new ArrayList<>();
    private ArrayList<Maestro.CursoDisponible> misCursoDisponibles = new ArrayList<>();

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

    public void setCitasMaestros(ArrayList<CitaMaestro> citasMaestros) {
        this.citasMaestros = citasMaestros;
    }

    public ArrayList<Maestro.CursoDisponible> getMisCursoDisponibles() {
        return misCursoDisponibles;
    }

    public void setMisCursoDisponibles(ArrayList<Maestro.CursoDisponible> misCursoDisponibles) {
        this.misCursoDisponibles = misCursoDisponibles;
    }

    @Override
    public String toString() {
        return super.toString() + ", Semestre: " + semestre;
    }

    @Override
    public void mostrarInformacionUsuario() {
        System.out.println("Soy un estiante de LIS");
    }
    public ArrayList<CitaMaestro> getCitasMaestros() {
        return citasMaestros;
    }

    public void addCitaMaestro(Maestro maestro, Date fecha, String hora) {
        CitaMaestro citaMaestro = new CitaMaestro(this,maestro);
        citaMaestro.agendar(fecha, hora);
        citasMaestros.add(citaMaestro);

    }


}
