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
public class OperationBean {

    public void processMessage(String msg) {

        System.out.println("Received: " + msg);

        String[] parts = msg.split(":");

        String op = parts[0];   // I / U / D
        String table = parts[1];

        if(op.equals("I")) {
            System.out.println("Insert into " + table);
        }
        else if(op.equals("U")) {
            System.out.println("Update " + table);
        }
        else if(op.equals("D")) {
            System.out.println("Delete from " + table);
        }
    }

    public static void main(String[] args) {
        OperationBean ob = new OperationBean();
        ob.processMessage("I:emp:name,sal:john,2000");
    }
}
