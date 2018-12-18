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
import util.DashboardDayUtil;

/**
 *
 * @author Passawit
 */
public class DashboardDay extends javax.swing.JPanel {

    private DashboardDayUtil ddu = new DashboardDayUtil();
    private JPanel window;

    /**
     * Creates new form DashboardDay
     */
    public DashboardDay(JPanel window) {
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

        pTop = new javax.swing.JPanel();
        lbTop = new javax.swing.JLabel();
        lbTop1 = new javax.swing.JLabel();
        lbTotalSaleDes = new javax.swing.JLabel();
        lbTotalSale = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbTotalOdersDes = new javax.swing.JLabel();
        lbTotalOders = new javax.swing.JLabel();
        lbTotalAmountDes = new javax.swing.JLabel();
        lbTotalAmount = new javax.swing.JLabel();
        lbBestDes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        allProducts = new javax.swing.JTable();
        bnDay = new javax.swing.JPanel();
        lbDay = new javax.swing.JLabel();
        bnMonth = new javax.swing.JPanel();
        lbMonth = new javax.swing.JLabel();
        bnYear = new javax.swing.JPanel();
        lbYear = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(986, 768));
        setPreferredSize(new java.awt.Dimension(986, 768));
        setSize(new java.awt.Dimension(986, 768));

        pTop.setBackground(new java.awt.Color(168, 80, 204));

        lbTop.setFont(new java.awt.Font("Paloseco", 1, 70)); // NOI18N
        lbTop.setForeground(new java.awt.Color(255, 255, 255));
        lbTop.setText("Sales report by");

