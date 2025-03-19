import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaCrearFactura extends javax.swing.JFrame {
    private ArrayList<Producto> productosCargados;
    private Usuario usuario;
    //private Iterable<Producto> productosCargados;
    
    
    public VentanaCrearFactura(Usuario usuario) {
        this.usuario = usuario;
        setTitle("Crear Factura");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        productosCargados = new ArrayList<>(); // Asegúrate de que sea ArrayList
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCargarProducto = new javax.swing.JButton();
        btnFacturar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProductos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese el codigo de producto");

        jLabel2.setText("cantidad");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Crear factura");

        btnCargarProducto.setBackground(new java.awt.Color(0, 51, 153));
        btnCargarProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarProducto.setText("Cargar producto");
        btnCargarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarProductoActionPerformed(evt);
            }
        });

        btnFacturar.setBackground(new java.awt.Color(153, 204, 255));
        btnFacturar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFacturar.setText("Facturar");
        btnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtProductos.setColumns(20);
        txtProductos.setRows(5);
        jScrollPane1.setViewportView(txtProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(btnCargarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(160, 160, 160)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFacturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnCargarProducto)
                    .addComponent(btnFacturar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();// TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnCargarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarProductoActionPerformed
        cargarProducto();// TODO add your handling code here:
    }//GEN-LAST:event_btnCargarProductoActionPerformed

    private void btnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarActionPerformed
        String clienteNombre = usuario.getNombreCompleto();
        String clienteTelefono = usuario.getTelefono();
        String clienteDireccion = usuario.getDireccion();
        Factura factura = new Factura(clienteNombre, clienteTelefono, clienteDireccion);
        for (Producto p : productosCargados) {
            factura.agregarProducto(p, p.getCantidadComprada()); // Asegúrate de que la cantidad comprada sea correcta
        }
        new VentanaGenerarFactura((ArrayList<Producto>) productosCargados, clienteNombre, clienteTelefono, clienteDireccion).setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btnFacturarActionPerformed

    private void cargarProducto() {
        String codigo = txtCodigoProducto.getText();
        int cantidadSolicitada = Integer.parseInt(txtCantidad.getText());
    
    // Busca el producto en el inventario
    Producto producto = buscarProducto(codigo);
    if (producto != null && producto.getCantidad() >= cantidadSolicitada) {
        // Reduce la cantidad del producto
        producto.setCantidad(producto.getCantidad() - cantidadSolicitada);
        // Establece la cantidad comprada
        producto.setCantidadComprada(cantidadSolicitada);
        
        // Agrega el producto cargado a la lista
        productosCargados.add(producto);
        
        // Actualiza el inventario en el archivo o la base de datos
        ProductoDAO.actualizarProducto(producto); // Asegúrate de implementar este método
        
        // Actualiza la visualización en el área de texto
        double totalProducto = producto.getPrecioVenta() * cantidadSolicitada;
        txtProductos.append("Producto: " + producto.getNombre() + " | Cantidad: " + cantidadSolicitada + " | Precio unitario: " + producto.getPrecioVenta() + " | Precio total: " + totalProducto + "\n");
    } else {
        JOptionPane.showMessageDialog(this, "Producto no encontrado o cantidad insuficiente.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    // Limpiar campos
    txtCodigoProducto.setText("");
    txtCantidad.setText("");
}
    private Producto buscarProducto(String codigo) {
        // Implementa la lógica para buscar el producto en el inventario
        ArrayList<Producto> productos = ProductoDAO.obtenerProductos(); // Suponiendo que esta función devuelve productos
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
    private void salir() {
        Usuario usuario = new Usuario(); 
        new VentanaMenuPrincipal( usuario).setVisible(true);
        dispose();
    }
    public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(VentanaCrearFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    // Inicializa el usuario antes de crear la ventana
    Usuario usuario = new Usuario(); // Cambia los valores según sea necesario
    java.awt.EventQueue.invokeLater(() -> new VentanaCrearFactura(usuario).setVisible(true));
}
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarProducto;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextArea txtProductos;
    // End of variables declaration//GEN-END:variables
}
