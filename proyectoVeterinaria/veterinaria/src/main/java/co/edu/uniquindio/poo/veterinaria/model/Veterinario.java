package co.edu.uniquindio.poo.veterinaria.model;

public class Veterinario extends Persona {
    private String licenciaProfesional;
    private Especialidad especialidad;

    public Veterinario(String nombre, String identificacion, String telefono, String direccion, String licenciaProfesional) {
        super(nombre, identificacion,telefono, direccion);
        this.licenciaProfesional = licenciaProfesional;

    }

    public String getLicenciaProfesional() {
        return licenciaProfesional;
    }

    public void setLicenciaProfesional(String licenciaProfesional) {
        this.licenciaProfesional = licenciaProfesional;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
