/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.test;

import jakarta.ejb.Stateless;
import java.sql.*;

/**
 *
 * @author admin
 */
@Stateless
public class currency implements currencyLocal {
double rate;
    @Override
    public double convert(String from, String to, double amount) {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sem8","root","");
            PreparedStatement ps =con.prepareStatement("select rate from currency_rate where from_currency=? and to_currency=?");
            ps.setString(1, from);
            ps.setString(2, to);
            
            ResultSet rs= ps.executeQuery();
            
            
            if(rs.next()){
                rate = rs.getDouble("rate");
                System.out.println("Rate found: " + rate);
               
            }
            con.close();
            
                    
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        return rate*amount;
    }

    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
