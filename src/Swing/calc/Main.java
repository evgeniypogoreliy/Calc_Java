package Swing.calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    static double num1 = 0;
    static double num2 = 0;
    static double res = 0;
    static String action = "";

    public static void main(String[] args) {
        JFrame calc = new JFrame();


        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton div = new JButton("/");
        JButton multi = new JButton("*");
        JButton equal = new JButton("=");
        JButton zap = new JButton("C");


        JLabel cons = new JLabel();
        cons.setFont(new Font("", Font.BOLD, 20));

        JPanel textPanel = new JPanel();
        textPanel.setBackground(Color.yellow);
        textPanel.setPreferredSize(new Dimension(100, 50));
        textPanel.add(cons);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4));
        buttonPanel.setPreferredSize(new Dimension(300,220));

        buttonPanel.add(eight);
        buttonPanel.add(nine);
        buttonPanel.add(div);
        buttonPanel.add(multi);
        buttonPanel.add(seven);
        buttonPanel.add(six);
        buttonPanel.add(five);
        buttonPanel.add(minus);
        buttonPanel.add(four);
        buttonPanel.add(three);
        buttonPanel.add(two);
        buttonPanel.add(plus);
        buttonPanel.add(one);
        buttonPanel.add(zero);
        buttonPanel.add(zap);
        buttonPanel.add(equal);

        calc.add(buttonPanel, BorderLayout.SOUTH);
        calc.add(textPanel);
        calc.setTitle("Мой калькулятор");
        calc.setSize(300,300);
        calc.setVisible(true);
        calc.setResizable(false);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);

        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  if(e.getSource() == eight){
                      cons.setText(cons.getText() + "8");
                  }
            }
        });

        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == nine){
                    cons.setText(cons.getText() + "9");
                }
            }
        });

        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == seven){
                    cons.setText(cons.getText() + "7");
                }
            }
        });

        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == six){
                    cons.setText(cons.getText() + "6");
                }
            }
        });

        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == five){
                    cons.setText(cons.getText() + "5");
                }
            }
        });

        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == four){
                    cons.setText(cons.getText() + "4");
                }
            }
        });

        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == three){
                    cons.setText(cons.getText() + "3");
                }
            }
        });

        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == two){
                    cons.setText(cons.getText() + "2");
                }

            }
        });

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == one){
                    cons.setText(cons.getText() + "1");
                }

            }
        });

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == zero) {
                    cons.setText(cons.getText() + "0");
                }
            }
        });

        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(cons.getText());
                if(action == "plus"){
                    res = num1 + num2;
                }
                if(action == "minus"){
                    res = num1 - num2;
                }
                if(action == "multi"){
                    res = num1 * num2;
                }
                if(action == "div"){
                    res = num1 / num2;
                }

                cons.setText(String.valueOf(res));

            }
        });

        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cons.getText());
                action = "plus";
                cons.setText("");

            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cons.getText());
                action = "minus";
                cons.setText("");

            }
        });

        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cons.getText());
                action = "div";
                cons.setText("");

            }
        });

        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(cons.getText());
                action = "multi";
                cons.setText("");

            }
        });

        zap.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == zap){
                    cons.setText("");
                    num1 = 0;
                    num2 = 0;
                    action = "";
                }

            }
        });
    }
}

