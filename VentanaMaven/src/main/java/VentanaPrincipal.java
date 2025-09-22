import javax.swing.*;

public class VentanaPrincipal {
    private JPanel JPanel1;
    private JLabel Image1;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton acceptAMTermsRadioButton;
    private JButton signInButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().JPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setVisible(true);
    }
//peit

}
