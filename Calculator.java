import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton addButton, subButton, mulButton, divButton, sqrtButton;
    private JButton decimalButton, equalsButton, deleteButton, clearButton;
    private JPanel panel;

    private double num1=0, num2=0, result=0;
    private char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }}