/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Passawit
 */
public class Config {
    private final String HOST = "localhost";
    private final int PORT = 27017;
    private final String DB = "jstock";

    public String getHOST() {
        return HOST;
    }

    public String getDB() {
        return DB;
    }

    public int getPORT() {
        return PORT;
    }
    
}
