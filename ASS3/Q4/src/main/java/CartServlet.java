/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.mycompany.ejb.CartBean;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(urlPatterns = {"/CartServlet"})


public class CartServlet extends HttpServlet {

    CartBean cart = new CartBean();

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        cart.addItem("Book1");
        cart.addItem("Book2");

        res.getWriter().println("Items added to cart");
    }
}