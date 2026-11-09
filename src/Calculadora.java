//programa principal

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora {
  
    public static void main(String[] args) {
        //creating a window
        JFrame window = new JFrame("Calculadora");
        window.setSize(300,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creating a panel - painel = where things are inserted.
        JPanel panel = new JPanel();
        JButton botao = new JButton("1");

        //adding an action to a  button (EventListener)
        botao.addActionListener(new ActionListener() {
             @Override//reescrevendo uma acao
             public void actionPerformed(ActionEvent e) {
                System.out.println("= 1");
             }
        });

        panel.add(botao);
        window.add(panel);

        //window activiting
        window.setVisible(true);
    }
}