/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class User_defined_exception extends Exception {
    public User_defined_exception(String st,JFrame reg) 
    {
            if(st.equals("Wrong ID or password")){
            JOptionPane.showMessageDialog(reg, st, "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(st.equals("You must agree with the terms and conditions")){
               JOptionPane.showMessageDialog(reg, st, "Error", JOptionPane.ERROR_MESSAGE); 
            }
            if(st.equals("This e-mail is already used"))
            {
                JOptionPane.showMessageDialog(reg, st, "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(st.equals("You have already registered.You can register only once."))
            {
               JOptionPane.showMessageDialog(reg, st, "Error", JOptionPane.ERROR_MESSAGE);
               
            }
            if(st.equals("You have to provide all the information"))
            {
                JOptionPane.showMessageDialog(reg, st, "Error", JOptionPane.ERROR_MESSAGE);
            }
    }  
        
        
    
}
