/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import util.ProductsSale;
import util.TransactionsUtil;
import util.User;

/**
 *
 * @author Passawit
 */
public class Transactions extends javax.swing.JPanel {

    private TransactionsUtil ts = new TransactionsUtil();
    private JPanel window;

    /**
     * Creates new form Sale
     */
    public Transactions(JPanel window) {
        this.window = window;

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

        tfSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        allProducts = new javax.swing.JTable();
        lbLastUpdate = new javax.swing.JLabel();
        lbDateTime = new javax.swing.JLabel();
        bnRefresh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(986, 768));
        setPreferredSize(new java.awt.Dimension(986, 768));
        setSize(new java.awt.Dimension(986, 768));

        tfSearch.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(189, 189, 189));
        tfSearch.setText("Search...");
        tfSearch.setActionCommand("<Not Set>");
        tfSearch.setAlignmentX(0.0F);
        tfSearch.setAlignmentY(0.0F);
        tfSearch.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(189, 189, 189), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        tfSearch.setMixingCutoutShape(null);
        tfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSearchMouseClicked(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        allProducts.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        allProducts.setForeground(new java.awt.Color(66, 66, 66));
        allProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Date", "Time", "Total", "View"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, ImageIcon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        allProducts.setRowHeight(40);
        allProducts.setSelectionBackground(new java.awt.Color(255, 255, 255));
        allProducts.setSelectionForeground(new java.awt.Color(66, 66, 66));
        allProducts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(allProducts);

        lbLastUpdate.setFont(new java.awt.Font("PT Mono", 0, 14)); // NOI18N
        lbLastUpdate.setForeground(new java.awt.Color(189, 189, 189));
        lbLastUpdate.setText("Last update:");

        lbDateTime.setFont(new java.awt.Font("PT Mono", 0, 14)); // NOI18N
        lbDateTime.setForeground(new java.awt.Color(189, 189, 189));
        lbDateTime.setText("[11/11/2018] 11:11:11");

        bnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        bnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnRefreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbDateTime)
                        .addGap(6, 6, 6)
                        .addComponent(bnRefresh)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLastUpdate)
                    .addComponent(lbDateTime)
                    .addComponent(bnRefresh))
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseClicked
        // TODO add your handling code here:
        tfSearch.selectAll();
    }//GEN-LAST:event_tfSearchMouseClicked

    private void bnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnRefreshMouseClicked
        // TODO add your handling code here:
        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new Transactions(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnRefreshMouseClicked

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        // TODO add your handling code here:
        tfSearch.setForeground(new java.awt.Color(66, 66, 66));
    }//GEN-LAST:event_tfSearchKeyPressed

    private void custom() {

        JTableHeader productsHeader = allProducts.getTableHeader();
        productsHeader.setFont(new java.awt.Font("Comfortaa", 0, 18));
        ((DefaultTableCellRenderer) productsHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        productsHeader.setForeground(new java.awt.Color(66, 66, 66));
        productsHeader.setPreferredSize(new Dimension(375, 30));

        allProducts.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JTable target = (JTable) e.getSource();
                int row = target.getSelectedRow();
                int column = target.getSelectedColumn();

                if (column == 4) {
                    ViewTransaction cai = new ViewTransaction(ts.getTransaction(allProducts.getValueAt(row, 0).toString()));
                    cai.setModal(true);
                    cai.setVisible(true);
                }
            }
        });

        DefaultTableModel model = (DefaultTableModel) allProducts.getModel();
        ImageIcon icn = new ImageIcon(getClass().getResource("/images/icon_view.png"));
        DBCursor curs = ts.getTransactions().find();
        while (curs.hasNext()) {
            DBObject t = curs.next();
            model.addRow(new Object[]{(String)t.get("transactionID"), (String)t.get("sDate"), (String)t.get("time"), (double)t.get("total"), icn});
        }

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        lbDateTime.setText("[" + dateFormat.format(date) + "] " + timeFormat.format(time));

        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(allProducts.getModel());
        String text = tfSearch.getText();

        tfSearch.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = tfSearch.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = tfSearch.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        allProducts.setRowSorter(rowSorter);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allProducts;
    private javax.swing.JLabel bnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDateTime;
    private javax.swing.JLabel lbLastUpdate;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
