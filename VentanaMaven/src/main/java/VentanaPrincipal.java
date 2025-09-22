import javax.swing.*;

public class VentanaPrincipal {
    private JPanel JPanel1;
    private JLabel Image1;
    private JTextField textField1;
    private JRadioButton acceptAMTermsRadioButton;
    private JButton signInButton;
    private JPasswordField passwordField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
