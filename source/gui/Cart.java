/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import util.ProductSale;
import util.ProductsSale;
import util.Transaction;
import util.Transactions;

/**
 *
 * @author Passawit
 */
public class Cart extends javax.swing.JPanel {
    private Sorry sorry = new Sorry();
    private JPanel window;
    private Transaction t;

    /**
     * Creates new form Cart
     */
    public Cart(JPanel window, Transaction t) {
        this.window = window;
        this.t = t;

        initComponents();
        custom();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTop = new javax.swing.JPanel();
        lbTop = new javax.swing.JLabel();
        lbTotalDes = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        bnSale = new javax.swing.JPanel();
        lbSale = new javax.swing.JLabel();
        bnCancel = new javax.swing.JPanel();
        lbCancel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allProducts = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(986, 768));
        setMinimumSize(new java.awt.Dimension(986, 768));
        setPreferredSize(new java.awt.Dimension(986, 768));
        setSize(new java.awt.Dimension(986, 768));
        setLayout(null);

        pTop.setBackground(new java.awt.Color(168, 80, 204));

        lbTop.setFont(new java.awt.Font("Paloseco", 1, 70)); // NOI18N
        lbTop.setForeground(new java.awt.Color(255, 255, 255));
        lbTop.setText("Recipt");

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTopLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbTop, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(535, Short.MAX_VALUE))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTopLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(lbTop))
        );

        add(pTop);
        pTop.setBounds(0, 40, 986, 110);

        lbTotalDes.setFont(new java.awt.Font("PT Mono", 0, 36)); // NOI18N
        lbTotalDes.setForeground(new java.awt.Color(189, 189, 189));
        lbTotalDes.setText("Total:");
        lbTotalDes.setToolTipText("");
        add(lbTotalDes);
        lbTotalDes.setBounds(49, 670, 140, 41);

        lbTotal.setFont(new java.awt.Font("PT Mono", 0, 36)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(151, 72, 183));
        lbTotal.setText("0");
        add(lbTotal);
        lbTotal.setBounds(200, 670, 410, 41);

        bnSale.setBackground(new java.awt.Color(168, 80, 204));
        bnSale.setMaximumSize(new java.awt.Dimension(170, 60));
        bnSale.setPreferredSize(new java.awt.Dimension(170, 60));
        bnSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnSaleMouseClicked(evt);
            }
        });

        lbSale.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        lbSale.setForeground(new java.awt.Color(255, 255, 255));
        lbSale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSale.setText("Sale");
        lbSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbSale.setMaximumSize(new java.awt.Dimension(170, 60));
        lbSale.setMinimumSize(new java.awt.Dimension(170, 60));
        lbSale.setMixingCutoutShape(null);
        lbSale.setPreferredSize(new java.awt.Dimension(170, 60));

        javax.swing.GroupLayout bnSaleLayout = new javax.swing.GroupLayout(bnSale);
        bnSale.setLayout(bnSaleLayout);
        bnSaleLayout.setHorizontalGroup(
            bnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSale, javax.swing.GroupLayout.PREFERRED_SIZE, 137, Short.MAX_VALUE)
        );
        bnSaleLayout.setVerticalGroup(
            bnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnSaleLayout.createSequentialGroup()
                .addComponent(lbSale, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(bnSale);
        bnSale.setBounds(790, 671, 137, 40);

        bnCancel.setBackground(new java.awt.Color(255, 255, 255));
        bnCancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 83, 97), 3));
        bnCancel.setMaximumSize(new java.awt.Dimension(170, 60));
        bnCancel.setPreferredSize(new java.awt.Dimension(170, 60));
        bnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnCancelMouseClicked(evt);
            }
        });

        lbCancel.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        lbCancel.setForeground(new java.awt.Color(66, 66, 66));
        lbCancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCancel.setText("Cancel");
        lbCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbCancel.setMaximumSize(new java.awt.Dimension(170, 60));
        lbCancel.setMinimumSize(new java.awt.Dimension(170, 60));
        lbCancel.setMixingCutoutShape(null);
        lbCancel.setPreferredSize(new java.awt.Dimension(170, 60));

        javax.swing.GroupLayout bnCancelLayout = new javax.swing.GroupLayout(bnCancel);
        bnCancel.setLayout(bnCancelLayout);
        bnCancelLayout.setHorizontalGroup(
            bnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, Short.MAX_VALUE)
        );
        bnCancelLayout.setVerticalGroup(
            bnCancelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
        );

        add(bnCancel);
        bnCancel.setBounds(635, 671, 137, 40);

        jScrollPane1.setBorder(null);

        allProducts.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        allProducts.setForeground(new java.awt.Color(66, 66, 66));
        allProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "ProductID", "Name", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allProducts.setGridColor(new java.awt.Color(189, 189, 189));
        allProducts.setIntercellSpacing(new java.awt.Dimension(5, 5));
        allProducts.setRowHeight(30);
        allProducts.setSelectionBackground(new java.awt.Color(237, 108, 112));
        allProducts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(allProducts);

        add(jScrollPane1);
        jScrollPane1.setBounds(49, 203, 878, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void bnSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnSaleMouseClicked
        // TODO add your handling code here:
        ConfirmSale cai = new ConfirmSale(t);
        cai.setModal(true);
        cai.setVisible(true);

        if (cai.getReturnStatus()) {
            if (new Transactions().sale(t)) {
                window.removeAll();
                window.repaint();
                window.revalidate();

                window.add(new Sale(window));
                window.repaint();
                window.revalidate();
            } else {
                sorry.setModal(true);
                sorry.setVisible(true);
            }
        }
    }//GEN-LAST:event_bnSaleMouseClicked

    private void bnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnCancelMouseClicked
        // TODO add your handling code here:
        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new Sale(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnCancelMouseClicked

    private void custom() {
        JTableHeader productsHeader = allProducts.getTableHeader();
        productsHeader.setFont(new java.awt.Font("Comfortaa", 0, 18));
        ((DefaultTableCellRenderer) productsHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        productsHeader.setForeground(new java.awt.Color(66, 66, 66));
        productsHeader.setPreferredSize(new Dimension(375, 30));

        DefaultTableModel model = (DefaultTableModel) allProducts.getModel();
        t.getProducts().forEach((p) -> {
            model.addRow(new Object[]{p.getQuantity(), p.getProductID(), p.getProductName(), p.getProductPrice(), p.getAmount()});
        });

        String total = Double.toString(t.getTotal());
        lbTotal.setText(total);
        System.out.print(t.getTotal());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allProducts;
    private javax.swing.JPanel bnCancel;
    private javax.swing.JPanel bnSale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCancel;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbTop;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTotalDes;
    private javax.swing.JPanel pTop;
    // End of variables declaration//GEN-END:variables
}
