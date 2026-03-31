/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package com.test.ejb;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

/**
 *
 * @author admin
 */
@Stateless
@LocalBean
public class Subscriber3 {

    public void onMessage(String msg) {
        System.out.println("Subscriber3 received: " + msg);
    }
}