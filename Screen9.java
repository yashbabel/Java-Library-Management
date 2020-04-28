package screen1;

import javax.swing.*;

public class Screen9 extends JFrame{
    JLabel l;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField t1;
    JTextField t2;
    JButton b1;
    JButton b2;
    Screen9()
    {
        setLayout(null);
        l=new JLabel("Return Book");
        l.setBounds(150,10,100,50);
        add(l);
        l1=new JLabel("Book Call No:");
        l1.setBounds(10,70,100,50);
        add(l1);
        l2=new JLabel("Student ID:");
        l2.setBounds(10,130,100,50);
        add(l2);
        l3=new JLabel("Note: Check the book properly!");
        l3.setBounds(0,260,300,50);
        add(l3);
        t1=new JTextField("");
        t1.setBounds(120,70,200,50);
        add(t1);
        t2=new JTextField("");
        t2.setBounds(120,130,200,50);
        add(t2);
        b1=new JButton("Issue Book");
        b1.setBounds(150,200,100,50);
        add(b1);
        b2=new JButton("Back");
        b2.setBounds(250,310,100,50);
        add(b2);
    }
    public static void main(String[] args) {
     Screen9 s9=new Screen9();
        s9.setSize(400,450);
        s9.setVisible(true);   
    }
    
}
