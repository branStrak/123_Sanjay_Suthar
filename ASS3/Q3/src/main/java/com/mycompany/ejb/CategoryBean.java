/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.mycompany.ejb;


/**
 *
 * @author admin
 */
import java.sql.*;


public class CategoryBean {

    public void addCategory() {
        try {
            Connection con = DBConnection.getConn();
            Statement st = con.createStatement();
            st.executeUpdate("insert into category values(1,'Clothing')");
            System.out.println("Category Added");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}