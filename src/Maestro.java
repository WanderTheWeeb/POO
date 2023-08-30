import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario{
    //Atributos
    private String especialidad;
    private String rfc;

    //Metodo constructor
    Maestro(String nombre, String correo){
        super(nombre, correo);
        System.out.println("Objeto declarado.");
    }

    //Metodos - Comportamiento
    public void mostrarNombre(){
        System.out.println("Hola me llamo: " + getNombre());
    }

    public void mostrarID(){
        System.out.println("El ID del maestro es: " + getId());
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    ArrayList<CursoDisponible> cursosDisponibles = new ArrayList<>();
    public void addCursoDisponible(Date date, String hora){
        cursosDisponibles.add(new Maestro.CursoDisponible(date, hora));
    }

    public ArrayList<CursoDisponible> getCursosDisponibles(){
        return cursosDisponibles;
    }

    //Clase anidada
    public static class CursoDisponible{
        //Atributos
        private int id;
        private Date fecha;
        private String hora;

        //Constructor
        public CursoDisponible(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }
    }
}
