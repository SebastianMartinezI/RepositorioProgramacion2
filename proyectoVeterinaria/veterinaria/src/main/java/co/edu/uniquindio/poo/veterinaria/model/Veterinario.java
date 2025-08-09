package co.edu.uniquindio.poo.veterinaria.model;

public class Veterinario extends Persona {
    private int licenciaProfesional;
    private Especialidad especialidad;

    public Veterinario(String nombre, int identificacion, int telefono, String direccion, int licenciaProfesional) {
        super(nombre, identificacion,telefono, direccion);
        this.licenciaProfesional = licenciaProfesional;

    }

    public int getLicenciaProfesional() {
        return licenciaProfesional;
    }

    public void setLicenciaProfesional(int licenciaProfesional) {
        this.licenciaProfesional = licenciaProfesional;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
