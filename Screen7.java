package screen1;

import javax.swing.*;

public class Screen7 extends JFrame {
    JLabel l;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JButton b1;
    JButton b2;
    int i;
    Screen7()
    {
        setLayout(null);
        l=new JLabel("Add Books");
        l.setBounds(150,10,100,50);
        add(l);
        l1=new JLabel("Call No:");
        l1.setBounds(10,70,100,50);
        add(l1);
        l2=new JLabel("Name:");
        l2.setBounds(10,130,100,50);
        add(l2);
        l3=new JLabel("Author:");
        l3.setBounds(10,190,100,50);
        add(l3);
        l4=new JLabel("Publisher:");
        l4.setBounds(10,250,100,50);
        add(l4);
        l5=new JLabel("Quantity");
        l5.setBounds(10,310,100,50);
        add(l5);
        t1=new JTextField("");
        t1.setBounds(120,70,200,50);
        add(t1);
        t2=new JTextField("");
        t2.setBounds(120,130,200,50);
        add(t2);
        t3=new JTextField("");
        t3.setBounds(120,190,200,50);
        add(t3);
        t4=new JTextField("");
        t4.setBounds(120,250,200,50);
        add(t4);
        t5=new JTextField("");
        t5.setBounds(120,310,200,50);
        add(t5);
        b1=new JButton("Add Book");
        b1.setBounds(150,370,100,50);
        add(b1);
        b2=new JButton("Back");
        b2.setBounds(480,490,100,50);
        add(b2);
    }
    public static void main(String[] args) {
        Screen7 s7=new Screen7();
        s7.setSize(600,600);
        s7.setVisible(true);
    }
    
}
