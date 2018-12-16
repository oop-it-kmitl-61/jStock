/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Passawit
 */
public class Transactions {

    private final Database db = new Database();
    private final Stock stock = new Stock();
    private final DBCollection transactions = db.getCollection("transactions");

    public boolean sale(Transaction t) {
        boolean flag = true;
        ArrayList<ProductSale> products = t.getProducts();
        for (int i = 0; i < t.getProducts().size(); i++) {
            ProductSale product = products.get(i);
            if (product.getQuantity() > product.getProductAmount()) {
                flag = false;
            }
        }

        if (flag) {
            List<BasicDBObject> productsObj = new ArrayList<>();
            for (int i = 0; i < t.getProducts().size(); i++) {
                ProductSale product = products.get(i);
                
                BasicDBObject productObj = new BasicDBObject();
                productObj.put("productID", product.getProductID());
                productObj.put("productName", product.getProductName());
                productObj.put("productPrice", product.getProductPrice());
                productObj.put("quantity", product.getQuantity());
                productObj.put("amount", product.getAmount());
                
                productsObj.add(productObj);
                
                int amount = product.getProductAmount() - product.getQuantity();
                stock.editProduct(product.getProductID(), product.getProductName(), product.getProductPrice(), amount);
            }

            BasicDBObject date = new BasicDBObject();
            date.put("day", t.getDay());
            date.put("month", t.getMonth());
            date.put("year", t.getYear());
            
            BasicDBObject newTransaction = new BasicDBObject();
            newTransaction.put("transactionID", t.getTransactionID());
            newTransaction.put("date", date);
            newTransaction.put("time", t.getTime());
            newTransaction.put("total", t.getTotal());
            newTransaction.put("products", productsObj);
            
            transactions.insert(newTransaction);
            new User().updateTransactionCount();
        }

        return flag;
    }
}
