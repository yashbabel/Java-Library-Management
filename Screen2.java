package screen1;

import javax.swing.*;

public class Screen2 extends JFrame {
    
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JTextField t;
    JPasswordField p;
    JButton b;
    Screen2()
    {
        setLayout(null);
        l1=new JLabel("Admin Login Form",JLabel.CENTER);
        l1.setBounds(150,10,300,50);
        add(l1);
        l2=new JLabel("Enter Name:",JLabel.LEFT);
        l2.setBounds(50,70,200,50);
        add(l2);
        l3=new JLabel("Enter Password:",JLabel.LEFT);
        l3.setBounds(50,130,200,50);
        add(l3);
        t=new JTextField();
        t.setBounds(250,70,200,50);
        add(t);
        p=new JPasswordField();
        p.setBounds(250,130,200,50);
        add(p);   
        b=new JButton("Login");
        b.setBounds(250,190,100,50);
        add(b);
    }
    public static void main(String[] args) {
        Screen2 s2=new Screen2();
        s2.setSize(600,600);
        s2.setVisible(true);
    }   
}
