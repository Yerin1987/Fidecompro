
import javax.swing.JOptionPane;


public class VentanaMenuPrincipal extends javax.swing.JFrame {
    private Usuario usuario;

   
    public VentanaMenuPrincipal(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        jLabel1.setText("Bienvenido " + usuario.getNombreCompleto()+" a Fidecompras");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnInventario.setBackground(new java.awt.Color(102, 255, 102));
        btnInventario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 51), null, null));
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(0, 0, 255));
        btnVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 150), new java.awt.Color(0, 0, 153)));
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 0, 0)));
        jButton1.setLabel("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblBienvenidoLayout = new javax.swing.GroupLayout(lblBienvenido);
        lblBienvenido.setLayout(lblBienvenidoLayout);
        lblBienvenidoLayout.setHorizontalGroup(
            lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblBienvenidoLayout.createSequentialGroup()
                .addGroup(lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblBienvenidoLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(lblBienvenidoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(lblBienvenidoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        lblBienvenidoLayout.setVerticalGroup(
            lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblBienvenidoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(btnInventario)
                .addGap(18, 18, 18)
                .addComponent(btnVentas)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(0, 73, Short.MAX_VALUE))
        );

        btnInventario.getAccessibleContext().setAccessibleName("    Inventario   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        new VentanaInventario(usuario).setVisible(true);
                dispose(); 
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        new VentanaCrearFactura(usuario).setVisible(true);
                dispose();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new VentanaInicioSesion().setVisible(true); // Cambia a VentanaInicioSesion
        dispose(); // Cierra la ventana actual
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaMenuPrincipal(new Usuario("Nombre", "ID", "Telefono", "Direccion", "Contrasena")).setVisible(true));  }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel lblBienvenido;
    // End of variables declaration//GEN-END:variables
}
