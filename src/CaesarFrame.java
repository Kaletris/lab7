import javax.swing.*;
import java.awt.*;

public class CaesarFrame extends JFrame {
    JTextField textField1 = new JTextField(20);
    JTextField textField2 = new JTextField(20);
    JButton button = new JButton("Code");
    Object[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    JComboBox comboBox = new JComboBox(abc);

    public CaesarFrame(){
        setTitle("SwingLab");
        setSize(400, 110);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Output");
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        panel1.add(comboBox);
        panel1.add(textField1);
        panel1.add(button);
        panel2.add(label);
        panel2.add(textField2);
        textField2.setEditable(false);

        setResizable(true);
    }
}
