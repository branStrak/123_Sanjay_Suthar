/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

/**
 *
 * @author admin
 */
@Stateless
@LocalBean
public class ProductBean {

    public void addProduct() {
        try {
            Connection con = DBConnection.getConn();
            Statement st = con.createStatement();
            st.executeUpdate("insert into product values(1,'Shirt',500,10,1)");
            System.out.println("Product Added");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}