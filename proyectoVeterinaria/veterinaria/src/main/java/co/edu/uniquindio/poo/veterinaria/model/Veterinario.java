package co.edu.uniquindio.poo.veterinaria.model;

public class Veterinario extends Persona {
    private int licenciaProfesional;
    private Especialidad especialidad;

    public Veterinario(String nombre, int identificacion, int telefono, String direccion, int licenciaProfesional) {
        super(nombre, identificacion,telefono, direccion);
        this.licenciaProfesional = licenciaProfesional;

    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "licenciaProfesional=" + licenciaProfesional +
                ", especialidad=" + especialidad +
                '}';
    }
}
