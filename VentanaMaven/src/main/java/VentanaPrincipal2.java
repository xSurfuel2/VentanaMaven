import javax.swing.*;

public class VentanaPrincipal2 {
    private JPanel JPanel2;
    private JRadioButton acceptSFTermsRadioButton;
    private JButton signInButton;
    private JPasswordField passwordField1;
    private JPanel JPanel1;
    private JComboBox comboBox1;
    private JRadioButton rememberUserRadioButton;
    private JTextField introduceTextField;
    private JLabel banner;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal2");
        frame.setContentPane(new VentanaPrincipal2().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,760); //Cambia el tamaño de la ventana
        frame.setResizable(false); //Evita que se pueda cambiar el tamaño de la ventana
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); //Centrar la ventana en la pantalla
    }

    }

