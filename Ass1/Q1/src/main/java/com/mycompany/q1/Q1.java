/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q1;

/**
 *
 * @author admin
 */
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        a.sound();

        Dog d = (Dog) a; // downcasting
        d.sound();
    }
}