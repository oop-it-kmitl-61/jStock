/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author Passawit
 */
public class ProductsSale {
    private ArrayList<ProductSale> products = new ArrayList<>();
    
    public void addProduct(ProductSale product) {
        products.add(product);
    }
    
    public ArrayList<ProductSale> getProducts() {
        return products;
    }
    
    public int size() {
        return products.size();
    }
    
}
