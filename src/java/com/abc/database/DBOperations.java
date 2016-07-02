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
    String url = "jdbc:mysql://localhost:3306/abcMobile";
    String username = "root"; //default username root
    String password = "";//default password root
    Connection con = null; //Connection object
    PreparedStatement pst = null; //Statement to be prepared for queries
    ResultSet rs = null; //result of database query
    /**
     *  Queries database for all products and returns a list of them
     * @return arraylist of all products
     */
    public ArrayList<Product> getAllProductsList(){
        try {
            ArrayList<Product> products = new ArrayList<>();
            rs = executeQuery("select * from phone");
            //add the results to products list
            while(!rs.next()){
                products.add(new Product(rs.getInt("id"),
                        rs.getString("name"), 
                        rs.getInt("price"),
                        rs.getString("description"),
                        rs.getString("imageURL"),
                        rs.getString("manufacturer")));
            }
            return products;
        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    /**
     * Internal method to encapsulate querying process
     * @param query query to be executed
     * @return Result as a ResultSet
     */
    private ResultSet executeQuery(String query){
        try {
            //establish connection            
            con = (Connection) DriverManager.getConnection(url, username, password);
            //prepare statement
            pst = (PreparedStatement)con.prepareStatement(query);
            //execute query , returns a resultset
            rs = pst.executeQuery();
            
            
            con.close();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DBOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
    }
}
