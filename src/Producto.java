import java.io.Serializable;

public class Producto implements Comparable<Producto>, Serializable{
    private static final long serialVersionUID = 1L;
    String codigo;
    private String nombre;
    private double precioVenta;
    private double precioCompra;
    private int cantidad;
    protected String estado;
    private int cantidadComprada;

    public Producto(int cantidad, String codigo, double precioVenta, double precioCompra, String nombre, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.cantidad = cantidad;
        this.estado = estado;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
    
    public double getPrecioCompra() {
        return precioCompra;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void modificarProducto(String nuevoNombre, double nuevoPrecioVenta, double nuevoPrecioCompra, int nuevaCantidad, String nuevoEstado) {
    this.nombre = nuevoNombre;
    this.precioVenta = nuevoPrecioVenta;
    this.precioCompra = nuevoPrecioCompra;
    this.cantidad = nuevaCantidad;
    this.estado = nuevoEstado;
    
    }

    @Override
    public int compareTo(Producto otro) {
        // Comparación por codigo (puedes cambiarlo si prefieres otro criterio)
        return this.codigo.compareTo(otro.codigo);
    }
    public double getPrecio() {
        return this.precioVenta;
    }
    public int getCantidadComprada() {
        return cantidadComprada;
    }
    
    public void setCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }
    
}