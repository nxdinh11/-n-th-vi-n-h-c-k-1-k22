package UpdateBooks;

import SignIn_interface.DAO_Account;
import borrow_area.borrow_area;
import in4_borrower.model_borrower;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sqlUtils.DAO;

public class view_updateBooks extends javax.swing.JFrame {

    static int id = 0;
    ArrayList<model_Books> list;
    DefaultTableModel model;

    public view_updateBooks() {
        initComponents();
        list = new DAO().getListStudent();
        model = (DefaultTableModel) jTable_IN4BOOK.getModel();
        model.setColumnIdentifiers(new Object[]{"ID", "BOOK's  Name", "TAC GIA", "THE LOai", "GIACA", "SOLUONG"
        });

        showw();
    }

    public void refresh() {
        model.setRowCount(0);
        model_Books s = list.get(list.size() - 1);
        for (model_Books m : list) {
            model.addRow(new Object[]{
                m.getId(), m.getNamebook(), m.getAuthor(), m.getCategory(), m.getPrice(), m.getQuantity()
            });
        }
    }

    public void showw() {
        model.setRowCount(0);
        for (model_Books m : list) {
            model.addRow(new Object[]{
                m.getId(), m.getNamebook(), m.getAuthor(), m.getCategory(), m.getPrice(), m.getQuantity()
            });
        }
    }

    public static int index_row2() {
        int row_index = jTable_IN4BOOK.getSelectedRow();
        return row_index;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jTextField_n = new javax.swing.JTextField();
        jTextField_a = new javax.swing.JTextField();
        jTextField_c = new javax.swing.JTextField();
        jTextField_m = new javax.swing.JTextField();
        jTextField_mount = new javax.swing.JTextField();
        jButton_insert = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jTextField_search = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_IN4BOOK = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_IN5BORROWER = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setBounds(new java.awt.Rectangle(450, 200, 640, 360));
        setLocation(new java.awt.Point(387, 70));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("UTM Americana EB", 1, 12)); // NOI18N
        jLabel1.setText("Khu vực điền thông tin sách cần thêm");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book's name");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Author");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Category");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Market price");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Remaining mount");
        jLabel7.setOpaque(true);

