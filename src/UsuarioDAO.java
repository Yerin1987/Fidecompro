
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    private static final String FILE_NAME = "usuarios.dat";

    // Guarda un nuevo usuario agregándolo a la colección ya existente
    public static void guardarUsuario(Usuario usuario) {
        ArrayList<Usuario> usuarios = cargarUsuarios();
        usuarios.add(usuario);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(usuarios);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el usuario.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Carga la colección de usuarios del archivo
    public static ArrayList<Usuario> cargarUsuarios() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>(); // Retorna una lista vacía si el archivo no existe
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Usuario>) ois.readObject(); // Lee la lista de usuarios
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return new ArrayList<>(); // Retorna una lista vacía en caso de error
    }

    // Busca un usuario por nombre y contraseña en la colección
    public static Usuario buscarUsuario(String nombre, String password) {
        ArrayList<Usuario> usuarios = cargarUsuarios();
        for (Usuario u : usuarios) {
            if (u.getNombreCompleto().equalsIgnoreCase(nombre) && u.getContrasena().equals(password)) {
                return u; // Retorna el usuario si se encuentra
            }
        }
        return null; // Retorna null si no se encuentra
    }
}
