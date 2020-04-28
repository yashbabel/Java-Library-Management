package screen1;

import javax.swing.*;

public class Screen5 extends JFrame {

    JLabel l;
    JLabel l1;
    JLabel l2;
    JTextField t1;
    JPasswordField p;
    JButton b;
    Screen5()
    {
        setLayout(null);
        l=new JLabel("LIBRARIAN LOGIN FORM");
        l.setBounds(150,10,300,50);
        add(l);
        l1=new JLabel("Enter Name:");
        l1.setBounds(10,70,100,50);
        add(l1);
        l2=new JLabel("Enter Password:");
        l2.setBounds(10,130,100,50);
        add(l2);
        t1=new JTextField("");
        t1.setBounds(110,70,200,50);
        add(t1);
        p=new JPasswordField("");
        p.setBounds(110,130,200,50);
        add(p);
        b=new JButton("Login");
        b.setBounds(100,200,100,50);
        add(b);
    }
    public static void main(String[] args) {
        Screen5 s5=new Screen5();
        s5.setSize(400,400);
        s5.setVisible(true);
    }
    
}
