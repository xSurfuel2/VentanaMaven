import javax.swing.*;

public class VentanaPrincipal {
    private JPanel JPanel1;
    private JLabel Image1;
    private JTextField textField1;
    private JRadioButton acceptAMTermsRadioButton;
    private JButton signInButton;
    private JPasswordField passwordField1;
    private JCheckBox acceptToReceiveEmailsCheckBox;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setSize(600,600); //Cambia el tamaño de la ventana
        frame.setLocationRelativeTo(null); //Centra la ventana en la pantalla
        frame.setResizable(false); //Evita que la ventana sea ampliable

    }

}
