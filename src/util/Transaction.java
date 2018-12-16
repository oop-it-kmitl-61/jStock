/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Passawit
 */
public class Transaction {
    private String transactionID;
    private String day;
    private String month;
    private String year;
    private String time;
    private double total;
    private ArrayList<ProductSale> products;

    public Transaction(String transactionID, ProductsSale products) {
        this.transactionID = transactionID;
        
        SimpleDateFormat dayD = new SimpleDateFormat("dd");
        this.day = dayD.format(new Date());
        SimpleDateFormat monthD = new SimpleDateFormat("MM");
        this.month = monthD.format(new Date());
        SimpleDateFormat yearD = new SimpleDateFormat("yyyy");
        this.year = yearD.format(new Date());
        SimpleDateFormat timeD = new SimpleDateFormat("HH:mm:ss");
        this.time = timeD.format(new Date());
        
        this.products = products.getProducts();
        for (int i = 0; i < products.getProducts().size(); i++) {
            ProductSale product = products.getProducts().get(i);
            total += product.getAmount();
        }
    }

    public String getTransactionID() {
        return transactionID;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getTime() {
        return time;
    }

    public double getTotal() {
        return total;
    }

    public ArrayList<ProductSale> getProducts() {
        return products;
    }
    
}
