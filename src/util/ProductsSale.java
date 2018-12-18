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
    private boolean flag;
    
    public void addProduct(ProductSale product) {
        flag = true;
        try {
            for (int i=0; i<products.size(); i++) {
                if (product.getProductID().equals(products.get(i).getProductID())) {
                    products.get(i).addQuantity();
                    flag = false;
                }
            }
        } catch (Exception e) {
        }
        if (flag) {
            System.out.println("6666");
            products.add(product);
        }
        
    }
    
    public ArrayList<ProductSale> getProducts() {
        return products;
    }
    
    public int size() {
        return products.size();
    }
    
}
