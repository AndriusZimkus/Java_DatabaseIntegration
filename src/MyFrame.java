import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    JTextField firstNameTextField;
    JTextField lastNameTextField;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");

        Dimension textFieldDimension = new Dimension(150, 25);

        firstNameTextField = new JTextField();
        lastNameTextField = new JTextField();
        firstNameTextField.setPreferredSize(textFieldDimension);
        lastNameTextField.setPreferredSize(textFieldDimension);

        this.getContentPane().add(firstNameLabel);
        this.getContentPane().add(firstNameTextField);
        this.getContentPane().add(lastNameLabel);
        this.getContentPane().add(lastNameTextField);

        this.setVisible(true);
    }
}
