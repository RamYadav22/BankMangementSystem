/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import javax.swing.*;
import java.util.*;

import java.awt.event.*;

public class SignupOne extends JFrame implements   ActionListener
{
    
     long random;
       JTextField fnameTextField,nameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
       JDateChooser dateChooser;
       JButton next;
       JRadioButton male,female,married,unmarried,other;
    SignupOne(){
       
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong()% 9000L) + 1000L);
        
        JLabel formno = new JLabel("APPLICATIO FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        JLabel personDetails = new JLabel("Page 1: Personal Details");
        personDetails.setFont(new Font("Raleway",Font.BOLD,38));
        personDetails.setBounds(240,80,600,30);
        add(personDetails);
        
         JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,200,30);
        add(name);
        
         nameTextField = new JTextField();
        nameTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300,140,300,30);
        add(nameTextField);
        
        
        JLabel fname = new JLabel(" Father Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(90,190,600,30);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        fnameTextField.setBounds(300,190,300,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("DOB:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,600,30);
        add(dob);
        
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,300,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
         JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,600,30);
        add(gender);
        
         male  = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
         female  = new JRadioButton("Female");
           female.setBounds(450,290,120,30);
           female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        JLabel email = new JLabel("Email:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,600,30);
        add(email);
        
         emailTextField = new JTextField();
        emailTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        emailTextField.setBounds(300,340,300,30);
        add(emailTextField);
        
         JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,600,30);
        add(marital);
        
         married = new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        add(married);
        
          unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
         other = new JRadioButton("Other");
        other.setBounds(600,390,120,30);
        other.setBackground(Color.WHITE);
        add(other);
        
            ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,600,30);
        add(address);
        
    
           addressTextField = new JTextField();
        addressTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        addressTextField.setBounds(300,440,300,30);
        add(addressTextField);
        
        
         JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,600,30);
        add(city);
        
          cityTextField = new JTextField();
        cityTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        cityTextField.setBounds(300,490,300,30);
        add(cityTextField);
        
         JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,600,30);
        add(state);
        
         stateTextField = new JTextField();
        stateTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        stateTextField.setBounds(300,540,300,30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pincode");
        
        pincode.setFont(new  Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,590,600,30);
        add(pincode);
        
          pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font ("Raleway", Font.BOLD,14));
        pincodeTextField.setBounds(300,590,300,30);
        add(pincodeTextField);
        
        
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14) );
        next.setBounds(650,630,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
        
        

}
    
    
    public void actionPerformed(ActionEvent ae){
        
        String formno = "" + random;  // long value
        String name = nameTextField.getText(); // value nikal skte j
        String fname = fnameTextField.getText();
        
        String dob = ((JTextField )dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if( male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
        
        gender = " Female";
        
    }
        String email = emailTextField.getText();
        
        String marital = null;
        
        if(married.isSelected()){
            marital = "Married";
        }
        
        else if(unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if(other.isSelected()){
            
            marital = "Other";
            
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();
        
        
        
        try {
            
            if( name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            
            else {
                Conn c = new Conn();
                String query = "insert into signup value('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')"; 
                
                c.s.executeUpdate(query);
                
                setVisible(false);
                
                new SignupTwo(formno).setVisible(true);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        
        
    }
        
    
    public static void main(String args[]){
        new SignupOne();
    }
    
}
