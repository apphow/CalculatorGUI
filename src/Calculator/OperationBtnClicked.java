package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationBtnClicked implements ActionListener {

    private Operation operation;
    private Operation calcOperation;
    private Double xOperand;
    private JTextField results;


    public OperationBtnClicked(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calcOperation = operation;
        xOperand = Double.valueOf(results.getText());
    }
}
