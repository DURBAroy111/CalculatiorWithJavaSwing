import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons= new JButton[10];
    JButton[] functionButtons= new JButton[10];
    JButton addButton, subButton, mulButton, divButton, sqrtButton;
    JButton decimalButton, equalsButton, deleteButton, clearButton, negButton;
    JPanel panel;

    Font myFont= new Font("Ink Free", Font.BOLD,30);


    double num1=0, num2=0, result=0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 650);
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
       clearButton = new JButton("AC");
       deleteButton = new JButton("Del");
       negButton = new JButton("(-)");
        sqrtButton = new JButton("Sqrt");

        functionButtons[0]= addButton;
        functionButtons[1]= subButton;
        functionButtons[2]= mulButton;
        functionButtons[3]= divButton;
        functionButtons[4]= decimalButton;
        functionButtons[5]= equalsButton;
        functionButtons[6]= clearButton;
        functionButtons[7]= deleteButton;
        functionButtons[8]= negButton;
        functionButtons[9] = sqrtButton;


        for(int i=0; i < 10; i++){
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
       // negButton.setBounds(50, 430, 100, 50);
        deleteButton.setBounds(50,490,150,50);
        clearButton.setBounds(200,490,150,50);
        negButton.setBounds(50, 430, 150, 50);
        sqrtButton.setBounds(200, 430, 150, 50);



        panel= new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.white);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decimalButton);
        panel.add(numberButtons[0]);
        panel.add(equalsButton);
        panel.add(divButton);


        frame.add(panel);
        frame.add(deleteButton);
        frame.add(negButton);
        frame.add(clearButton);
        frame.add(sqrtButton);
        frame.add(textField);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
       Calculator clac= new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          for(int j=0; j<10; j++){
              if(e.getSource()== numberButtons[j])
              {textField.setText(textField.getText().concat(String.valueOf(j)));}
          }
       if(e.getSource()== decimalButton){
           textField.setText(textField.getText().concat("."));
        }
        if(e.getSource()== addButton){
            num1 = Double.parseDouble(textField.getText());
            operator= '+';
            textField.setText("");
        }
        if(e.getSource()== subButton){
            num1 = Double.parseDouble(textField.getText());
            operator= '-';
            textField.setText("");
        }
        if(e.getSource()== mulButton){
            num1 = Double.parseDouble(textField.getText());
            operator= 'x';
            textField.setText("");
        }
        if(e.getSource()== divButton){
            num1 = Double.parseDouble(textField.getText());
            operator= '/';
            textField.setText("");
        }
        if(e.getSource()==equalsButton){
            num2= Double.parseDouble(textField.getText());

            switch (operator){
                case'+':
                    result = num1+num2;
                    break;

                case'-':
                    result = num1-num2;
                    break;

                case'x':
                    result = num1*num2;
                    break;

                case'/':
                    result = num1/num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1= result;
        }
        if(e.getSource()== clearButton){
            textField.setText("");
        }
        if(e.getSource()== deleteButton){
            String string = textField.getText();
            textField.setText("");
            for(int i=0; i<string.length()-1; i++)
            {
                textField.setText(textField.getText()+string.charAt(i) );
            }}
            if(e.getSource()== negButton){
                double temp = Double.parseDouble(textField.getText());
            temp*= -1;
            textField.setText(String.valueOf(temp));
        }
        if (e.getSource() == sqrtButton) {
            double number = Double.parseDouble(textField.getText());
            double result = Math.sqrt(number);
            textField.setText(String.valueOf(result));
        }
       }
     }
