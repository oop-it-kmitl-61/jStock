/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Passawit
 */
public class TransactionsUtil {

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
                stock.editProduct(product.getProductID(), product.getProductName(), product.getProductPrice(), amount, product.getProductBrand(), product.getProductType());
            }

            BasicDBObject date = new BasicDBObject();
            date.put("day", t.getDay());
            date.put("month", t.getMonth());
            date.put("year", t.getYear());
            String sDate = t.getDay() + "/" + t.getMonth() + "/" + t.getYear();
            
            BasicDBObject newTransaction = new BasicDBObject();
            newTransaction.put("transactionID", t.getTransactionID());
            newTransaction.put("date", date);
            newTransaction.put("sDate", sDate);
            newTransaction.put("time", t.getTime());
            newTransaction.put("total", t.getTotal());
            newTransaction.put("products", productsObj);
            
            transactions.insert(newTransaction);
            new User().updateTransactionCount();
        }

        return flag;
    }
    
    public DBCollection getTransactions() {
        return transactions;
    }
    
    public Transaction getTransaction(String id) {
        DBObject query = new BasicDBObject("transactionID", id);
        DBCursor curs = transactions.find(query);
        DBObject obj = (DBObject) curs.next();
        DBObject date = (DBObject) obj.get("date");
        ArrayList<BasicDBObject> products = (ArrayList<BasicDBObject>) (DBObject) obj.get("products");
                
        return new Transaction((String)obj.get("transactionID"),
                               (String)date.get("day"),
                               (String)date.get("month"),
                               (String)date.get("year"),
                               (String)obj.get("time"),
                               (double)obj.get("total"),
                               products);
    }
}
