import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import java.awt.Font;
public class CalculaTHOR {
    private JFrame frame;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalculaTHOR window = new CalculaTHOR();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the application.
     */
    public CalculaTHOR() {
        initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.activeCaption);
        frame.setBackground(SystemColor.activeCaption);
        frame.setBounds(100, 100, 343, 580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JTextPane caja = new JTextPane();
        caja.setEnabled(false);
        caja.setFont(new Font("Arial", Font.PLAIN, 20));
        caja.setBounds(8, 10, 311, 118);
        frame.getContentPane().add(caja);
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaption);
        panel.setBounds(8, 138, 311, 393);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        JButton btnNewButton = new JButton("C");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText("");
            }
        });
        btnNewButton.setBounds(8, 23, 69, 63);
        panel.add(btnNewButton);
        JButton btnNewButton_1 = new JButton("/");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                primernumero=Float.parseFloat(caja.getText());
                operador="/";
                caja.setText("");
            }
        });
        btnNewButton_1.setBounds(85, 23, 69, 63);
        panel.add(btnNewButton_1);
        JButton btnNewButton_2 = new JButton("*");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                primernumero=Float.parseFloat(caja.getText());
                operador="*";
                caja.setText("");
            }
        });
        btnNewButton_2.setBounds(162, 23, 69, 63);
        panel.add(btnNewButton_2);
        JButton btnNewButton_3 = new JButton("-");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                primernumero=Float.parseFloat(caja.getText());
                operador="-";
                caja.setText("");
            }
        });
        btnNewButton_3.setBounds(239, 23, 69, 63);
        panel.add(btnNewButton_3);
        JButton btnNewButton_4 = new JButton("7");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"7");
            }
        });
        btnNewButton_4.setBounds(8, 96, 69, 63);
        panel.add(btnNewButton_4);
        JButton btnNewButton_5 = new JButton("8");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"8");
            }
        });
        btnNewButton_5.setBounds(85, 96, 69, 63);
        panel.add(btnNewButton_5);
        JButton btnNewButton_6 = new JButton("9");
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"9");
            }
        });
        btnNewButton_6.setBounds(162, 96, 69, 63);
        panel.add(btnNewButton_6);
        JButton btnNewButton_7 = new JButton("4");
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"4");
            }
        });
        btnNewButton_7.setBounds(8, 169, 69, 63);
        panel.add(btnNewButton_7);
        JButton btnNewButton_8 = new JButton("5");
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"5");
            }
        });
        btnNewButton_8.setBounds(85, 169, 69, 63);
        panel.add(btnNewButton_8);
        JButton btnNewButton_9 = new JButton("6");
        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"6");
            }
        });
        btnNewButton_9.setBounds(162, 169, 69, 63);
        panel.add(btnNewButton_9);
        JButton btnNewButton_10 = new JButton("1");
        btnNewButton_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"1");
            }
        });
        btnNewButton_10.setBounds(8, 242, 69, 63);
        panel.add(btnNewButton_10);
        JButton btnNewButton_11 = new JButton("2");
        btnNewButton_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"2");
            }
        });
        btnNewButton_11.setBounds(85, 242, 69, 63);
        panel.add(btnNewButton_11);
        JButton btnNewButton_12 = new JButton("3");
        btnNewButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"3");
            }
        });
        btnNewButton_12.setBounds(162, 242, 69, 63);
        panel.add(btnNewButton_12);
        JButton btnNewButton_13 = new JButton("0");
        btnNewButton_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja.setText(caja.getText()+"0");
            }
        });
        btnNewButton_13.setBounds(8, 315, 146, 63);
        panel.add(btnNewButton_13);
        JButton btnNewButton_12_1 = new JButton(".");
        btnNewButton_12_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!(caja.getText().contains("."))) {
                    caja.setText(caja.getText()+".");
                }
            }
        });
        btnNewButton_12_1.setBounds(162, 315, 69, 63);
        panel.add(btnNewButton_12_1);
        JButton btnNewButton_12_2 = new JButton("+");
        btnNewButton_12_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                primernumero=Float.parseFloat(caja.getText());
                operador="+";
                caja.setText("");
            }
        });
        btnNewButton_12_2.setBounds(239, 96, 69, 136);
        panel.add(btnNewButton_12_2);
        JButton btnNewButton_12_2_1 = new JButton("=");
        btnNewButton_12_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                segundonumero=Float.parseFloat(caja.getText());
                switch(operador) {
                    case"+":
                        caja.setText(Float.toString(primernumero+segundonumero));
                        break;
                    case"*":
                        caja.setText(Float.toString(primernumero*segundonumero));
                        break;
                    case"-":
                        caja.setText(Float.toString(primernumero-segundonumero));
                        break;
                    case"/":
                        caja.setText(Float.toString(primernumero/segundonumero));
                        break;
                }
            }
        });
        btnNewButton_12_2_1.setBounds(239, 242, 69, 136);
        panel.add(btnNewButton_12_2_1);
    }
    public float primernumero;
    public float segundonumero;
    public String operador;
}