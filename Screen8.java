package screen1;

import javax.swing.*;

public class Screen8 extends JFrame{
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
    JButton b1;
    JButton b2;
    Screen8()
    {
        setLayout(null);
        l=new JLabel("Issue Book");
        l.setBounds(150,10,100,50);
        add(l);
        l1=new JLabel("Book Call No:");
        l1.setBounds(10,70,100,50);
        add(l1);
        l2=new JLabel("Student ID:");
        l2.setBounds(10,130,100,50);
        add(l2);
        l3=new JLabel("Student Name:");
        l3.setBounds(10,190,100,50);
        add(l3);
        l4=new JLabel("Student Contact:");
        l4.setBounds(10,250,100,50);
        add(l4);
        l5=new JLabel("Note: Please check Student ID carefully before Issuing book!!");
        l5.setBounds(0,430,400,50);
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
        b1=new JButton("Issue Book");
        b1.setBounds(150,370,100,50);
        add(b1);
        b2=new JButton("Back");
        b2.setBounds(480,500,100,50);
        add(b2);
    }
    public static void main(String[] args) {
        Screen8 s8=new Screen8();
        s8.setSize(600,600);
        s8.setVisible(true);
    }
    
}
