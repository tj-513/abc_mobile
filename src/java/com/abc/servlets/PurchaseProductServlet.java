/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.servlets;

import com.abc.database.DBOperations;
import com.abc.products.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TJR
 */
@WebServlet(name = "PurchaseProductServlet", urlPatterns = {"/PurchaseProductServlet"})
public class PurchaseProductServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method. Extracts product ID from GET
     * request and queries database to obtain more info about the product
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        int productId = Integer.parseInt(id);
        DBOperations dbOps = new DBOperations(); //instantiate dboperations object
        Product product = dbOps.getProductDetailsByID(productId);//retrieved product
        ArrayList<Product> products;
        //attaches product info to jsp
        if (product == null) {
            request.setAttribute("product", new Product(-1, "No Such Product found", 0, "", "notfound.jpg"));
            products = dbOps.getAllProductsList();
        } else {
            request.setAttribute("product", product);
            products = dbOps.getProductDetails(product.getManufacturer());
            //if products are not enough to fill out related products list
            //which has a maximum of four, append some more to products
            if(products.size() < 4)
              products.addAll(dbOps.getAllProductsList(4 - products.size()));
            
            
            
        }
        //attach related products list
        request.setAttribute("products", products);
        request.getRequestDispatcher("purchase.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
