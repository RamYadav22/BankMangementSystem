/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.util.*;

import java.awt.*;
import java.awt.event.*;
/**import 
 *
 * @author dell
 */
public class Deposit extends JFrame implements ActionListener{
    JTextField amount;
    JButton back,deposit;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber = pinnumber;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=  i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Enter your amount you want to  deposit");
        text.setForeground(Color.white);
        text.setFont(new Font("Sysytem",Font.BOLD,16));
        text.setBounds(170,185,400,20);
        image.add(text);
        
        
         amount = new JTextField();
        
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,220,300,25);
        image.add(amount);
        
        
         deposit = new JButton("Deposit");
        deposit.setBounds(400,390,100,25);
        deposit.addActionListener(this);
        image.add(deposit);
        
         back = new JButton("Back");
        back.setBounds(400,420,100,25);
         back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == deposit){
            
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"PLease enter the amount you want to deposit");
                
            }
            else{
                try{
                Conn conn = new Conn();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"','Deposit','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs" + number + "Deposited Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            }
                catch(Exception e){
                    System.out.println(e);
                }
            
        }
        }
        else if (ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Deposit("");
    }
    
}
