package in4_library;

import java.awt.Color;
import java.awt.Font;

public class View extends javax.swing.JFrame {
    public View() {
        initComponents();
        jLabel3.setText("@author: nxdinh94");
        jLabel3.setFont(new Font("Arial", Font.ITALIC, 10));
        jLabel3.setForeground(Color.BLUE.brighter());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setLocation(new java.awt.Point(387, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("      ĐẠI HỌC ĐÀ NẴNG ");

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("He thong xac thuc mang thu vien");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\t\tNỘI QUY THƯ VIỆN\nThư viện là nơi cung cấp và lưu trữ sách giáo khoa, sách tham khảo, báo, tạp chí, tranh ảnh, bản đồ phục vụ và học. \nVì vậy mỗi giáo viên, học sinh cần thực hiện tốt những nội quy sau:\nI. ĐỐI VỚI GIÁO VIÊN:\n1. Đăng ký mượn trả sách giáo khoa, sách tham khảo, tranh ảnh, bản đồ theo lịch của thư viện, theo đúng thời gian\nquy định.\n2. Có trách nhiệm giữ gìn, bảo quản sách trong thư viện, không làm mất sách, không làm nhàu nát không mang \nbáo, tạp chí ra khỏe phòng thư viện.\n3. Khi đọc sách, báo tại phòng thư viện xong phải bàn gioa cho cán bộ phụ trách thư viện để quản lý sắp xếp và thư lại.\n4. Mỗi giáo viên có trách nhiệm cùng cán bộ phụ trách thư viện quản lý và sử dụng hiệu quả phòng đọc.\n\nII. ĐỐI VỚI HỌC SINH:\n1. Học sinh đến đọc sách phải xuất thẻ và thực hiện theo yêu cầu của người phục trách thư viện.\n2. Không cho người khác mượn thẻ. Nếu mất thẻ phải báo ngay cho cán bộ biết để theo dõi kịp thời.\n3. Trả mượn sách đúng thời gian quy định(21 ngày).\n4. Tuyệt đối không gạch xóa, không viết vào sách, không xén tranh ảnh trong sách.\n5. Thực hiện nếp sống văn hóa trong phòng phòng đọc, trật tự không nói chuyện, xê dịch bàn ghế, giữ gìn vệ sinh chung.\n6. Bạn đọc làm mất sách, rách hoặc hư hỏng phải bồi thường và chịu kỉ luật tùy theo mức độ vi phạm.\n7. Bạn đọc có trách nhiệm xây dựng phòng đọc nhằm  phục vụ ngày càng tốt hơn. ");
        jTextArea1.setDoubleBuffered(true);
        jTextArea1.setDragEnabled(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public static void main(String args[]) {
//  
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new View().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
