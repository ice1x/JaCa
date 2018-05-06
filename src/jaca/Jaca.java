/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaca;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author cold00n
 */
public class Jaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calc app = new Calc(); //Создаем экземпляр нашего приложения
        app.setVisible(true); //С этого момента приложение запущено!
        app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
    }
    
}


class Calc extends JFrame {
    private int count = 0;
    private int buf = 0;
    private JLabel countLabel;
    private JButton One;
    private JButton Two;
    private JButton Plus;
    private JButton Equal;
    private JButton Clear;
    
    private void updateCounter() {
        count = count + buf;
        buf = 0;
        countLabel.setText(":" + count);}; 
    
    public Calc(){
        super ("Calculator");
        countLabel = new JLabel("Result:" + count);
        One = new JButton("1");
        Two = new JButton("2");
        Plus = new JButton("+");
        Equal = new JButton("=");
        Clear = new JButton("C");
        
        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout()); 
        //Расставляем компоненты по местам
        add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже
        
        buttonsPanel.add(One);
        buttonsPanel.add(Two);
        buttonsPanel.add(Plus);
        buttonsPanel.add(Equal);
        buttonsPanel.add(Clear);
        
        One.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buf = buf + 1;
                updateCounter();
            }});
        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}