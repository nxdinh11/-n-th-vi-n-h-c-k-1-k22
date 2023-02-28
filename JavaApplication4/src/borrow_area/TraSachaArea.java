/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package borrow_area;

import UpdateBooks.model_Books;
import static borrow_area.borrow_area.demSach;

import in4_borrower.model_borrower;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sqlUtils.DAO;
public class TraSachaArea extends javax.swing.JFrame {
    ArrayList<model_borrower> list ;
    DefaultTableModel model  = new DefaultTableModel(); 
    public TraSachaArea() {
       
        initComponents();
        try {
            // TODO add your handling code here:
            list = new DAO().getlistIN2();
           //model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(
                    new Object[]{
                     "Book's ID ", "Book's name","Borrowed Date","Return Date"
                    }
            ); 
            for(model_borrower m :list){
                model.addRow(
                        new Object[]{
                            m.getIdSach(), m.getTenSach(), m.getBorrowed_date(), m.getReturn_date()
            }
                );
            }
          jTable1.setModel(model);
   
        } catch (SQLException ex) {
           Logger.getLogger(TraSachaArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_turnback = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setLocation(new java.awt.Point(300, 220));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book's Name", "Borrowed date", "Returned Date", "null"
            }
        ));
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.setInheritsPopupMenu(true);
        jTable1.setShowGrid(true);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_turnback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_turnback.setForeground(new java.awt.Color(0, 102, 204));
        jButton_turnback.setText("Turnback");
        jButton_turnback.setToolTipText("Input id's book");
        jButton_turnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_turnbackMouseClicked(evt);
            }
        });
        jButton_turnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_turnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jButton_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 250, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_turnback, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        
        
    }//GEN-LAST:event_jTable1MouseReleased

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_turnbackActionPerformed
        try {
            boolean a = new DAO().xoaSachDM();
            if(a){
                JOptionPane.showMessageDialog(rootPane, "Returned successfully");
              borrow_area.soLuongBook = new DAO().SOluongBook2()+1;
               new DAO().updateSoLuongBook2();
               
                borrow_area.demSach = new DAO().demsach()-1;
              
                new DAO().updateUpQuantity();  jButton1ActionPerformed(evt);
                jButton2ActionPerformed(evt);
                borrow_area.jLabel_showSoSach.setText("Đã mượn " + borrow_area.showSoSach() + " sách");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TraSachaArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_turnbackActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           
         ArrayList<model_borrower> list2 = new ArrayList<>();
        try {
            list2 = new DAO().getlistIN2();
        } catch (SQLException ex) {
            Logger.getLogger(TraSachaArea.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(
                new Object[]{
                    "Book's ID ", "Book's name", "Borrowed Date", "Return Date"
                }
        );
        for(model_borrower m :list2){
                model1.addRow(
                        new Object[]{
                            m.getIdSach(), m.getTenSach(), m.getBorrowed_date(), m.getReturn_date()
            }
                );
            }
        jTable1.setModel(model1);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_turnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_turnbackMouseClicked
        
    }//GEN-LAST:event_jButton_turnbackMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ArrayList<model_Books> list4 = new ArrayList<>();
        list4= new DAO().getListStudent();
      DefaultTableModel model4 = new DefaultTableModel();
    
       model4.setRowCount(0);
       model4.setColumnIdentifiers(new Object[]{
                "ID", "BOOK's  Name", "TAC GIA", "THE LOai", "GIACA", "SOLUONG"
        });
       for(model_Books s : list4){
           model4.addRow(new Object[]{
                     s.getId(), s.getNamebook(), s.getAuthor(), s.getCategory(), s.getPrice(), s.getQuantity()
            });
       }
        borrow_area.jTable_in4Books.setModel(model4);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TraSachaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraSachaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraSachaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraSachaArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraSachaArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_turnback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
