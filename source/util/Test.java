/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mongodb.*;
import java.util.ArrayList;

/**
 *
 * @author Passawit
 */
public class Test {

    public static void main(String args[]) {
        ProductSale p = new ProductSale("00002", 1);
        ProductsSale ps = new ProductsSale();
        ps.addProduct(p);
        Transaction t = new Transaction("0001", ps);
        Transactions ts = new Transactions();
        ts.sale(t);
    
    
}

}
