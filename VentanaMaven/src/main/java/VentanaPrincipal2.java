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
        frame.setSize(900,760);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

        /*private static class fondoPanel extends JPanel
        {
            private final Image Image;
            private Image banner;

            public fondoPanel()
                {
                    Image=new ImageIcon(getClass().getResource("fondo.jpg")).getImage();
                }
            @Override
            public void paintComponents(Graphics g)
                {
                    super.paintComponent(g);
                    g.drawImage(banner,0,0,getWidth(),getHeight(),this);
                }
        }*/
    }

