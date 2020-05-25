package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberBtnClicked implements ActionListener {

    private String value;
    private Double xOperand;
    private Double yOperand;
    private JTextField results;

    public NumberBtnClicked(String value) {
        this.value = value;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(xOperand == null || yOperand == 0.0) {
            value = results.getText() + value;
        } else {
            yOperand = Double.valueOf(value);
        }
        results.setText(value);

        }
    }

