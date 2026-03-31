/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addressbook;

/**
 *
 * @author admin
 */
import java.util.*;

class Address {
    String name;
    String phone;

    Address(String n, String p) {
        name = n;
        phone = p;
    }
}

public class AddressBook {
    public static void main(String[] args) {
        ArrayList<Address> list = new ArrayList<>();

        list.add(new Address("John", "12345"));
        list.add(new Address("Alice", "67890"));

        for (Address a : list) {
            System.out.println(a.name + " - " + a.phone);
        }
    }
}
