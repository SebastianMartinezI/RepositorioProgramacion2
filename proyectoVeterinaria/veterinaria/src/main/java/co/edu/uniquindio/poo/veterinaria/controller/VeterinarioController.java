package co.edu.uniquindio.poo.veterinaria.controller;

import co.edu.uniquindio.poo.veterinaria.model.Veterinario;
import co.edu.uniquindio.poo.veterinaria.model.Veterinaria;
import java.util.Collection;

public class VeterinarioController {

    Veterinaria veterinaria;

    public VeterinarioController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    public boolean crearVeterinario(Veterinario veterinario) {
        return veterinaria.agregarVeterinario(veterinario);
    }

    public Collection<Veterinario> obtenerListaVeterinarios() {
        return veterinaria.getVeterinarios();
    }

    public boolean eliminarCliente(String cedula) {
        return empresa.eliminarCliente(cedula);
    }

    public boolean actualizarCliente(String cedula, Cliente cliente) {
        return empresa.actualizarCliente(cedula, cliente);
    }
}

