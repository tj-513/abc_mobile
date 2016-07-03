/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.database;

import com.abc.products.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TJR
 */
public class DBOperations {

    /**
     * Required instance variables for establishing database connection
     */
    //database url format, driver:provider:serverhost:port/databaseName
    String url = "jdbc:mysql://localhost:3306/abcmobile";
    String username = "root"; //default username root
    String password = "";//default password root
    Connection con = null; //Connection object
    PreparedStatement pst = null; //Statement to be prepared for queries
    ResultSet rs = null; //result of database query

    /**
     * Queries database for all products and returns a list of them
     *
     * @return arraylist of all products
     */
    public ArrayList<Product> getAllProductsList() {
        String query = "select * from phone;";
        return executeQuery(query);
    }

    /**
     * Queries database for specified manufacturer
     *
     * @param manufacturerName
     * @return ArrayList<Product> of products by the specified manufacturer
     */
    public ArrayList<Product> getProductDetails(String manufacturerName) {
        manufacturerName = manufacturerName.toLowerCase();
        String query = String.format("SELECT * FROM phone WHERE manufacturer='%s'", manufacturerName);
        return executeQuery(query);
    }

    /**
     * Queries database for specified product ID
     *
     * @param productID
     * @return Product object that matches specified product ID
     */
    public Product getProductDetailsByID(int productID) {
        String query = String.format("SELECT * FROM phone WHERE id='%d'", productID);
        ArrayList<Product> result = executeQuery(query);
        if(result != null && result.size()>0)
            return result.get(0);
        else
            return null;
    }

    /**
     * Internal method to encapsulate querying process
     * Returns empty arrayList size=0 if no match found
     * @param query query to be executed
     * @return Result as an ArrayList<Product> 
     */
    private ArrayList<Product> executeQuery(String query) {
        try {
            ArrayList<Product> products = new ArrayList<>();
            //establish connection            
            con = (Connection)DriverManager.getConnection(url, username, password);
            //prepare statement
            pst = (PreparedStatement) con.prepareStatement(query);
            //execute query , returns a resultset
            rs = pst.executeQuery();
            //add the results to products list
            while (rs.next()) {
                products.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("price"),
                        rs.getString("description"),
                        rs.getString("imageURL"),
                        rs.getString("manufacturer")));
            }
            con.close();

            return products;
        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    /**
     * Main method for testing method functionality
     *
     * @param args
     */
    public static void main(String[] args) {
        DBOperations testOps = new DBOperations();
        System.out.println("Retrieving all product details");
        ArrayList<Product> resultList = testOps.getAllProductsList();
        System.out.println(resultList);
        System.out.println("Success");
        
        System.out.println("Retrieving product with id 1");
        System.out.println(testOps.getProductDetailsByID(1));
        System.out.println("Success");
        
        System.out.println("Retrieving non existent product with id -1");
        System.out.println(testOps.getProductDetailsByID(-1));
        System.out.println("Success");
        
        System.out.println("Retrieving products by apple");
        System.out.println(testOps.getProductDetails("apple"));
        System.out.println("success");
        
        System.out.println("Retrieving products by non existent manufacturer");
        System.out.println(testOps.getProductDetails("fakemanu"));
        System.out.println("success");
    }
}
