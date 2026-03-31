/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatable;

/**
 *
 * @author admin
 */
interface Featurable {
    void setColor(String color);
}

class TableException extends Exception {
    TableException(String msg) {
        super(msg);
    }
}

public class DataTable implements Featurable {
    int rows, cols;

    DataTable(int r, int c) throws TableException {
        if (r > 200 || c > 200) {
            throw new TableException("Too big table");
        }
        rows = r;
        cols = c;
    }

    public void setColor(String color) {
        System.out.println("Color set: " + color);
    }

    public static void main(String[] args) {
        try {
            DataTable t = new DataTable(10, 10);
            t.setColor("Red");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}