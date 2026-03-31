/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q4;

/**
 *
 * @author admin
 */
import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Customer Form");

        JLabel l = new JLabel("Customer Name:");
        l.setBounds(50, 50, 150, 30);

        JTextField t = new JTextField();
        t.setBounds(200, 50, 150, 30);

        JButton b = new JButton("Save");
        b.setBounds(150, 100, 100, 30);

        f.add(l);
        f.add(t);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}