import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal3");
        frame.setContentPane(new VentanaPrincipal3().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(900,600);
        frame.setLocationRelativeTo(null);
    }

    private JPanel JPanel1;
    private JTabbedPane tabbedPane1;
    private JSpinner spinner1;
    private JPanel JTabbedPane1;

    // Constructor
    public VentanaPrincipal3() {
// Envolver el panel generado por IntelliJ dentro de un FondoPanel
        FondoPanel fondo = new FondoPanel();
        fondo.setLayout(new BorderLayout());
        JPanel1.setOpaque(false);
        fondo.add(JPanel1, BorderLayout.CENTER); // pongo el Jpane original encima del fondo
        JPanel1 = fondo; // reasigno para que el JFrame lo use
    }

    // Clase interna para el fondo
    private static class FondoPanel extends JPanel {
        private final Image imagen;

        public FondoPanel() {
            imagen = new ImageIcon(
                    "C:/Users/Usuario1/Documents/VentanaMaven/VentanaMaven/src/main/resources/image/gyarados.gif"
            ).getImage();
        }

        //Método para escalar la imagen a la ventana
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
