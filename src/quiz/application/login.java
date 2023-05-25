
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener{
    JButton rules,exit;
    JTextField tFname;
    login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,1040,700);
        add(image);
        JLabel heading=new JLabel("knowledge check");
        heading.setBounds(390,60,300,45);
        heading.setFont(new Font("Georgia",Font.BOLD,30));
        heading.setForeground(Color.BLACK);
        add(heading);
        JLabel name=new JLabel("Enter your name please");
        name.setBounds(425,125,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(Color.BLACK);
        add(name);
        tFname=new JTextField();
        tFname.setBounds(390,175,280,20);
        add(tFname);
        rules=new JButton("Rules");
        rules.setBounds(410,210,100,20);
        rules.addActionListener(this);
        add(rules);
        exit=new JButton("exit");
        exit.setBounds(530,210,100,20);
        exit.addActionListener(this);
        add(exit);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name=tFname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource() == exit){
            setVisible(false);
        }
        
    }
    public static void main(String[] args){
       new login();
    }
}
