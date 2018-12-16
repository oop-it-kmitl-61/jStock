/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mongodb.*;

/**
 *
 * @author Passawit
 */
public class User {

    private final Database db = new Database();
    private final DBCollection userColl = db.getCollection("user");

    public void insertUser(String name, String password, int productCount, int transactionCount) {
        BasicDBObject newUser = new BasicDBObject();
        newUser.put("name", name);
        newUser.put("password", password);
        newUser.put("productCount", productCount);
        newUser.put("transactionCount", transactionCount);

        userColl.insert(newUser);
    }

    public void updateUser(String name, String password, int productCount, int transactionCount) {
        BasicDBObject user = new BasicDBObject();
        user.put("name", name);
        user.put("password", password);
        user.put("productCount", productCount);
        user.put("transactionCount", transactionCount);

        BasicDBObject searchQuery = (BasicDBObject) userColl.findOne();

        userColl.update(searchQuery, user);
    }

    public boolean haveUser() {
        return userColl.findOne() != null;
    }
    
    public String getProductID() {
        String id = String.format("%05d", getProductCount());
        updateUser(getName(), getPassword(), (getProductCount()+1), getTransactionCount());
        return id;
    }
    
    public String getTransactionID() {
        String id = String.format("%09d", getTransactionCount());
        return id;
    }
    
    public void updateTransactionCount() {
        updateUser(getName(), getPassword(), getProductCount(), (getTransactionCount()+1));
    }

    public String getName() {
        return (String) userColl.findOne().get("name");
    }

    public String getPassword() {
        return (String) userColl.findOne().get("password");
    }

    public int getProductCount() {
        return (int) userColl.findOne().get("productCount");
    }

    public int getTransactionCount() {
        return (int) userColl.findOne().get("transactionCount");
    }

}
