package co.edu.uniquindio.poo.veterinaria.model;

public class Mascota {
    private String nombre;
    private Especie especie;
    private String raza;
    private int edad;
    private int identificacionVeterinaria;
    private Propietario propietario;

    public Mascota(String nombre, Especie especie, String raza, int edad, int identificacionVeterinaria, Propietario propietario) {

        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.identificacionVeterinaria = identificacionVeterinaria;
        this.propietario = propietario;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", propietario=" + propietario +
                ", identificacionVeterinaria=" + identificacionVeterinaria +
                ", edad=" + edad +
                ", especie=" + especie +
                ", raza='" + raza + '\'' +
                '}';
    }
}
