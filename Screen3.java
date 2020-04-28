package screen1;

import javax.swing.*;

public class Screen3 extends JFrame{
    JLabel l;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    Screen3()
    {
        setLayout(null);
        l=new JLabel("ADMIN SECTION");
        l.setBounds(100,20,200,70);
        add(l);
        b1=new JButton("Add Librarian");
        b1.setBounds(50,100,200,50);
        add(b1);
        b2=new JButton("View Librarian");
        b2.setBounds(50,160,200,50);
        add(b2);
        b3=new JButton("Delete Librarian");
        b3.setBounds(50,220,200,50);
        add(b3);
        b4=new JButton("Logout");
        b4.setBounds(50,280,200,50);
        add(b4);
    }
    public static void main(String[] args) {
        Screen3 s3=new Screen3();
        s3.setSize(600,600);
        s3.setVisible(true);
    }
    
}
