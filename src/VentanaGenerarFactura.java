import javax.swing.*;
import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class VentanaGenerarFactura extends javax.swing.JFrame {
private ArrayList<Producto> productosComprados; // Lista de productos comprados
    private String clienteNombre;
    private String clienteTelefono;
    private String clienteDireccion;
    private double descuentoPorcentaje;
    
    // Datos del local comercial
    private String nombreEmpresa = "Fidecompras";
    private String lugar = "Alajuela, City Mall";
    private String cedulaJuridica = "3-0210-39322";
    private String telefono = "2436-0809";
    
    
    public VentanaGenerarFactura(ArrayList<Producto> productosComprados, String nombreCliente, String telefonoCliente, String direccionCliente) {
        this.productosComprados = productosComprados;
        this.clienteNombre = nombreCliente;
        this.clienteTelefono = telefonoCliente;
        this.clienteDireccion = direccionCliente;
        initComponents();
        cargarDatosFactura();
        // Inicializar los JLabel con los datos del local
    lblNombreEmpresa.setText("Nombre de la Empresa: " + nombreEmpresa);
    lblCedulaJuridica.setText("Cédula Jurídica: " + cedulaJuridica);
    lblTelefono.setText("Teléfono: " + telefono);
    lblLugar.setText("Ubicación: " + lugar);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombreEmpresa = new javax.swing.JLabel();
        lblCedulaJuridica = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblLugar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        texNombreCliente = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        texTelefonoCliente = new javax.swing.JTextArea();
        texDireccionCliente = new javax.swing.JTextArea();
        texNumeroFactura = new javax.swing.JTextArea();
        texFechaFactura = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        texSubtotal = new javax.swing.JTextArea();
        btnAplicarDescuento = new javax.swing.JButton();
        btnImprimirFactura = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbeProductosComprados = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtPorcentajeDescuento = new javax.swing.JTextField();
        texIVA = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        texDescuento = new javax.swing.JTextArea();
        texTotalFactura = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreEmpresa.setText("Fidecompro S.A.");

        lblCedulaJuridica.setText("Cedula juridica");

        lblTelefono.setText("Teléfono");

        lblLugar.setText("Ubicación");

        jLabel5.setText("Factura de Contado");

        jLabel6.setText("Factura N°: ");

        jLabel7.setText("Fecha: ");

        texNombreCliente.setColumns(20);
        texNombreCliente.setRows(5);

        jLabel8.setText("Datos del cliente");

        jLabel9.setText("Cliente");

        jLabel10.setText("Tel:");

        jLabel11.setText("Direccion:");

        texTelefonoCliente.setColumns(20);
        texTelefonoCliente.setRows(5);

        texDireccionCliente.setColumns(20);
        texDireccionCliente.setRows(5);

        texNumeroFactura.setColumns(20);
        texNumeroFactura.setRows(5);

        texFechaFactura.setColumns(20);
        texFechaFactura.setRows(5);

        jLabel12.setText("Descuento:");

        texSubtotal.setColumns(20);
        texSubtotal.setRows(5);

        btnAplicarDescuento.setBackground(new java.awt.Color(153, 153, 255));
        btnAplicarDescuento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAplicarDescuento.setText("Agregar ");
        btnAplicarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarDescuentoActionPerformed(evt);
            }
        });

        btnImprimirFactura.setBackground(new java.awt.Color(16, 64, 9));
        btnImprimirFactura.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImprimirFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnImprimirFactura.setText("Imprimir");
        btnImprimirFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFacturaActionPerformed(evt);
            }
        });

        tbeProductosComprados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Producto", "Cantidad", "Precio unit", "Subtotal producto"
            }
        ));
        jScrollPane1.setViewportView(tbeProductosComprados);

        jLabel13.setText("Subtotal:");

        texIVA.setColumns(20);
        texIVA.setRows(5);

        jLabel16.setText("IVA 13%:");

        jLabel17.setText("Descuento:");

        texDescuento.setColumns(20);
        texDescuento.setRows(5);

        texTotalFactura.setColumns(20);
        texTotalFactura.setRows(5);

        jLabel18.setBackground(new java.awt.Color(232, 232, 232));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Total: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(texSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(texTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(texIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombreEmpresa)
                                .addComponent(jLabel8)
                                .addComponent(lblCedulaJuridica)
                                .addComponent(lblTelefono)
                                .addComponent(lblLugar)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(texDireccionCliente))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(texTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(texNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(texNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(texFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPorcentajeDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnAplicarDescuento))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(115, 115, 115)
                                    .addComponent(btnImprimirFactura))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCedulaJuridica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLugar)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(texNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(texFechaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPorcentajeDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAplicarDescuento))
                        .addGap(19, 19, 19)
                        .addComponent(btnImprimirFactura))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(texNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(texDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texTotalFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFacturaActionPerformed
        imprimirFactura();
} 

private void imprimirFactura() {
    PrinterJob job = PrinterJob.getPrinterJob();
    job.setPrintable(new Printable() {
        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            if (pageIndex > 0) {
                return NO_SUCH_PAGE;
            }

            Graphics2D g2d = (Graphics2D) graphics;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            int y = 20;
            g2d.drawString(nombreEmpresa, 100, y); // Centro la empresa
            y += 20;

            g2d.drawString("Cédula Jurídica: " + cedulaJuridica, 20, y);
            g2d.drawString("Factura de Contado", 300, y); // Alineado a la derecha
            y += 20;

            g2d.drawString("Teléfono: " + telefono, 20, y);
            g2d.drawString("Factura N°: " + texNumeroFactura.getText(), 300, y); // Alineado a la derecha
            y += 20;

            g2d.drawString("Ubicación: " + lugar, 20, y);
            g2d.drawString("Fecha: " + texFechaFactura.getText(), 300, y); // Alineado a la derecha
            y += 30;

            // Mostrar datos del cliente
            g2d.drawString("Cliente: " + clienteNombre, 20, y);
            y += 20;
            g2d.drawString("Teléfono: " + clienteTelefono, 20, y);
            y += 20;
            g2d.drawString("Dirección: " + clienteDireccion, 20, y);
            y += 30;

            // Imprimir productos comprados
            DefaultTableModel model = (DefaultTableModel) tbeProductosComprados.getModel();
            g2d.drawString("Productos Comprados:", 20, y);
            y += 20;

            for (int i = 0; i < model.getRowCount(); i++) {
                String codigo = model.getValueAt(i, 0).toString();
                String producto = model.getValueAt(i, 1).toString();
                String cantidad = model.getValueAt(i, 2).toString();
                String precio = model.getValueAt(i, 3).toString();
                String subtotal = model.getValueAt(i, 4).toString();
                g2d.drawString("Código: " + codigo + ", Producto: " + producto +
                               ", Cantidad: " + cantidad + ", Precio: " + precio +
                               ", Subtotal: " + subtotal, 20, y);
                y += 20;
            }
            y += 20; // Aumenta el espacio

            // Totales
            g2d.drawString("\nSubtotal: " + texSubtotal.getText(), 300, y);
            y += 20;
            g2d.drawString("IVA: " + texIVA.getText(), 300, y);
            y += 20;
            g2d.drawString("Descuento: " + texDescuento.getText(), 300, y);
            y += 20;
            g2d.drawString("Total: " + texTotalFactura.getText(), 300, y);

            return PAGE_EXISTS;
        }
    });

    boolean doPrint = job.printDialog();
    if (doPrint) {
        try {
            job.print();
            JOptionPane.showMessageDialog(this, "Factura impresa correctamente.");
            salir(); // Cierra la ventana
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(this, "Error al imprimir la factura: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnImprimirFacturaActionPerformed

    private void btnAplicarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarDescuentoActionPerformed
        aplicarDescuento();
    }//GEN-LAST:event_btnAplicarDescuentoActionPerformed

    private void cargarDatosFactura() {
        texNombreCliente.setText(clienteNombre);
        texTelefonoCliente.setText(clienteTelefono);
        texDireccionCliente.setText(clienteDireccion);
        texNumeroFactura.setText(String.valueOf(Factura.getContadorFactura())); // Obtiene el número de factura
        texFechaFactura.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date())); // Fecha actual

        // Cargar productos en la tabla
        DefaultTableModel model = (DefaultTableModel) tbeProductosComprados.getModel();
        for (Producto p : productosComprados) {
            model.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getCantidadComprada(), p.getPrecio(), p.getCantidadComprada()* p.getPrecio()} ); // Asumiendo cantidad 
        }
        
        // Mostrar datos del local comercial
        mostrarDatosLocal();
        
        // Calcular y mostrar totales
        calcularTotales();
    }
    private void mostrarDatosLocal() {
        // Mostrar información del local comercial en algún componente si es necesario
        // Aquí puedes usar un JTextArea o JLabel para mostrar información
        System.out.println("Nombre de la Empresa: " + nombreEmpresa);
        System.out.println("Lugar: " + lugar);
        System.out.println("Cédula Jurídica: " + cedulaJuridica);
        System.out.println("Teléfono: " + telefono);
    }

    private void calcularTotales() {
        double subtotal = 0;
    for (Producto p : productosComprados) {
        subtotal += p.getPrecio() * p.getCantidadComprada(); // Asumiendo cantidad comprada correcta
    }
    double iva = subtotal * 0.13; // IVA del 13%
    double descuento = subtotal * (descuentoPorcentaje / 100);
    double total = subtotal + iva - descuento;

    texSubtotal.setText(String.valueOf(subtotal));
    texIVA.setText(String.valueOf(iva));
    texDescuento.setText(String.valueOf(descuento)); // Mostrar el descuento calculado
    texTotalFactura.setText(String.valueOf(total));
}
    private void salir() {
        new VentanaInicioSesion().setVisible(true); // Cambia a VentanaInicioSesion
        dispose(); // Cierra la ventana actual
    }

    private void aplicarDescuento() {
        try {
        descuentoPorcentaje = Double.parseDouble(txtPorcentajeDescuento.getText());
        // Validar que el descuento esté entre 0 y 100
        if (descuentoPorcentaje < 0 || descuentoPorcentaje > 100) {
            throw new NumberFormatException();
        }
        calcularTotales(); // Recalcular totales después de aplicar el descuento
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Porcentaje de descuento inválido. Debe estar entre 0 y 100.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> {
            // Esta es una prueba para mostrar la ventana con datos de ejemplo.
            ArrayList<Producto> productosEjemplo = new ArrayList<>();
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarDescuento;
    private javax.swing.JButton btnImprimirFactura;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedulaJuridica;
    private javax.swing.JLabel lblLugar;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tbeProductosComprados;
    private javax.swing.JTextArea texDescuento;
    private javax.swing.JTextArea texDireccionCliente;
    private javax.swing.JTextArea texFechaFactura;
    private javax.swing.JTextArea texIVA;
    private javax.swing.JTextArea texNombreCliente;
    private javax.swing.JTextArea texNumeroFactura;
    private javax.swing.JTextArea texSubtotal;
    private javax.swing.JTextArea texTelefonoCliente;
    private javax.swing.JTextArea texTotalFactura;
    private javax.swing.JTextField txtPorcentajeDescuento;
    // End of variables declaration//GEN-END:variables
}
