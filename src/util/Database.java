/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mongodb.*;
import java.net.*;

/**
 *
 * @author Passawit
 */
public class Database {

    private Mongo mongo;

    public DBCollection getCollection(String name) {
        DBCollection coll = null;
        try {
            mongo = new Mongo();
            DB db = mongo.getDB("jstock");
            coll = db.getCollection(name);
        } catch (UnknownHostException ex) {
        }
        return coll;
    }

}
