import javax.swing.*;

public class VentanaPrincipal2 {
    private JPanel JPanel2;
    private JLabel Image1;
    private JTextField textField1;
    private JRadioButton acceptSFTermsRadioButton;
    private JButton signInButton;
    private JPasswordField passwordField1;
    private JPanel JPanel1;
    private JComboBox comboBox1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal2");
        frame.setContentPane(new VentanaPrincipal2().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}
