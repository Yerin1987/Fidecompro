
public class Main {
    public static void main(String[] args) {
        
        // Inicia la interfaz gráfica en el hilo de eventos de Swing
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicioSesion().setVisible(true);
            }
        });
    }
}