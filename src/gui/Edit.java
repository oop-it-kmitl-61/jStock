/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import util.Product;
import util.Stock;

/**
 *
 * @author Passawit
 */
public class Edit extends javax.swing.JPanel {

    private final Stock stock = new Stock();
    private JPanel window;

    /**
     * Creates new form Edit
     */
    public Edit(JPanel window) {
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
        bnAdd = new javax.swing.JPanel();
        lbAdd = new javax.swing.JLabel();
        lbLastUpdate = new javax.swing.JLabel();
        lbDateTime = new javax.swing.JLabel();
        bnRefresh = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
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
                "Product ID", "Name", "Price", "Amount", "Edit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
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
        allProducts.setRowHeight(30);
        allProducts.setSelectionBackground(new java.awt.Color(237, 108, 112));
        allProducts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(allProducts);
        if (allProducts.getColumnModel().getColumnCount() > 0) {
            allProducts.getColumnModel().getColumn(0).setResizable(false);
            allProducts.getColumnModel().getColumn(1).setResizable(false);
            allProducts.getColumnModel().getColumn(2).setResizable(false);
            allProducts.getColumnModel().getColumn(3).setResizable(false);
            allProducts.getColumnModel().getColumn(4).setResizable(false);
        }

        bnAdd.setBackground(new java.awt.Color(168, 80, 204));
        bnAdd.setMaximumSize(new java.awt.Dimension(170, 60));
        bnAdd.setPreferredSize(new java.awt.Dimension(170, 60));
        bnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnAddMouseClicked(evt);
            }
        });

        lbAdd.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        lbAdd.setForeground(new java.awt.Color(255, 255, 255));
        lbAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAdd.setText("Add Product");
        lbAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbAdd.setMaximumSize(new java.awt.Dimension(170, 60));
        lbAdd.setMinimumSize(new java.awt.Dimension(170, 60));
        lbAdd.setMixingCutoutShape(null);
        lbAdd.setPreferredSize(new java.awt.Dimension(170, 60));

        javax.swing.GroupLayout bnAddLayout = new javax.swing.GroupLayout(bnAdd);
        bnAdd.setLayout(bnAddLayout);
        bnAddLayout.setHorizontalGroup(
            bnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, Short.MAX_VALUE)
        );
        bnAddLayout.setVerticalGroup(
            bnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnAddLayout.createSequentialGroup()
                .addComponent(lbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbLastUpdate.setFont(new java.awt.Font("PT Mono", 0, 14)); // NOI18N
        lbLastUpdate.setForeground(new java.awt.Color(204, 204, 204));
        lbLastUpdate.setText("Last update:");

        lbDateTime.setFont(new java.awt.Font("PT Mono", 0, 14)); // NOI18N
        lbDateTime.setForeground(new java.awt.Color(204, 204, 204));
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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLastUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lbDateTime)
                        .addGap(6, 6, 6)
                        .addComponent(bnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLastUpdate)
                            .addComponent(lbDateTime)
                            .addComponent(bnRefresh)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnAddMouseClicked
        // TODO add your handling code here:
        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new AddItem(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnAddMouseClicked

    private void bnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnRefreshMouseClicked
        // TODO add your handling code here:
        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new Edit(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnRefreshMouseClicked

    private void tfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseClicked
        // TODO add your handling code here:
        tfSearch.selectAll();
        
    }//GEN-LAST:event_tfSearchMouseClicked

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
                System.out.println(row + ", " + column);
                System.out.println((String) allProducts.getValueAt(row, 0));
                
                if (column == 4) {
                    window.removeAll();
                    window.repaint();
                    window.revalidate();

                    window.add(new EditItem(window, (String) stock.getProducts().get(row).getProductID()));
                    window.repaint();
                    window.revalidate();
                }
            }
        });

        DefaultTableModel model = (DefaultTableModel) allProducts.getModel();
        for (Product p : stock.getProducts()) {

            model.addRow(new Object[]{p.getProductID(), p.getProductName(), p.getProductPrice(), p.getProductAmount(), "Edit"});
        }

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date time = new Date();
        lbDateTime.setText("[" + dateFormat.format(date) + "] " + timeFormat.format(time));
        
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(allProducts.getModel());
        String text = tfSearch.getText();

        tfSearch.getDocument().addDocumentListener(new DocumentListener(){

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
        
        allProducts.getColumnModel().getColumn(3).setCellRenderer(new ItemAlert());

    }
    
    public class ItemAlert extends JLabel implements TableCellRenderer {

        public ItemAlert() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value,
                boolean isSelected, boolean hasFocus,
                int row, int column) {

            if (Integer.valueOf(table.getValueAt(row, column).toString()) == 0) {
                setBackground(new Color(255,180,191));
                
            } else if (Integer.valueOf(table.getValueAt(row, column).toString()) < 5) {
                setBackground(new Color(253,253,150));
                
            } else {
                setBackground(new Color(255,255,255));
                
            }
            
            setText(table.getValueAt(row, column).toString());
            setFont(new java.awt.Font("Comfortaa", 0, 18));
            setForeground(new Color(66,66,66));
            setHorizontalAlignment(JLabel.RIGHT);

            return this;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allProducts;
    private javax.swing.JPanel bnAdd;
    private javax.swing.JLabel bnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAdd;
    private javax.swing.JLabel lbDateTime;
    private javax.swing.JLabel lbLastUpdate;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
