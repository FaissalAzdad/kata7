package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDialog;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame{
    private SwingMoneyDialog moneyDialog;
    private SwingMoneyDisplay moneyDisplay;

    public MainFrame() {
        setTitle("Money Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(MoneyDialog(), BorderLayout.NORTH);
        add(MoneyDisplay());
        add(toolbar(), BorderLayout.SOUTH);
        setVisible(true);
        
    }

    private Component MoneyDialog() {
        SwingMoneyDialog dialog = new SwingMoneyDialog();
        moneyDialog = dialog;
        return dialog;
    }

    private Component MoneyDisplay() {
        SwingMoneyDisplay display = new SwingMoneyDisplay();
        moneyDisplay = display;
        return display;
    }

    private Component toolbar() { 
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(calculatorButton());
        return panel;
    }

    private Component calculatorButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(calculate());
        return button;
    }

    private ActionListener calculate() {
        return new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                moneyDisplay.display(moneyDialog.get());
            }
            
        };
    }
    
}
