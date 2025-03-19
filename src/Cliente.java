public class Cliente extends Persona {
    private String cedula;
    private String email;

    public Cliente(String nombreCompleto, String cedula, String telefono, String email, String direccion) {
        super(nombreCompleto, telefono, direccion);
        this.cedula = cedula;
        this.email = email;
    }

    @Override
    public String mostrarInformacion() {
        // Retorna la información del cliente
        return "Cliente:\n" +
               "Nombre: " + nombreCompleto + "\n" +
               "Cédula: " + cedula + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Email: " + email + "\n" +
               "Dirección: " + direccion;
    }
}