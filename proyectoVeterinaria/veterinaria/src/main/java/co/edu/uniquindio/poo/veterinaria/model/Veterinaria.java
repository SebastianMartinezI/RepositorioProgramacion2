package co.edu.uniquindio.poo.veterinaria.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String direccion;
    private int telefono;
    private Collection<Mascota> listMascotas;
    private Collection<Propietario>listPropietarios;
    private Collection<Veterinario> listVeterinarios;
    private Collection<Consulta> listConsultas;


    public Veterinaria(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        listMascotas = new LinkedList<>();
        listPropietarios = new LinkedList<>();
        listVeterinarios = new LinkedList<>();
        listConsultas = new LinkedList<>();

    }

    /**
     * Metodo para agregar una mascota a la lista.
     */
    public void agregarMascota(Mascota mascota) {
        this.listMascotas.add(mascota);
    }

    public Collection<Veterinario> getListVeterinarios() {
        return listVeterinarios;
    }
    public  void setListVeterinarios(Collection<Veterinario> listVeterinarios) {
        this.listVeterinarios = listVeterinarios;
    }

    public Collection<Consulta> getListConsultas() {
        return listConsultas;
    }
    public void setListConsultas(Collection<Consulta> listConsultas) {
        this.listConsultas = listConsultas;
    }
    public Collection<Propietario> getListPropietarios() {
        return listPropietarios;
    }
    public void setListPropietarios(List<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }
    public Collection<Mascota> getListMascotas() {
        return listMascotas;
    }
    public void setListMascotas(List<Mascota> listMascotas) {
        this.listMascotas = listMascotas;
    }

    public void agregarPropietario(Propietario propietario) {
        listPropietarios.add(propietario);
    }

    public boolean agregarVeterinario(Veterinario veterinario) {
        boolean centinela = false;
        if (!verificarVeterinario(veterinario.getIdentificacion())) {
            veterinario.add(veterinario);
            centinela = true;
        }
        return centinela;
    }
    public boolean verificarVeterinario(int identificacion) {
        boolean centinela = false;
        for (Veterinario veterinario : listVeterinarios) {
            if (veterinario.getIdentificacion() == identificacion) {
                centinela = true;
            }
        }
        return centinela;
    }



    public void agregarConsulta(Consulta consulta) {
        listConsultas.add(consulta);
    }

    /** Ver historial de una mascota */
    public void verHistorialMascota(String nombre) {
        System.out.println("Historial de la mascota: " + nombre);
        for (Consulta consulta : listConsultas) {
            if (consulta.getMascota().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(consulta);
            }
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Metodo para mostrar todas las mascotas registradas.
     */
    public void mostrarMascotas() {
        System.out.println("Mascotas en la veterinaria " + nombre + ":");
        for (Mascota m : listMascotas) {
            System.out.println("- " + m);
        }
    }
    /** Consultar citas por fecha (fecha en formato String, ej: "2025-08-08") */
    public void consultarCitasPorFecha(String fecha) {
        System.out.println("Citas del día " + fecha + ":");
        for (Consulta consulta : listConsultas) {
            if (consulta.getFecha().equals(fecha)) {
                System.out.println(consulta);
            }
        }
    }


    /** Funcionalidad propia: buscar propietario por ID */
    public Propietario buscarPropietarioPorID(int identificicacion) {
        for (Propietario propietario : listPropietarios) {
            if (propietario.getIdentificacion() == identificicacion) {
                return propietario;
            }
        }
        return null;
    }
}


