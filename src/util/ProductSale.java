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
public class ProductSale {
    private Stock stock = new Stock();
    private String productID;
    private String productName;
    private double productPrice;
    private int productAmount;
    private int quantity;
    private double amount;
    private String productBrand;
    private String productType;
    
    public ProductSale(String productID, int quantity) {
        this.productID = productID;
        this.productName = stock.getProduct(productID).getProductName();
        this.productPrice = stock.getProduct(productID).getProductPrice();
        this.productAmount = stock.getProduct(productID).getProductAmount();
        this.quantity = quantity;
        this.productBrand = stock.getProduct(productID).getProductBrand();
        this.productType = stock.getProduct(productID).getProductType();
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

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return quantity * productPrice;
    }
    
    public void addQuantity() {
        this.quantity++;
    }

}
