import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons= new JButton[10];
    JButton[] functionButtons= new JButton[10];
    JButton addButton, subButton, mulButton, divButton, sqrtButton;
    JButton decimalButton, equalsButton, deleteButton, clearButton;
    JPanel panel;

    Font myFont= new Font("Ink Free", Font.BOLD,30);


    double num1=0, num2=0, result=0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);


        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decimalButton = new JButton(".");
        equalsButton = new JButton("=");
       clearButton = new JButton("CLEAR");
       deleteButton = new JButton("DELETE");

        functionButtons[0]= addButton;
        functionButtons[1]= subButton;
        functionButtons[2]= mulButton;
        functionButtons[3]= divButton;
        functionButtons[4]= decimalButton;
        functionButtons[5]= equalsButton;
        functionButtons[6]= clearButton;
        functionButtons[7]= deleteButton;

        for(int i=0; i < 8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }
        for(int i=0; i< 10; i++)
        {
            numberButtons[i]= new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }


        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }}