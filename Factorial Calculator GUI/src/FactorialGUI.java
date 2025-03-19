import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.io.*;

public class FactorialGUI extends Exception {

    static int calculateFactorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Number must be greater than or equal to 0");
        }
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Factorial Calculator");
        frame.setSize(300, 300);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        menu.add(exitMenuItem);
        menuBar.add(menu);
        exitMenuItem.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        JMenu subMenu = new JMenu("Sub Menu");
        menu.add(subMenu);
        JMenuItem subMenuItem = new JMenuItem("Sub Menu Item");
        subMenu.add(subMenuItem);

        JLabel label = new JLabel("Enter a number:");
        label.setBounds(20, 20, 100, 30);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(120, 20, 100, 30);
        frame.add(textField);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(20, 150, 200, 50);
        frame.add(resultLabel);

        JRadioButton FactorialCheckBox = new JRadioButton("Factorial");
        FactorialCheckBox.setBounds(20, 90, 150, 50);
        frame.add(FactorialCheckBox);

        JRadioButton SquareCheckBox = new JRadioButton("Square");
        SquareCheckBox.setBounds(170, 90, 150, 50);
        frame.add(SquareCheckBox);

        ButtonGroup group = new ButtonGroup();
        group.add(FactorialCheckBox);
        group.add(SquareCheckBox);


        JButton button = new JButton("Calculate");
        button.setBounds(20, 60, 200, 30);
        frame.add(button);
        button.addActionListener((ActionEvent e) -> {
            if (FactorialCheckBox.isSelected()) {
                int number = Integer.parseInt(textField.getText());
                try {
                    int factorial = calculateFactorial(number);
                    resultLabel.setText("Factorial: " + factorial);
                } catch (Exception exp) {
                    resultLabel.setText(exp.getMessage());
                }
            } else if (SquareCheckBox.isSelected()) {
                int number = Integer.parseInt(textField.getText());
                int square = number * number;
                resultLabel.setText("Square: " + square);
            } else {
                resultLabel.setText("Please select an operation");
                System.out.println("Please select an operation");
            }
        });

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
