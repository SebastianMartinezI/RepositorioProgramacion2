package co.edu.uniquindio.poo.veterinaria.model;

public class Tratamiento {
    private String descripcion;
    private Consulta consulta;

    public Tratamiento(String descripcion, Consulta consulta) {
        this.descripcion = descripcion;
        this.consulta = consulta;
    }
}
