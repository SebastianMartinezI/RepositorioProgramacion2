package co.edu.uniquindio.poo.veterinaria.model;

public class Consulta {
    private String fecha;
    private String hora;
    private Mascota mascota;
    private Veterinario veterinario;
    private String motivoConsulta;
    private String diagnostico;
    private Tratamiento tratamiento;

    public Consulta(String fecha, String hora, Mascota mascota, Veterinario veterinario, String motivoConsulta, String diagnostico, Tratamiento tratamiento) {
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;

    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", mascota=" + mascota +
                ", veterinario=" + veterinario +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento=" + tratamiento +
                '}';
    }
}
