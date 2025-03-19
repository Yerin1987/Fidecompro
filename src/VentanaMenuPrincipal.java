
import javax.swing.JOptionPane;


public class VentanaMenuPrincipal extends javax.swing.JFrame {
    private Usuario usuario;

   
    public VentanaMenuPrincipal(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        jLabel1.setText("Bienvenido " + usuario.getNombreCompleto());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnVentas.setText("Ventas");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblBienvenidoLayout = new javax.swing.GroupLayout(lblBienvenido);
        lblBienvenido.setLayout(lblBienvenidoLayout);
        lblBienvenidoLayout.setHorizontalGroup(
            lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblBienvenidoLayout.createSequentialGroup()
                .addGroup(lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lblBienvenidoLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(lblBienvenidoLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVentas)
                            .addComponent(btnInventario))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        lblBienvenidoLayout.setVerticalGroup(
            lblBienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblBienvenidoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas)
                .addGap(0, 220, Short.MAX_VALUE))
        );

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new VentanaMenuPrincipal(new Usuario("Nombre", "ID", "Telefono", "Direccion", "Contrasena")).setVisible(true));  }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel lblBienvenido;
    // End of variables declaration//GEN-END:variables
}
