import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField textfield;
    JButton[] numButtons = new JButton[10];
    JButton[] funcButtons = new JButton[8];
    JButton addButton, subButton, multButton, divButton;
    JButton decButton, eqlButton, delButton, clrButton;
    JPanel panel;

    double num1=0, num2=0, result=0;
    char operator;

    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(new Font("Serif", Font.BOLD, 30));
        textfield.setEditable(false); //prevents user from typing into the textbox

        addButton = new JButton("+");
        subButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqlButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = multButton;
        funcButtons[3] = divButton;
        funcButtons[4] = decButton;
        funcButtons[5] = eqlButton;
        funcButtons[6] = delButton;
        funcButtons[7] = clrButton;

        for(int i = 0; i < 8; i++) {
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFont(new Font("Serif", Font.BOLD, 30));
            funcButtons[i].setFocusable(false);
        }

        for(int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));

            numButtons[i].addActionListener(this);
            numButtons[i].setFont(new Font("Serif", Font.BOLD, 30));
            numButtons[i].setFocusable(false);
        }

        delButton.setBounds(50, 430, 145,50);
        clrButton.setBounds(205,430,145,50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.GRAY);

        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
