import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Factura {
    private Map<Producto, Integer> productos;
    private double total;
    private final double impuesto = 0.13;
    private static int contadorFactura = 1;
    private int numeroFactura;
    private String nombreEmpresa = "Fidecompras";
    private String lugar = "Alajuela, City Mall";
    private String cedulaJuridica = "3-0210-39322";
    private String telefono = "2436-0809";
    private String fecha;
    
    private String clienteNombre;
    private String clienteTelefono;
    private String clienteDireccion;
    private double descuento;

    public Factura(String clienteNombre, String clienteTelefono, String clienteDireccion) {
        this.productos = new HashMap<>();
    this.total = 0;
    this.fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    this.clienteNombre = clienteNombre;
    this.clienteTelefono = clienteTelefono;
    this.clienteDireccion = clienteDireccion;
    this.numeroFactura = contadorFactura; // Usa el contador actual
    contadorFactura++; // Incrementa el contador para la próxima factura
    this.descuento = 0; // Inicializa el descuento
}

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidad() >= cantidad) {
        productos.put(producto, productos.getOrDefault(producto, 0) + cantidad);
        total += producto.getPrecioVenta() * cantidad;
        producto.modificarProducto(producto.getNombre(), producto.getPrecioVenta(), producto.getPrecioCompra(), producto.getCantidad() - cantidad, producto.estado);
    } else {
        System.out.println("No hay suficiente en stock para agregar este producto.");
        }
    }
    public static void incrementarContadorFactura() {
    contadorFactura++;
    }

    public double calcularTotal(double descuento) {
    double subtotal = total - descuento;
    double iva = subtotal * impuesto;
    return subtotal + iva;

    }

    public void guardarFacturaEnArchivo() {
    String nombreArchivo = "factura_" + numeroFactura + ".txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
        writer.write("Factura N°: " + String.format("%04d", numeroFactura));
        writer.newLine();
        writer.write("Nombre de la Empresa: " + nombreEmpresa);
        writer.newLine();
        writer.write("Lugar: " + lugar);
        writer.newLine();
        writer.write("Cédula Jurídica: " + cedulaJuridica);
        writer.newLine();
        writer.write("Teléfono: " + telefono);
        writer.newLine();
        writer.write("Fecha: " + fecha);
        writer.newLine();
        writer.newLine();
        writer.write("Datos del Cliente:");
        writer.newLine();
        writer.write("Nombre: " + clienteNombre);
        writer.newLine();
        writer.write("Teléfono: " + clienteTelefono);
        writer.newLine();
        writer.write("Dirección: " + clienteDireccion);
        writer.newLine();
        writer.newLine();
        writer.write("Código\tProducto\tCantidad\tPrecio Unitario\tTotal");
        writer.newLine();

        for (Map.Entry<Producto, Integer> entry : productos.entrySet()) {
            Producto p = entry.getKey();
            int cantidadSolicitada = entry.getValue();
            double totalProducto = p.getPrecioVenta() * cantidadSolicitada;
            writer.write(String.format("%-6d %-20s %-8d %-10.2f %-10.2f",
                p.getCodigo(), p.getNombre(), cantidadSolicitada, p.getPrecioVenta(), totalProducto));
            writer.newLine();
        }
        
        double subtotal = total - descuento;
        double iva = subtotal * impuesto;
        double totalFinal = subtotal + iva;

        writer.write(String.format("\nSubtotal: ₡%.2f", subtotal));
        writer.write(String.format("\nDescuento: ₡%.2f", descuento));
        writer.write(String.format("\nIVA (13%%): ₡%.2f", iva));
        writer.write(String.format("\nTotal: ₡%.2f%n", totalFinal));
    } catch (IOException e) {
        System.out.println("Error al guardar la factura: " + e.getMessage());
    }
}

    public static int getContadorFactura() {
        return contadorFactura;
    }
}