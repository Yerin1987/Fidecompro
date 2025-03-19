import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProductoDAO {
    private static final String FILE_NAME = "productos.dat";

    // Guarda un nuevo producto agregándolo a la lista existente
    public static void guardarProducto(Producto producto) {
        ArrayList<Producto> productos = cargarProductos();
        productos.add(producto);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(productos);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Carga la lista de productos desde el archivo
    public static ArrayList<Producto> cargarProductos() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return new ArrayList<>(); // Retorna lista vacía si el archivo no existe
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Producto>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return new ArrayList<>(); // Retorna lista vacía en caso de error
    }
    
    // Edita un producto existente en la lista (buscando por código)
    public static boolean editarProducto(Producto productoEditado) {
        ArrayList<Producto> productos = cargarProductos();
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            if (p.getCodigo().equals(productoEditado.getCodigo())) {
                productos.set(i, productoEditado);
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                    oos.writeObject(productos);
                    return true; // Producto editado con éxito
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al editar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        return false; // Producto no encontrado
    }
    
    // Retorna la lista de productos
    public static ArrayList<Producto> obtenerProductos() {
        return cargarProductos();
    }
    static void actualizarProducto(Producto producto) {
    ArrayList<Producto> productos = cargarProductos();
    boolean encontrado = false;

    for (int i = 0; i < productos.size(); i++) {
        Producto p = productos.get(i);
        if (p.getCodigo().equals(producto.getCodigo())) {
            // Actualiza la cantidad del producto
            p.setCantidad(producto.getCantidad());
            encontrado = true;
            break; // Sale del bucle una vez que encuentra el producto
        }
    }

    if (encontrado) {
        // Guarda la lista actualizada de productos en el archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(productos);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Producto no encontrado para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    

    
}