        lbTop1.setFont(new java.awt.Font("Paloseco", 1, 70)); // NOI18N
        lbTop1.setForeground(new java.awt.Color(235, 232, 50));
        lbTop1.setText("Day");

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTopLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbTop, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTop1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(301, Short.MAX_VALUE))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pTopLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTop)
                    .addComponent(lbTop1)))
        );

        lbTotalSaleDes.setFont(new java.awt.Font("PT Mono", 0, 36)); // NOI18N
        lbTotalSaleDes.setForeground(new java.awt.Color(189, 189, 189));
        lbTotalSaleDes.setText("Total Sale");

        lbTotalSale.setFont(new java.awt.Font("Comfortaa", 0, 64)); // NOI18N
        lbTotalSale.setForeground(new java.awt.Color(168, 80, 204));
        lbTotalSale.setText("000000");

        lbDate.setFont(new java.awt.Font("PT Mono", 0, 24)); // NOI18N
        lbDate.setForeground(new java.awt.Color(189, 189, 189));
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbDate.setText("dd MMM yyyy");

        lbTotalOdersDes.setFont(new java.awt.Font("PT Mono", 0, 24)); // NOI18N
        lbTotalOdersDes.setForeground(new java.awt.Color(189, 189, 189));
        lbTotalOdersDes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTotalOdersDes.setText("Total orders:");

        lbTotalOders.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        lbTotalOders.setForeground(new java.awt.Color(168, 80, 204));
        lbTotalOders.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTotalOders.setText("0");

        lbTotalAmountDes.setFont(new java.awt.Font("PT Mono", 0, 24)); // NOI18N
        lbTotalAmountDes.setForeground(new java.awt.Color(189, 189, 189));
        lbTotalAmountDes.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTotalAmountDes.setText("Total amount:");

        lbTotalAmount.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        lbTotalAmount.setForeground(new java.awt.Color(168, 80, 204));
        lbTotalAmount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbTotalAmount.setText("0");

        lbBestDes.setFont(new java.awt.Font("PT Mono", 0, 36)); // NOI18N
        lbBestDes.setForeground(new java.awt.Color(189, 189, 189));
        lbBestDes.setText("Best seller");

        allProducts.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        allProducts.setForeground(new java.awt.Color(66, 66, 66));
        allProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ProductID", "Name", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allProducts.setGridColor(new java.awt.Color(189, 189, 189));
        allProducts.setRowHeight(40);
        allProducts.setSelectionBackground(new java.awt.Color(255, 255, 255));
        allProducts.setSelectionForeground(new java.awt.Color(66, 66, 66));
        allProducts.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(allProducts);
        if (allProducts.getColumnModel().getColumnCount() > 0) {
            allProducts.getColumnModel().getColumn(0).setResizable(false);
            allProducts.getColumnModel().getColumn(1).setResizable(false);
            allProducts.getColumnModel().getColumn(2).setResizable(false);
            allProducts.getColumnModel().getColumn(3).setResizable(false);
        }

        bnDay.setBackground(new java.awt.Color(229, 83, 97));
        bnDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 83, 97), 3));

        lbDay.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        lbDay.setForeground(new java.awt.Color(255, 255, 255));
        lbDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDay.setText("Day");

        javax.swing.GroupLayout bnDayLayout = new javax.swing.GroupLayout(bnDay);
        bnDay.setLayout(bnDayLayout);
        bnDayLayout.setHorizontalGroup(
            bnDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bnDayLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bnDayLayout.setVerticalGroup(
            bnDayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bnDayLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bnMonth.setBackground(new java.awt.Color(255, 255, 255));
        bnMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 83, 97), 3));
        bnMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnMonthMouseClicked(evt);
            }
        });

        lbMonth.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        lbMonth.setForeground(new java.awt.Color(66, 66, 66));
        lbMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMonth.setText("Month");

        javax.swing.GroupLayout bnMonthLayout = new javax.swing.GroupLayout(bnMonth);
        bnMonth.setLayout(bnMonthLayout);
        bnMonthLayout.setHorizontalGroup(
            bnMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnMonthLayout.createSequentialGroup()
                .addComponent(lbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bnMonthLayout.setVerticalGroup(
            bnMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnMonthLayout.createSequentialGroup()
                .addComponent(lbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bnYear.setBackground(new java.awt.Color(255, 255, 255));
        bnYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 83, 97), 3));
        bnYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnYearMouseClicked(evt);
            }
        });

        lbYear.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        lbYear.setForeground(new java.awt.Color(66, 66, 66));
        lbYear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbYear.setText("Year");

        javax.swing.GroupLayout bnYearLayout = new javax.swing.GroupLayout(bnYear);
        bnYear.setLayout(bnYearLayout);
        bnYearLayout.setHorizontalGroup(
            bnYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnYearLayout.createSequentialGroup()
                .addComponent(lbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bnYearLayout.setVerticalGroup(
            bnYearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnYearLayout.createSequentialGroup()
                .addComponent(lbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bnDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbTotalSaleDes)
                            .addGap(374, 374, 374)
                            .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lbTotalSale, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTotalOdersDes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTotalAmountDes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTotalOders)
                                .addComponent(lbTotalAmount)))
                        .addComponent(lbBestDes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTotalSaleDes)
                        .addGap(6, 6, 6)
                        .addComponent(lbTotalSale))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotalOdersDes)
                            .addComponent(lbTotalOders))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTotalAmountDes)
                            .addComponent(lbTotalAmount))))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbBestDes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bnMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bnDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnMonthMouseClicked
        // TODO add your handling code here:
        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new DashboardMonth(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnMonthMouseClicked

    private void bnYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnYearMouseClicked
        // TODO add your handling code here:
        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new DashboardYear(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnYearMouseClicked

    private void custom() {
        lbTotalSale.setText(ddu.getTotalSale());
        lbDate.setText(ddu.getDate());
        lbTotalOders.setText(ddu.getTotalOder());
        lbTotalAmount.setText(ddu.getTotalAmount());

        JTableHeader productsHeader = allProducts.getTableHeader();
        productsHeader.setFont(new java.awt.Font("Comfortaa", 0, 18));
        ((DefaultTableCellRenderer) productsHeader.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        productsHeader.setForeground(new java.awt.Color(66, 66, 66));
        productsHeader.setPreferredSize(new Dimension(375, 30));

        DefaultTableModel model = (DefaultTableModel) allProducts.getModel();
        ddu.getProductCount().forEach((p) -> {
            model.addRow(new Object[]{p.get(3), p.get(0), p.get(2), p.get(1)});
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allProducts;
    private javax.swing.JPanel bnDay;
    private javax.swing.JPanel bnMonth;
    private javax.swing.JPanel bnYear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbBestDes;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDay;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JLabel lbTop;
    private javax.swing.JLabel lbTop1;
    private javax.swing.JLabel lbTotalAmount;
    private javax.swing.JLabel lbTotalAmountDes;
    private javax.swing.JLabel lbTotalOders;
    private javax.swing.JLabel lbTotalOdersDes;
    private javax.swing.JLabel lbTotalSale;
    private javax.swing.JLabel lbTotalSaleDes;
    private javax.swing.JLabel lbYear;
    private javax.swing.JPanel pTop;
    // End of variables declaration//GEN-END:variables
}
