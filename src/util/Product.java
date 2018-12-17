/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Passawit
 */
public class Product {
    
    private String productID;
    private String productName;
    private double productPrice;
    private int productAmount;
    private String productBrand;
    private String productType;

    public Product(String productID, String productName, double productPrice, int productAmount, String productBrand, String productType) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
        this.productBrand = productBrand;
        this.productType = productType;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public String getProductType() {
        return productType;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductAmount() {
        return productAmount;
    }


}
