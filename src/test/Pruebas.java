package test;

import Model.Maestro;

import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args) {
        ArrayList<Maestro> maestros = new ArrayList<>();
        maestros.add(new Maestro("Luis Morales", "morales@uv.mx"));
        maestros.add(new Maestro("Javier Pino", "jpino@uv.mx"));
        maestros.add(new Maestro("Jose Vergara", "jvergara@uv.mx"));
        maestros.add(new Maestro("Patricia Martinez", "pmartinez@uv.mx"));


    }
}
