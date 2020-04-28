package screen1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class Screen1 extends JFrame{
    JButton b1;
    JButton b2;
    JLabel l;
    Screen1()
    {
        setLayout(null);
        l=new JLabel("LIBRARY MANAGEMENT-MITHIBAI COLLEGE");
        l.setBounds(100,50,300,100);
        b1=new JButton("Admin Login");
        b1.setBounds(100,150,300,50);
        b2=new JButton("Librarian Login");
        b2.setBounds(100,250,300,50);
        add(b1);
        add(b2);
        add(l);
    }
    public static void main(String[] args) {
        Screen1 d =new Screen1();
        d.setSize(500,500);
        d.setVisible(true);
    }
    
}
