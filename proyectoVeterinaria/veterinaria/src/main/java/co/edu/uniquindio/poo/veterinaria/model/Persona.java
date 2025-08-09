package co.edu.uniquindio.poo.veterinaria.model;

import java.util.List;

public class Persona {
    private String nombre;
    private  int identificacion;
    private int telefono;
    private String direccion;


    public Persona(String nombre, int identificacion, int telefono, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
