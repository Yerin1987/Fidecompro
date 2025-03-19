public abstract class Persona {
    protected String nombreCompleto;
    protected String telefono;
    protected String direccion;

    public Persona(String nombreCompleto, String telefono, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Método común que se puede sobreescribir en las subclases
    public abstract String mostrarInformacion();
}