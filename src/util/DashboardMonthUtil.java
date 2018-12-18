/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.mongodb.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Passawit
 */
public class DashboardMonthUtil {

    SimpleDateFormat monthD = new SimpleDateFormat("MM");
    private String month = monthD.format(new Date());
    SimpleDateFormat yearD = new SimpleDateFormat("yyyy");
    private String year = yearD.format(new Date());

    private final Database db = new Database();
    private final DBCollection transactions = db.getCollection("transactions");
    private DBCursor curs = transactions.find();

    private double totalSale;
    private long totalOder = transactions.count();
    private long totalAmount;

    private List<List<String>> productCount = new ArrayList<>();
    private int last;

    final Comparator<List<String>> comparator = new Comparator<List<String>>() {
        public int compare(List<String> pList1, List<String> pList2) {
            return pList2.get(1).compareTo(pList1.get(1));
        }
    };

    public DashboardMonthUtil() {

        while (curs.hasNext()) {
            DBObject t = curs.next();
            DBObject date = (DBObject) t.get("date");
            if (check((String) date.get("month"), (String) date.get("year"))) {
                totalSale += (double) t.get("total");

                ArrayList<BasicDBObject> ps = (ArrayList<BasicDBObject>) (DBObject) t.get("products");
                ps.forEach((p) -> {
                    totalAmount += (int) p.get("quantity");

                    boolean flag = true;
                    try {
                        for (int i = 0; i < productCount.size(); i++) {
                            if (productCount.get(i).get(0).equals((String) p.get("productID"))) {
                                productCount.get(i).set(1, "" + (Integer.parseInt(productCount.get(i).get(1)) + 1));
                                flag = false;
                            }
                        }
                    } catch (Exception e) {
                    }
                    if (flag) {
                        last++;
                        List<String> newP = new ArrayList<>();
                        newP.add((String) p.get("productID"));
                        newP.add("1");
                        newP.add((String) p.get("productName"));
                        newP.add(""+last);
                        productCount.add(newP);
                    }
                });
            }
        }

        Collections.sort(productCount, comparator);
    }

    public List<List<String>> getProductCount() {
        return productCount;
    }

    private boolean check(String month, String year) {
        return this.month.equals(month) && this.year.equals(year);
    }

    public String getTotalSale() {
        return ""+totalSale;
    }

    public String getTotalOder() {
        return ""+totalOder;
    }

    public String getTotalAmount() {
        return ""+totalAmount;
    }
    
    public String getDate() {
        SimpleDateFormat mmmD = new SimpleDateFormat("MMM");
        String mmm = mmmD.format(new Date());
        return mmm + " " + year;
    }

}
