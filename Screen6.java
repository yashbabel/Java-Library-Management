package screen1;

import javax.swing.*;

public class Screen6 extends JFrame {
    JLabel l;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    Screen6()
    {
        setLayout(null);
        l=new JLabel("Librarian Section-MITHIBAI");
        l.setBounds(200,10,200,50);
        add(l);
        b1=new JButton("Add Books");
        b1.setBounds(200,70,150,50);
        add(b1);
        b2=new JButton("View Books");
        b2.setBounds(200,130,150,50);
        add(b2);
        b3=new JButton("Issue Book");
        b3.setBounds(200,190,150,50);
        add(b3);
        b4=new JButton("View Issued Books");
        b4.setBounds(200,250,150,50);
        add(b4);
        b5=new JButton("Return Books");
        b5.setBounds(200,310,150,50);
        add(b5);
        b6=new JButton("Logout");
        b6.setBounds(200,370,150,50);
        add(b6);
        
    }
    public static void main(String[] args) {
        Screen6 s6=new Screen6();
        s6.setSize(550,500);
        s6.setVisible(true);
    }
    
}
