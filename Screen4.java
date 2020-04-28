package screen4;

import javax.swing.*;

public class Screen4  extends JFrame {
   JLabel l;
   JLabel l1;
   JLabel l2;
   JLabel l3;
   JLabel l4;
   JLabel l5;
   JLabel l6;
   JLabel l7;
   JLabel l8;
   JLabel l9;
   JLabel l10;
   JLabel l11;
   JLabel l12;
   Screen4()
   {
       setLayout(null);
       l=new JLabel("ADD LIBRARIAN");
       l.setBounds(150,10,100,50);
       add(l);
       l1=new JLabel("FIRST NAME:");
       l1.setBounds(0,60,100,50);
       add(l1);
       l2=new JLabel("LAST NAME:");
       l2.setBounds(0,110,100,50);
       add(l2);
       l3=new JLabel("DATE OF BIRTH:");
       l3.setBounds(0,160,100,50);
       add(l3);
       l4=new JLabel("EMAIL ID:");
       l4.setBounds(0,210,100,50);
       add(l4);
       l5=new JLabel("MOBILE NUMBER:");
       l5.setBounds(0,260,100,50);
       add(l5);
       l6=new JLabel("GENDER:");
       l6.setBounds(0,310,100,50);
       add(l6);
       l7=new JLabel("ADDRESS:");
       l7.setBounds(0,360,100,50);
       add(l7);
       l8=new JLabel("CITY");
       l8.setBounds(0,410,100,50);
       add(l8);
       l9=new JLabel("PIN CODE");
       l9.setBounds(0,460,100,50);
       add(l9);
       l10=new JLabel("STATE");
       l10.setBounds(0,510,100,50);
       add(l10);
       l11=new JLabel("COUNTRY");
       l11.setBounds(0,560,100,50);
       add(l11);
       l12=new JLabel("HOBBIES");
       l12.setBounds(0,610,100,50);
       add(l12);
    
    }
    public static void main(String[] args) {
    Screen4 s4=new Screen4();
    s4.setSize(700,700);
    s4.setVisible(true);
        
    }
    
}
