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
        File inputFile;
        try {
            inputFile = new  File(fileName);
            in = new Scanner(inputFile);
        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound " + ex);
            return null;
        }
        int count = Integer.parseInt(in.nextLine());
        System.out.println(inputFile.getAbsolutePath());

        while(count-->0){
            Product product = new Product();
            product.setId(Integer.parseInt(in.nextLine()));
            product.setPrice(Integer.parseInt(in.nextLine()));
            product.setName(in.nextLine());
            product.setDescription(in.nextLine());
            product.setImage(in.nextLine());
   
        }
        
        return productList;
    }
    
    
    ///main for testing 
    public static void main(String[] args) {
        FileOperations fo = new FileOperations();
        ArrayList <Product> products = fo.readProductContentFromFile("content.txt");
        System.out.println(products);
    }
}
