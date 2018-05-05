/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaca;
import javax.swing.JFrame;

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
        MyWindowApp app = new MyWindowApp(); //Создаем экземпляр нашего приложения
        app.setVisible(true); //С этого момента приложение запущено!
    }
    
}

class MyWindowApp extends JFrame { //Наследуя от JFrame мы получаем всю функциональность окна

  public MyWindowApp(){
    super("My First Window"); //Заголовок окна
    setBounds(100, 100, 200, 200); //Если не выставить 
                                   //размер и положение 
                                   //то окно будет мелкое и незаметное
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при 
                                                    //закрытии окна закрывалась и программа,
                                                    //иначе она останется висеть в процессах
  }
}