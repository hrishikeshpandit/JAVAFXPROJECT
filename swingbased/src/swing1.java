/**
 * Created by JAIME LANNISTER on 3/24/2017.
 */
import java.awt.Graphics.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.blue;

class sw1 extends JFrame implements ActionListener {
    JRadioButton b1;
    JButton b2;
    JButton b3;
    JLabel jlb,j1,j2,j3;
    String name;
    JTextField t1 ,t2,t3;
    sw1(){
        JFrame jf=new JFrame("frame program 7 part A");
        jf.setSize(500,500);
        jf.setLayout(new FlowLayout());
       // jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        b1= new JRadioButton("sum");
        b2= new JButton("average");
        b3= new JButton("largest");
        b1.addActionListener( this);
        b2.addActionListener( this);
        b3.addActionListener( this);
         j1=new JLabel("first number");
         j2=new JLabel("second number");
         j3=new JLabel("third number");
        t1=new JTextField(10);
        t2=new JTextField(10);
         t3=new JTextField(10);
         jf.add(j1);
         jf.add(t1);
        jf.add(j2);
        jf.add(t2);
        jf.add(j3);
        jf.add(t3);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jlb=new JLabel("hi");
        jf.add(jlb);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       
        if(ae.getActionCommand().equals("sum")){
            // name=ae.getActionCommand();
           /* int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=Integer.parseInt(t3.getText());
            int sum=a+b+c;
*/            //jlb.setText("the sum is"+sum);
            getContentPane().setBackground(Color.blue);
            setVisible(true);
        }
    }
    /*public void paint(Graphics g){
        super.paintComponent();
        if(name=="sum") rectangle = new g.drawRect(5, 5, 5, 5);

    }*/
}
public class swing1 {
    public static void main(String args[]){
        sw1 s=new sw1();
    }
}
