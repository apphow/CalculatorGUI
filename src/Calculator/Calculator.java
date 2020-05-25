package Calculator;

import javax.swing.*;

public class Calculator extends JFrame {
    private JPanel JavaCalculator;
    private JButton a0Button1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button1;
    private JButton a8Button1;
    private JButton a9Button1;

    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplicationButton;
    private JButton equalsButton;
    private JTextField Results;
    private JButton clearButton;
    private JButton signButton;
    private JButton percentButton;
    private JButton divisionButton;
    private JButton decimalButton;

    public Calculator(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(JavaCalculator);
        this.pack();

    }

    public Calculator() {
        a0Button1.addActionListener(new NumberBtnClicked(a0Button1.getText()));
        a1Button.addActionListener(new NumberBtnClicked(a1Button.getText()));
        a2Button.addActionListener(new NumberBtnClicked(a2Button.getText()));
        a3Button.addActionListener(new NumberBtnClicked(a3Button.getText()));
        a4Button.addActionListener(new NumberBtnClicked(a4Button.getText()));
        a5Button.addActionListener(new NumberBtnClicked(a5Button.getText()));
        a6Button.addActionListener(new NumberBtnClicked(a6Button.getText()));
        a7Button1.addActionListener(new NumberBtnClicked(a7Button1.getText()));
        a8Button1.addActionListener(new NumberBtnClicked(a8Button1.getText()));
        a9Button1.addActionListener(new NumberBtnClicked(a9Button1.getText()));


    }


    public static void main(String[] args) {
         JFrame frame = new JFrame("Calculator");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.pack();
         frame.setVisible(true);

    }
}

