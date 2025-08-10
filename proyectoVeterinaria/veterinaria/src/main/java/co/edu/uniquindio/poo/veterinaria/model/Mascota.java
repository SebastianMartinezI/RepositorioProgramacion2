package co.edu.uniquindio.poo.veterinaria.model;

public class Mascota {
    private String nombre;
    private Especie especie;
    private String raza;
    private String edad;
    private String identificacionVeterinaria;
    private Propietario propietario;

    public Mascota(String nombre, Especie especie, String raza, String edad, String identificacionVeterinaria, Propietario propietario) {

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

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getIdentificacionVeterinaria() {
        return identificacionVeterinaria;
    }

    public void setIdentificacionVeterinaria(String identificacionVeterinaria) {
        this.identificacionVeterinaria = identificacionVeterinaria;
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
