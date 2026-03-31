/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.mycompany.ejb;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
@Stateless
@LocalBean


public class CartBean {

    List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    public void showCart() {
        for(String i : items) {
            System.out.println(i);
        }
    }
}