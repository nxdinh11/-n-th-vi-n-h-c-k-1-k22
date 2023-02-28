package admin_interface;

import SignIn_interface.Account_model;
import SignIn_interface.DAO_Account;
import in4_borrower.model_borrower;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import sqlUtils.DAO;

public class user_account_GUI extends javax.swing.JFrame {
    ArrayList<Account_model> list ;
     ArrayList<model_borrower> list2 ;
    DefaultTableModel model = new DefaultTableModel();
    public user_account_GUI (){
        initComponents();
        try {
            list = new DAO_Account().list_userAccount();
            model.setColumnIdentifiers(
                    new Object[]{
                        "User name","Password"
                    }
            );
            showTable();
            jTable1.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(user_account_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showTable(){
        model.setRowCount(0);
        for(Account_model s : list){
             model.addRow(new Object[]{
                 s.getUserName(), s.getPassword()
             }
             );
        
      }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_searchA = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 255));
        setLocation(new java.awt.Point(387, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "User Name", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField_searchA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchAActionPerformed(evt);
            }
        });

        jButton_search.setBackground(new java.awt.Color(153, 255, 255));
        jButton_search.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_search.setForeground(new java.awt.Color(0, 0, 204));
        jButton_search.setText("Search");
        jButton_search.setToolTipText("Search by User's name");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Full name", "Class", "Hometown", "Year of birth", "Num of borrowed book"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(26);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTable3.getColumnModel().getColumn(4).setPreferredWidth(26);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Book", "Book's name", "Borrowed Date", "Return Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setDragEnabled(true);
        jTable2.setInheritsPopupMenu(true);
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jTextField_searchA, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton_search)
                .addGap(0, 243, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_searchA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
            
        try {
           
            if(jTextField_searchA.getText().equals("")){
           list = new DAO_Account().list_userAccount();
            }else  list = new DAO_Account().search_accountU();
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(user_account_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jTextField_searchAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_searchAActionPerformed
    public static Object getValueat(){
            Object abc =  jTable1.getValueAt(getIndexRow(), 0).toString();//getIndexRow()
            return abc;
        }
    public static int getIndexRow(){
        int i = jTable1.getSelectedRow();
        return i ;
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            // TODO add your handling code here:
            getIndexRow();
            list2 = new DAO().in4brer();
            
            DefaultTableModel model =  new DefaultTableModel();
            model.setColumnIdentifiers(
                    new Object[]{
                        "ID_Student","Full name", "Class", "Hometown","YOB","Quantity"
                    }
            );
            for(model_borrower m : list2){
                model.addRow(
                      new Object[]{
                          m.getID_STU(), m.getName(), m.getClasses(), m.getHomeTown(), m.getyOB(), m.getQuantity_borrowed()
                       }  
                );
            }
                    jTable3.setModel(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(user_account_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable3MouseClicked(evt);
       
    }//GEN-LAST:event_jTable1MouseClicked
    public static Object getValueAt2(){
            return jTable3.getValueAt(0, 0);
    }
     public static int getIndexRow2(){
        int i = jTable3.getSelectedRow();
        return i ;
    }
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        getIndexRow2();
        ArrayList<model_borrower> list3 =  new ArrayList<>();
        try {
            // TODO add your handling code here:
            list3 = new DAO().listDateborrow();
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(
                    new Object[]{
                        "ID_Book","Book's Name","Borrowed Date","Return Date"
                    }
            );
            for(model_borrower mb : list3){
                model.addRow(
                        new Object[]{
                        mb.getIdSach(), mb.getTenSach(), mb.getBorrowed_date(), mb.getReturn_date()}
                );
            }
            jTable2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(user_account_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTable3MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_account_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_search;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    public static javax.swing.JTextField jTextField_searchA;
    // End of variables declaration//GEN-END:variables
}
