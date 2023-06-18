import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField textField;
    public ButtonListener(JTextField textField) {
        this.textField = textField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();
        textField.setText(textField.getText() + buttonText);
    }
}

