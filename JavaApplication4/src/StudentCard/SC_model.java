package StudentCard;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SC_model {
    private JPasswordField passwordField;
    private JCheckBox showPasswordCheckBox;

    public SC_model() {
        JFrame frame = new JFrame("Show Password Button Example");
        Container content = frame.getContentPane();
        content.setLayout(new FlowLayout());

        passwordField = new JPasswordField(20);
        content.add(passwordField);

        showPasswordCheckBox = new JCheckBox("Show password");
        
   //     showPasswordCheckBox.addActionListener(new ShowPasswordButtonAction());
        
        showPasswordCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
            }
        });
        content.add(showPasswordCheckBox);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    class ShowPasswordButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (showPasswordCheckBox.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }

    public static void main(String[] args) {
        new SC_model();
    }
}
