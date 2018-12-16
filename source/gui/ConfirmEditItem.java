/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Passawit
 */
public class ConfirmEditItem extends javax.swing.JDialog {
    private String name;
    private String price;
    private String amount;

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final boolean RET_CANCEL = false;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final boolean RET_OK = true;

    /**
     * Creates new form Quit
     */
    public ConfirmEditItem(String name, String price, String amount) {
        initComponents();
        this.name = name;
        this.price = price;
        this.amount = amount;
        tfMyName.setText(name);
        tfMyPrice.setText(price);
        tfMyAmount.setText(amount);

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public boolean getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        description = new javax.swing.JLabel();
        tfName = new javax.swing.JLabel();
        tfPrice = new javax.swing.JLabel();
        tfAmount = new javax.swing.JLabel();
        tfMyName = new javax.swing.JLabel();
        tfMyPrice = new javax.swing.JLabel();
        tfMyAmount = new javax.swing.JLabel();
        bnCancel = new javax.swing.JButton();
        bnEdit = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(332, 214));
        setMinimumSize(new java.awt.Dimension(332, 214));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(332, 214));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        bg.setMaximumSize(new java.awt.Dimension(332, 214));
        bg.setMinimumSize(new java.awt.Dimension(332, 214));
        bg.setSize(new java.awt.Dimension(332, 214));

        description.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        description.setText("Edit product in stock");

        tfName.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        tfName.setText("Name:");

        tfPrice.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        tfPrice.setText("Price:");

        tfAmount.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        tfAmount.setText("Amount:");

        tfMyName.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        tfMyName.setText("Product Name");

        tfMyPrice.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        tfMyPrice.setText("6969");

        tfMyAmount.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        tfMyAmount.setText("56");

        bnCancel.setText("Cancel");
        bnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCancelActionPerformed(evt);
            }
        });

        bnEdit.setText("Edit");
        bnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(bnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(description)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrice)
                            .addComponent(tfAmount)
                            .addComponent(tfName))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfMyPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfMyAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        bgLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bnCancel, bnEdit});

        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(description)
                        .addGap(18, 18, 18)
                        .addComponent(tfName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAmount))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(tfMyName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMyPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfMyAmount)))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnEdit)
                    .addComponent(bnCancel))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEditActionPerformed
        doClose(RET_OK);
    }//GEN-LAST:event_bnEditActionPerformed

    private void bnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCancelActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_bnCancelActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog
    
    private void doClose(boolean retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    public void init() {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfirmEditItem dialog = new ConfirmEditItem(name, price, amount);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton bnCancel;
    private javax.swing.JButton bnEdit;
    private javax.swing.JLabel description;
    private javax.swing.JLabel tfAmount;
    private javax.swing.JLabel tfMyAmount;
    private javax.swing.JLabel tfMyName;
    private javax.swing.JLabel tfMyPrice;
    private javax.swing.JLabel tfName;
    private javax.swing.JLabel tfPrice;
    // End of variables declaration//GEN-END:variables

    private boolean returnStatus = RET_CANCEL;
}
