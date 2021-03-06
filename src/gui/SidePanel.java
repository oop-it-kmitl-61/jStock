/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JPanel;
import util.DateLabel;

/**
 *
 * @author Passawit
 */
public class SidePanel extends javax.swing.JPanel {
    private JPanel superWindow;
    private Quit quit = new Quit();
    private Security security = new Security();

    /**
     * Creates new form SidePanel
     */
    public SidePanel(JPanel superWindow) {
        this.superWindow = superWindow;
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

        sidepanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        bnSale = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bnTransactions = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bnDashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bnEdit = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bnSetting = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bnQuit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        coppyright = new javax.swing.JLabel();
        window = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        setLayout(null);

        sidepanel.setBackground(new java.awt.Color(229, 83, 97));
        sidepanel.setAlignmentX(0.0F);
        sidepanel.setAlignmentY(0.0F);
        sidepanel.setMaximumSize(new java.awt.Dimension(380, 768));
        sidepanel.setMinimumSize(new java.awt.Dimension(380, 768));
        sidepanel.setPreferredSize(new java.awt.Dimension(380, 768));

        name.setFont(new java.awt.Font("Cocogoose", 0, 72)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText(" jStock");

        bnSale.setBackground(new java.awt.Color(224, 70, 84));
        bnSale.setAlignmentX(0.0F);
        bnSale.setAlignmentY(0.0F);
        bnSale.setMaximumSize(new java.awt.Dimension(380, 78));
        bnSale.setMinimumSize(new java.awt.Dimension(380, 78));
        bnSale.setPreferredSize(new java.awt.Dimension(380, 78));
        bnSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnSaleMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_sale.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comfortaa", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sale");

        javax.swing.GroupLayout bnSaleLayout = new javax.swing.GroupLayout(bnSale);
        bnSale.setLayout(bnSaleLayout);
        bnSaleLayout.setHorizontalGroup(
            bnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnSaleLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bnSaleLayout.setVerticalGroup(
            bnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnSaleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bnSaleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        bnTransactions.setBackground(new java.awt.Color(237, 108, 112));
        bnTransactions.setAlignmentX(0.0F);
        bnTransactions.setAlignmentY(0.0F);
        bnTransactions.setMaximumSize(new java.awt.Dimension(380, 78));
        bnTransactions.setMinimumSize(new java.awt.Dimension(380, 78));
        bnTransactions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnTransactionsMouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_transactions.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Comfortaa", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Transactions");

        javax.swing.GroupLayout bnTransactionsLayout = new javax.swing.GroupLayout(bnTransactions);
        bnTransactions.setLayout(bnTransactionsLayout);
        bnTransactionsLayout.setHorizontalGroup(
            bnTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnTransactionsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        bnTransactionsLayout.setVerticalGroup(
            bnTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnTransactionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bnTransactionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        bnDashboard.setBackground(new java.awt.Color(237, 108, 112));
        bnDashboard.setAlignmentX(0.0F);
        bnDashboard.setAlignmentY(0.0F);
        bnDashboard.setMaximumSize(new java.awt.Dimension(380, 78));
        bnDashboard.setMinimumSize(new java.awt.Dimension(380, 78));
        bnDashboard.setPreferredSize(new java.awt.Dimension(380, 78));
        bnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnDashboardMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_dashboard.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Comfortaa", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dashboard");

        javax.swing.GroupLayout bnDashboardLayout = new javax.swing.GroupLayout(bnDashboard);
        bnDashboard.setLayout(bnDashboardLayout);
        bnDashboardLayout.setHorizontalGroup(
            bnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnDashboardLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bnDashboardLayout.setVerticalGroup(
            bnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        bnEdit.setBackground(new java.awt.Color(237, 108, 112));
        bnEdit.setAlignmentX(0.0F);
        bnEdit.setAlignmentY(0.0F);
        bnEdit.setMaximumSize(new java.awt.Dimension(380, 78));
        bnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnEditMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_edit.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Comfortaa", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edit Stock");

        javax.swing.GroupLayout bnEditLayout = new javax.swing.GroupLayout(bnEdit);
        bnEdit.setLayout(bnEditLayout);
        bnEditLayout.setHorizontalGroup(
            bnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnEditLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bnEditLayout.setVerticalGroup(
            bnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bnEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        bnSetting.setBackground(new java.awt.Color(237, 108, 112));
        bnSetting.setAlignmentX(0.0F);
        bnSetting.setAlignmentY(0.0F);
        bnSetting.setMaximumSize(new java.awt.Dimension(380, 78));
        bnSetting.setMinimumSize(new java.awt.Dimension(380, 78));
        bnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnSettingMouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_setting.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Comfortaa", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Setting");

        javax.swing.GroupLayout bnSettingLayout = new javax.swing.GroupLayout(bnSetting);
        bnSetting.setLayout(bnSettingLayout);
        bnSettingLayout.setHorizontalGroup(
            bnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnSettingLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bnSettingLayout.setVerticalGroup(
            bnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnSettingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bnSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        bnQuit.setBackground(new java.awt.Color(237, 108, 112));
        bnQuit.setAlignmentX(0.0F);
        bnQuit.setAlignmentY(0.0F);
        bnQuit.setMaximumSize(new java.awt.Dimension(380, 78));
        bnQuit.setMinimumSize(new java.awt.Dimension(380, 78));
        bnQuit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnQuitMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_quit.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quit");

        javax.swing.GroupLayout bnQuitLayout = new javax.swing.GroupLayout(bnQuit);
        bnQuit.setLayout(bnQuitLayout);
        bnQuitLayout.setHorizontalGroup(
            bnQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnQuitLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bnQuitLayout.setVerticalGroup(
            bnQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bnQuitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bnQuitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        date.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("dd/MM/yyyy");

        time.setFont(new java.awt.Font("PT Mono", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("HH:mm:ss");

        coppyright.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        coppyright.setForeground(new java.awt.Color(237, 108, 112));
        coppyright.setText("Version 1.0 © 2018 jStock");
        coppyright.setToolTipText("");

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(name))
            .addComponent(bnSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bnTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(time))
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(date))
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(coppyright))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(name)
                .addGap(26, 26, 26)
                .addComponent(bnSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bnTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(time)
                .addGap(9, 9, 9)
                .addComponent(date)
                .addGap(6, 6, 6)
                .addComponent(coppyright, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(sidepanel);
        sidepanel.setBounds(0, 0, 380, 768);

        window.setBackground(new java.awt.Color(255, 204, 204));
        window.setMaximumSize(new java.awt.Dimension(986, 768));
        window.setMinimumSize(new java.awt.Dimension(986, 768));
        window.setPreferredSize(new java.awt.Dimension(986, 768));
        window.setLayout(new java.awt.CardLayout());
        add(window);
        window.setBounds(380, 0, 1080, 768);
    }// </editor-fold>//GEN-END:initComponents

    private void custom() {
        DateLabel dl = new DateLabel(date, time);
        dl.start();

        setColor(bnSale);
        resetColor(bnQuit);
        resetColor(bnDashboard);
        resetColor(bnEdit);
        resetColor(bnSetting);
        resetColor(bnTransactions);

        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new Sale(window));
        window.repaint();
        window.revalidate();

        quit.init();
        security.init();
    }

    private void bnSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnSaleMouseClicked
        // TODO add your handling code here:
        setColor(bnSale);
        resetColor(bnQuit);
        resetColor(bnDashboard);
        resetColor(bnEdit);
        resetColor(bnSetting);
        resetColor(bnTransactions);

        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new Sale(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnSaleMouseClicked

    private void bnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnDashboardMouseClicked
        // TODO add your handling code here:
        setColor(bnDashboard);
        resetColor(bnQuit);
        resetColor(bnSale);
        resetColor(bnEdit);
        resetColor(bnSetting);
        resetColor(bnTransactions);

        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new DashboardDay(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnDashboardMouseClicked

    private void bnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnEditMouseClicked
        // TODO add your handling code here:
        security.setModal(true);
        security.setVisible(true);

        if (security.getReturnStatus()) {
            setColor(bnEdit);
            resetColor(bnQuit);
            resetColor(bnSale);
            resetColor(bnDashboard);
            resetColor(bnSetting);
            resetColor(bnTransactions);

            window.removeAll();
            window.repaint();
            window.revalidate();

            window.add(new Edit(window));
            window.repaint();
            window.revalidate();
        }
    }//GEN-LAST:event_bnEditMouseClicked

    private void bnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnSettingMouseClicked
        // TODO add your handling code here:
        security.setModal(true);
        security.setVisible(true);

        if (security.getReturnStatus()) {
            setColor(bnSetting);
            resetColor(bnQuit);
            resetColor(bnSale);
            resetColor(bnDashboard);
            resetColor(bnEdit);
            resetColor(bnTransactions);

            window.removeAll();
            window.repaint();
            window.revalidate();

            window.add(new Setting(superWindow));
            window.repaint();
            window.revalidate();
        }

    }//GEN-LAST:event_bnSettingMouseClicked

    private void bnQuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnQuitMouseClicked
        // TODO add your handling code here:
        quit.setModal(true);
        quit.setVisible(true);

        if (quit.getReturnStatus()) {
            System.exit(0);
        }

    }//GEN-LAST:event_bnQuitMouseClicked

    private void bnTransactionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnTransactionsMouseClicked
        // TODO add your handling code here:
        setColor(bnTransactions);
        resetColor(bnQuit);
        resetColor(bnSale);
        resetColor(bnEdit);
        resetColor(bnSetting);
        resetColor(bnDashboard);

        window.removeAll();
        window.repaint();
        window.revalidate();

        window.add(new Transactions(window));
        window.repaint();
        window.revalidate();
    }//GEN-LAST:event_bnTransactionsMouseClicked

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(224, 70, 84));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new Color(237, 108, 112));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bnDashboard;
    private javax.swing.JPanel bnEdit;
    private javax.swing.JPanel bnQuit;
    private javax.swing.JPanel bnSale;
    private javax.swing.JPanel bnSetting;
    private javax.swing.JPanel bnTransactions;
    private javax.swing.JLabel coppyright;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel name;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel time;
    private javax.swing.JPanel window;
    // End of variables declaration//GEN-END:variables
}
