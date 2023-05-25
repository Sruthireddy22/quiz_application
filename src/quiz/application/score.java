
package quiz.application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class score extends JFrame implements ActionListener{
    score(String name,int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,750,250);
        add(image);
        JLabel heading=new JLabel("Thankyou "+ name + " for playing knowledge check");
        heading.setBounds(45,130,750,270);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));                               
        add(heading);
        setVisible(true);
        JLabel labelscore=new JLabel("your score is "+ score );
        labelscore.setBounds(45,180,750,270);
        labelscore.setFont(new Font("Tahoma",Font.PLAIN,24));                               
        add(labelscore);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }
   public static void main(String[] args){
       new score("user",0);
       
       
   } 
}