        jTextField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_idActionPerformed(evt);
            }
        });

        jTextField_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_mFocusLost(evt);
            }
        });
        jTextField_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_mActionPerformed(evt);
            }
        });

        jTextField_mount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_mountFocusLost(evt);
            }
        });
        jTextField_mount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_mountActionPerformed(evt);
            }
        });

        jButton_insert.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton_insert.setForeground(new java.awt.Color(0, 102, 204));
        jButton_insert.setText("Insert");
        jButton_insert.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton_insertFocusLost(evt);
            }
        });
        jButton_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_insertActionPerformed(evt);
            }
        });

        jButton_delete.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton_delete.setForeground(new java.awt.Color(0, 102, 204));
        jButton_delete.setText("Delete");
        jButton_delete.setToolTipText("Click record and press Delete button to delete");
        jButton_delete.setOpaque(true);
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_update.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(0, 102, 204));
        jButton_update.setText("Update");
        jButton_update.setToolTipText("Update by ID");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jButton_search.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton_search.setForeground(new java.awt.Color(0, 102, 204));
        jButton_search.setText("Search");
        jButton_search.setToolTipText("Search by name's book");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setText("Reset");
        jButton1.setToolTipText("Reset text");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_a)
                                    .addComponent(jTextField_m)
                                    .addComponent(jTextField_mount)
                                    .addComponent(jTextField_c)
                                    .addComponent(jTextField_id)
                                    .addComponent(jTextField_n)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_search)))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_n, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_a, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_c, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_m, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_mount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jTable_IN4BOOK.setAutoCreateRowSorter(true);
        jTable_IN4BOOK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Books's name", "Author", "Category", "Market price", "Remaining mount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_IN4BOOK.getTableHeader().setReorderingAllowed(false);
        jTable_IN4BOOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_IN4BOOKMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_IN4BOOK);
        if (jTable_IN4BOOK.getColumnModel().getColumnCount() > 0) {
            jTable_IN4BOOK.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable_IN4BOOK.getColumnModel().getColumn(6).setPreferredWidth(20);
        }

        jTable_IN5BORROWER.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_STU", "NAME", "CLASS", "BORROWED DATE", "RETURN DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_IN5BORROWER);
        if (jTable_IN5BORROWER.getColumnModel().getColumnCount() > 0) {
            jTable_IN5BORROWER.getColumnModel().getColumn(0).setPreferredWidth(45);
            jTable_IN5BORROWER.getColumnModel().getColumn(2).setPreferredWidth(45);
            jTable_IN5BORROWER.getColumnModel().getColumn(3).setPreferredWidth(65);
            jTable_IN5BORROWER.getColumnModel().getColumn(4).setPreferredWidth(65);
        }

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UpdateBooks/back-icon.png"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_idActionPerformed

    private void jButton_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_insertActionPerformed
        model_Books s = new model_Books();
        
        s.setId(jTextField_id.getText());
        s.setNamebook(jTextField_n.getText());
        s.setAuthor(jTextField_a.getText());
        s.setCategory(jTextField_c.getText());
        s.setPrice(Float.parseFloat(jTextField_m.getText()));
        s.setQuantity(Integer.parseInt(jTextField_mount.getText()));
        if (new DAO().addBooks(s)) {
           //list.add(s);
           JOptionPane.showMessageDialog(rootPane, "Successful");
            jButton_searchActionPerformed(evt);
            jButton1ActionPerformed(evt);//Reset textfields
        } else {
            JOptionPane.showMessageDialog(rootPane, "Book's ID can not be duplicated");
            
        }
        
        refresh();

    }//GEN-LAST:event_jButton_insertActionPerformed

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        try {
            
            new DAO().delete_table();
            jButton_searchActionPerformed(evt);
           
        } catch (SQLException ex) {
            Logger.getLogger(view_updateBooks.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        try {
            int i = new DAO().update_table();
            if(i == 1){
                JOptionPane.showMessageDialog(rootPane, "Update successfully");
                jButton_searchActionPerformed(evt);
            }else JOptionPane.showMessageDialog(rootPane, "Invalid Book's ID");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jTable_IN4BOOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_IN4BOOKMouseClicked
        // TODO add your handling code here:
        index_row();
        ArrayList<model_borrower> list = new ArrayList<>();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(
                new Object[]{
                    "ID_STU", "NAME", "CLASS", "BORROWED DATE", "RETURN DATE"
                }
        );
        list = new DAO().in4Borrower2();
        for (model_borrower m : list) {
            model.addRow(
                    new Object[]{
                        m.getID_STU(), m.getName(), m.getClasses(), m.getBorrowed_date(), m.getReturn_date()
                    }
            );
        }
        jTable_IN5BORROWER.setModel(model);
    }//GEN-LAST:event_jTable_IN4BOOKMouseClicked
    public static int index_row() {
        int row_index = jTable_IN4BOOK.getSelectedRow();
        return row_index;
    }
    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        model = (DefaultTableModel) jTable_IN4BOOK.getModel();
        model.setColumnIdentifiers(new Object[]{"ID", "BOOK's  Name", "TAC GIA", "THE LOai", "GIACA", "SOLUONG"
        });
        if (jTextField_search.getText().equals("")) {
            list = new DAO().getListStudent();
        } else {
            try {
                list = new DAO().tenSach_like2();
            } catch (SQLException ex) {
                Logger.getLogger(view_updateBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextField_search.setText("");
        }
        showw();
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField_a.setText("");
        jTextField_c.setText("");
        jTextField_id.setText("");
        jTextField_m.setText("");
        jTextField_mount.setText("");
        jTextField_n.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_insertFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_insertFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_insertFocusLost

    private void jTextField_mFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_mFocusLost
        // TODO add your handling code here:
        try {
            float num;
            String abc =jTextField_m.getText() ;
            if(abc.equals("")){
                
            }else num = Float.parseFloat(abc);
            // do something with num
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Market price is a number!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
            //jTextField_m.requestFocus();
        }
    }//GEN-LAST:event_jTextField_mFocusLost

    private void jTextField_mountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_mountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_mountActionPerformed

    private void jTextField_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_mActionPerformed

    private void jTextField_mountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_mountFocusLost
        // TODO add your handling code here:
        try {
            int num;
            String abc = jTextField_mount.getText();
            if(abc.equals("")){
           
            }else num = Integer.parseInt(abc);
                
            
            // do something with num
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Remaining mount is a number!", "ERROR", JOptionPane.ERROR_MESSAGE);
//            jTextField_mount.requestFocus();
        }
    }//GEN-LAST:event_jTextField_mountFocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_updateBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_insert;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_IN4BOOK;
    private javax.swing.JTable jTable_IN5BORROWER;
    public static javax.swing.JTextField jTextField_a;
    public static javax.swing.JTextField jTextField_c;
    public static javax.swing.JTextField jTextField_id;
    public static javax.swing.JTextField jTextField_m;
    public static javax.swing.JTextField jTextField_mount;
    public static javax.swing.JTextField jTextField_n;
    public static javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
