/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.*;

/**
 *
 * @author Passawit
 */
public class Loading extends Thread {
    private JLabel loading;
    private int sec;
    private JPanel window;
    private JPanel next;
    private String[] loads = {"", ".", "..", "..."};
    
    public Loading(JLabel loading, int sec, JPanel window, JPanel next) {
        this.loading = loading;
        this.sec = sec;
        this.window = window;
        this.next = next;
    }
    
    public void run() {
        try {
            for (int i=0; i<sec; i++) {
                for (int j=0; j<loads.length; j++) {
                    String set = "Loading " + loads[j];
                    this.loading.setText(set);
                    Thread.sleep(1000/loads.length);
                }
            }
            
            window.removeAll();
            window.repaint();
            window.revalidate();

            window.add(next);
            window.repaint();
            window.revalidate();
        } catch (Exception e) {
        }
    }
}
