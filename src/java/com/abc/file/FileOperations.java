/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.file;

import com.abc.products.Product;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TJR
 */
public class FileOperations {

    /**
     * Scans for a file in the following format
     * id
     * price
     * name
     * descripation
     * image location
     * @param fileName
     * @return 
     */
    public ArrayList<Product> readProductContentFromFile(String fileName) {
        ArrayList<Product> productList = new ArrayList<>();
        Scanner in;
        try {
            in = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound " + ex);
            return null;
        }
        while(in.hasNextLine()){
            Product product = new Product();
            product.setId(Integer.parseInt(in.nextLine()));
            product.setPrice(Integer.parseInt(in.nextLine()));
            product.setName(in.nextLine());
            product.setDescription(in.nextLine());
            product.setImage(in.nextLine());
            
            
            
        }
        
        return productList;
    }
}
