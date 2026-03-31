/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/MessageServlet"})
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import mdb.*;

public class MessageServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        String msg = "Hello from Servlet";

        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
        Subscriber3 s3 = new Subscriber3();

        s1.onMessage(msg);
        s2.onMessage(msg);
        s3.onMessage(msg);

        res.getWriter().println("Message Sent to Subscribers");
    }
}