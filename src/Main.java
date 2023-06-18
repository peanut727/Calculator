import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JTextField textF1;

    private JButton a1;
    private JPanel Calculator;
    private JButton clearBTN;
    private JButton a2;
    private JButton a3;
    private JButton a4;
    private JButton a5;
    private JButton a6;
    private JButton a7;
    private JButton a8;
    private JButton a9;
    private JButton dot;
    private JButton a0;
    private JButton aEqual;
    private JButton add;
    private JButton subtract;
    private JButton multiply;
    private JButton divide;

    // Buttons

    double x, y, answer;
    String op;

    public double addd(){

        answer = x + y;
        return answer;

    }
    public double subtractt(){

        answer = x - y;
        return answer;
    }
    public double multiplyy(){

        answer = x * y;
        return answer;
    }
    public double dividee(){

        answer = x / y;
        return answer;
    }

    public Main()  {

        //Clear Button
        clearBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textF1.setText("");
            }
        });
        // Buttons
        a1.addActionListener(new ButtonListener(textF1));
        a2.addActionListener(new ButtonListener(textF1));
        a3.addActionListener(new ButtonListener(textF1));
        a4.addActionListener(new ButtonListener(textF1));
        a5.addActionListener(new ButtonListener(textF1));
        a6.addActionListener(new ButtonListener(textF1));
        a7.addActionListener(new ButtonListener(textF1));
        a8.addActionListener(new ButtonListener(textF1));
        a9.addActionListener(new ButtonListener(textF1));
        a0.addActionListener(new ButtonListener(textF1));
        dot.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textF1.setText(textF1.getText() + dot.getText());
            }
        });

        // Arithmetic Button
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textF1.getText());
                op = "+";
                textF1.setText("");
            }
        });

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textF1.getText());
                op = "-";
                textF1.setText("");
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textF1.getText());
                op = "x";
                textF1.setText("");
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = Double.parseDouble(textF1.getText());
                op = "/";
                textF1.setText("");
            }
        });

        aEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                y = Double.parseDouble(textF1.getText());

                if (op == "+"){
                    addd();
                    textF1.setText(String.valueOf(answer));
                }else if (op == "-"){
                    subtractt();
                    textF1.setText(String.valueOf(answer));
                }else if ( op == "x"){
                    multiplyy();
                    textF1.setText(String.valueOf(answer));
                }else if (op == "/"){
                    dividee();
                    textF1.setText(String.valueOf(answer));
                }

            }
        });
    }
    public static void main (String[] args){
        JFrame f = new JFrame("Reniel's Calculator");
        f.setContentPane(new Main().Calculator);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.pack();
        f.setVisible(true);
    }
}



