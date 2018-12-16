/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Passawit
 */
public class DateLabel extends Thread {

    private JLabel date;
    private JLabel time;

    public DateLabel(JLabel date, JLabel time) {
        this.date = date;
        this.time = time;
    }

    public void run() {
        try {
            while (true) {
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date date = new Date();
                this.date.setText(dateFormat.format(date));
                
                DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                Date time = new Date();
                this.time.setText(timeFormat.format(time));
                
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

}
