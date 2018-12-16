/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mongodb.*;
import java.util.*;

/**
 *
 * @author Passawit
 */
public class Stock {

    private final Database db = new Database();
    private final DBCollection stockColl = db.getCollection("stock");
    private User user = new User();
    private DBCursor cursor = stockColl.find();

    private ArrayList<Product> products = new ArrayList<>();

    public Stock() {
        while (cursor.hasNext()) {
            DBObject product = cursor.next();
            products.add(new Product((String) product.get("productID"),
                                     (String) product.get("productName"),
                                     (double) product.get("productPrice"),
                                     (int) product.get("productAmount")));
        }
    }

    public void addProduct(String productID, String productName, double productPrice, int productAmount) {
        BasicDBObject newProduct = new BasicDBObject();
        newProduct.put("productID", productID);
        newProduct.put("productName", productName);
        newProduct.put("productPrice", productPrice);
        newProduct.put("productAmount", productAmount);

        stockColl.insert(newProduct);
    }

    public void editProduct(String productID, String productName, double productPrice, int productAmount) {
        BasicDBObject newProduct = new BasicDBObject();
        newProduct.put("productID", productID);
        newProduct.put("productName", productName);
        newProduct.put("productPrice", productPrice);
        newProduct.put("productAmount", productAmount);

        DBObject query = new BasicDBObject("productID", productID);
        DBCursor cursor = stockColl.find(query);
        BasicDBObject searchQuery = (BasicDBObject) cursor.next();

        stockColl.update(searchQuery, newProduct);
    }
    
    public void deleteProduct(String productID) {
        DBObject query = new BasicDBObject("productID", productID);
        stockColl.remove(query);
    }
    
    public Product getProduct(String productID) {
        DBObject query = new BasicDBObject("productID", productID);
        DBCursor cursor = stockColl.find(query);
        DBObject obj = cursor.next();
        
        Product product = new Product((String) obj.get("productID"),
                                      (String) obj.get("productName"),
                                      (double) obj.get("productPrice"),
                                      (int) obj.get("productAmount"));
        
        return product;
    }
    
    public ArrayList<Product> getProducts() {
        return products;
    }

}
