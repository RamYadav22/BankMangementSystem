/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;
import java.sql.*;
/**
 *
 * @author dell
 */
public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        
        
        try{
            
           
            
             c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Ramyadav@1");
             
              s = c.createStatement();
              
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
    }
    
    public static void main(String[] args){
        
    }
    
}
