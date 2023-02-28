package borrow_area;

import SignIn_interface.Login_interfaceU;
import UpdateBooks.model_Books;
import UpdateBooks.view_updateBooks;
import in4_borrower.model_borrower;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import sqlUtils.DAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class borrow_area extends javax.swing.JFrame {
    public static int demSach  = 0;
    public static int soLuongBook = 0;
    public static int i = 0;
private ArrayList<model_Books> list;
private ArrayList<model_borrower> list_borrower;
    DefaultTableModel model;
    public borrow_area() throws SQLException {
        initComponents();
        model = (DefaultTableModel) jTable_in4Books.getModel();
        model.setColumnIdentifiers(new Object[]{
                "ID", "BOOK's  Name", "TAC GIA", "THE LOai", "GIACA", "SOLUONG"
        });
       if(jTextField_findbooks.getText().equals("")){
           list = new DAO().getListStudent();
       }else list = new DAO().findByName();
        showTable();
        jLabel_showSoSach.setText("Đã mượn " + showSoSach() + " sách");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Popup_table = new javax.swing.JPopupMenu();
        jMenuItem_muon = new javax.swing.JMenuItem();
        jLabel_cart = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane_tableIn4Books = new javax.swing.JScrollPane();
        jTable_in4Books = new javax.swing.JTable();
        jScrollPane_Cart = new javax.swing.JScrollPane();
        jTable_in4Borrower = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextField_findbooks = new javax.swing.JTextField();
        jButton_FindBooks = new javax.swing.JButton();
        jButton_back = new javax.swing.JButton();
        jButton_refresh = new javax.swing.JButton();
        jLabel_showSoSach = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        Popup_table.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                Popup_tablePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                Popup_tablePopupMenuWillBecomeVisible(evt);
            }
        });
        Popup_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Popup_tableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Popup_tableMouseReleased(evt);
            }
        });

        jMenuItem_muon.setBackground(new java.awt.Color(51, 255, 255));
        jMenuItem_muon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem_muon.setForeground(new java.awt.Color(0, 102, 204));
        jMenuItem_muon.setText("Borrow now");
        jMenuItem_muon.setOpaque(true);
        jMenuItem_muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_muonActionPerformed(evt);
            }
        });
        Popup_table.add(jMenuItem_muon);

        jLabel_cart.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel_cart.setText("Có 0 sách được chọn");
        jLabel_cart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        setTitle("khu vực mượn sách");
        setBounds(new java.awt.Rectangle(440, 200, 640, 360));
        setLocation(new java.awt.Point(387, 70));

        jTable_in4Books.setAutoCreateRowSorter(true);
        jTable_in4Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_in4Books.setColumnSelectionAllowed(true);
        jTable_in4Books.setFillsViewportHeight(true);
        jTable_in4Books.setInheritsPopupMenu(true);
        jTable_in4Books.setShowGrid(true);
        jTable_in4Books.setSurrendersFocusOnKeystroke(true);
        jTable_in4Books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_in4BooksMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable_in4BooksMouseReleased(evt);
            }
        });
        jScrollPane_tableIn4Books.setViewportView(jTable_in4Books);
        jTable_in4Books.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTable_in4Borrower.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_STU", "Name", "Class", "Borrowed time", "Return time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane_Cart.setViewportView(jTable_in4Borrower);
        if (jTable_in4Borrower.getColumnModel().getColumnCount() > 0) {
            jTable_in4Borrower.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable_in4Borrower.getColumnModel().getColumn(1).setPreferredWidth(45);
            jTable_in4Borrower.getColumnModel().getColumn(2).setPreferredWidth(35);
            jTable_in4Borrower.getColumnModel().getColumn(3).setPreferredWidth(35);
            jTable_in4Borrower.getColumnModel().getColumn(4).setPreferredWidth(14);
        }

        jTextField_findbooks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_findbooksFocusLost(evt);
            }
        });
        jTextField_findbooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_findbooksActionPerformed(evt);
            }
        });

        jButton_FindBooks.setBackground(new java.awt.Color(204, 204, 204));
        jButton_FindBooks.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12)); // NOI18N
        jButton_FindBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrow_area/search-icon.png"))); // NOI18N
        jButton_FindBooks.setToolTipText("Find book by \"name\"");
        jButton_FindBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FindBooksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField_findbooks, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton_FindBooks)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_FindBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_findbooks))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_back.setBackground(new java.awt.Color(102, 153, 255));
        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrow_area/back-icon.png"))); // NOI18N
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jButton_refresh.setBackground(new java.awt.Color(0, 153, 153));
        jButton_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrow_area/reload-icon.png"))); // NOI18N
        jButton_refresh.setToolTipText("click here to return books");
        jButton_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshActionPerformed(evt);
            }
        });

        jLabel_showSoSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_showSoSach.setForeground(new java.awt.Color(0, 102, 204));
        jLabel_showSoSach.setText("Bạn đã mượn");

        jMenu1.setText("   File");
        jMenu1.setOpaque(true);
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(100, 22));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton_back)
                .addGap(3, 3, 3)
                .addComponent(jButton_refresh)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane_Cart, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_showSoSach, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addComponent(jScrollPane_tableIn4Books, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_showSoSach, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_tableIn4Books, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane_Cart, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_findbooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_findbooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_findbooksActionPerformed

    public static  int showSoSach() throws SQLException{
        return new DAO().demsach();
    }
    
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
                    // TODO add your handling code here:
                    //System.exit(0);
                       this.setVisible(false);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //System.exit(0);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshActionPerformed
        // TODO add your handling code here:
        new TraSachaArea().setVisible(true);
    }//GEN-LAST:event_jButton_refreshActionPerformed
    
    private void jButton_FindBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FindBooksActionPerformed
        model.setRowCount(0);
        model = (DefaultTableModel) jTable_in4Books.getModel();
        model.setColumnIdentifiers(new Object[]{
                "ID", "BOOK's  Name", "TAC GIA", "THE LOai", "GIACA", "SOLUONG"
        });
       if(jTextField_findbooks.getText().equals("")){
           list = new DAO().getListStudent();
       }else{
            try {
                //list = new DAO().findByName();
                list =  new DAO().tenSach_like();
            } catch (SQLException ex) {
                Logger.getLogger(borrow_area.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
           
      
        showTable();
      
    }//GEN-LAST:event_jButton_FindBooksActionPerformed

    private void jTable_in4BooksMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_in4BooksMouseReleased
            if(evt.isPopupTrigger()){
                showPopup(evt);
            }
    }//GEN-LAST:event_jTable_in4BooksMouseReleased
        
    public void showPopup(MouseEvent e){
            Popup_table.show(jTable_in4Books,e.getX(), e.getY());
    }
    private void Popup_tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Popup_tableMousePressed
           if(evt.isPopupTrigger()) showPopup(evt);
    }//GEN-LAST:event_Popup_tableMousePressed

    private void Popup_tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Popup_tableMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()) showPopup(evt);
        
    }//GEN-LAST:event_Popup_tableMouseReleased

    private void Popup_tablePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Popup_tablePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_Popup_tablePopupMenuWillBecomeInvisible
    
    
    private void jMenuItem_muonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_muonActionPerformed
        //System.out.println("hello
          try {
                     if(new DAO().SOluongBook() != 0){
                         
                            if(new DAO().demsach() +1 <=3){
                                    
                            int i = new DAO().muon();

                            if(i ==1){
                                  soLuongBook = new DAO().SOluongBook()  -1;
                                  demSach= new DAO().demsach()+1;
                                  jLabel_showSoSach.setText("Đã mượn " + demSach + " sách");
                            JOptionPane.showMessageDialog(rootPane, "Borrow successfully");

                            new DAO().updateSoLuongBook();
                            new DAO().updateUpQuantity();
                            
                             jButton1ActionPerformed(evt);

                            }else JOptionPane.showMessageDialog(rootPane, "You  have already borrowed this book!!!");
                            }
                            else JOptionPane.showMessageDialog(rootPane, "You can only borrow 3 books a time");

                }else JOptionPane.showMessageDialog(rootPane, "No more books to borrow");
                
                
            } catch (SQLException ex) {
                Logger.getLogger(borrow_area.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        
    }//GEN-LAST:event_jMenuItem_muonActionPerformed

    private void Popup_tablePopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_Popup_tablePopupMenuWillBecomeVisible
    }//GEN-LAST:event_Popup_tablePopupMenuWillBecomeVisible
    // lấy chỉ số của hàng trong bảng 
    public static int index_row(){
            int row_index = jTable_in4Books.getSelectedRow();
                return row_index;
}
   
   // lấy giá trị tại vị trí (hàng, cột)
    public static Object abc(){
        Object row  = jTable_in4Books.getModel().getValueAt(index_row(), 0);
            return row;
}
    public static Object abc2(){
       
        Object row  = view_updateBooks.jTable_IN4BOOK.getModel().getValueAt(view_updateBooks.index_row(), 0);
            return row;
}
    private void jTable_in4BooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_in4BooksMouseClicked
         
        index_row();
        //System.out.println(abc());
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(
        new Object[]{
                "ID_STU", "Name", "Class", "Borrowd time", "Return time"
        }
        );
        list_borrower = new DAO().in4Borrower();
        for(model_borrower m : list_borrower){
                model.addRow(
                           new Object[]{
                                m.getID_STU(), m.getName(), m.getClasses(), m.getBorrowed_date(), m.getReturn_date()
                           }
                );
        }
        jTable_in4Borrower.setModel(model);
    }//GEN-LAST:event_jTable_in4BooksMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
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
        jTable_in4Books.setModel(model4);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_findbooksFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_findbooksFocusLost
      
    }//GEN-LAST:event_jTextField_findbooksFocusLost
public void showTable(){
        for(model_Books s : list){
            model.addRow(new Object[]{
                     s.getId(), s.getNamebook(), s.getAuthor(), s.getCategory(), s.getPrice(), s.getQuantity()
            });
        }
}
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(borrow_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrow_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrow_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrow_area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new borrow_area().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(borrow_area.class.getName()).log(Level.SEVERE, null, ex);
                }
Login_interfaceU u =new Login_interfaceU();}
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Popup_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_FindBooks;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_refresh;
    private javax.swing.JLabel jLabel_cart;
    public static javax.swing.JLabel jLabel_showSoSach;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_muon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane_Cart;
    private javax.swing.JScrollPane jScrollPane_tableIn4Books;
    public static javax.swing.JTable jTable_in4Books;
    public static javax.swing.JTable jTable_in4Borrower;
    public static javax.swing.JTextField jTextField_findbooks;
    // End of variables declaration//GEN-END:variables
}
