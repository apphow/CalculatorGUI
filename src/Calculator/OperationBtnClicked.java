package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationBtnClicked implements ActionListener {

    private Operation operation;


    public OperationBtnClicked(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
