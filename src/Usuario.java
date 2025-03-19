import java.io.Serializable;

public class Usuario implements Comparable<Usuario>, Serializable {
    private static final long serialVersionUID = 2L;
    private String nombreCompleto;
    private String idUsuario;
    private String telefono;
    private String direccion;
    private String contrasena;

    public Usuario(String nombreCompleto, String idUsuario, String telefono, String direccion, String contrasena) {
        this.nombreCompleto = nombreCompleto;
        this.idUsuario = idUsuario;
        this.telefono = telefono;
        this.direccion = direccion;
        this.contrasena = contrasena;
    }
    
   

   Usuario() {
       
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public static void iniciarSesion(Usuario usuario) {
        System.out.println("¡Bienvenido a Fideflix, " + usuario.getNombreCompleto() + "!");
    }

    @Override
    public int compareTo(Usuario otro) {
        if (this.idUsuario == null && otro.idUsuario == null) {
            return 0;
        }
        if (this.idUsuario == null) {
            return -1;
        }
        if (otro.idUsuario == null) {
            return 1;
        }
        
        return this.idUsuario.compareTo(otro.idUsuario);
    }

    public String getNombre() {
        return this.nombreCompleto; // Devuelve el nombre completo
    }
}
