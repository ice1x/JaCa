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
    private int counter = 0;
    private int buf = 0;
    private JLabel countLabel;
    private JButton One;
    private JButton Two;
    private JButton Plus;
    private JButton Equal;
    private JButton Clear;
    
    private void updateCounter() {
        countLabel.setText(":" + counter);};
    
    public void actionPerformed(ActionEvent e){
        if(counter == 0)
        {
            counter = 1;
        }
        else
        {
            counter = counter * 10 + 1;
        }
        updateCounter();
        };
    
    public Calc(){
        super ("Calculator");
        countLabel = new JLabel("Result:" + counter);
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
                if(counter == 0){
                counter = 1;}
                else{
                counter = counter * 10 + 1;}
                updateCounter();
            }});
        
        Two.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(counter == 0){
                counter = 2;}
                else{
                counter = counter * 10 + 2;}
                updateCounter();
            }});
        Plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buf = counter;
                counter = 0;
                updateCounter();
            }});
        Equal.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                counter = counter + buf;
                updateCounter();
            }});
        Clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                counter = 0;
                buf = 0;
                updateCounter();
            }});
        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}