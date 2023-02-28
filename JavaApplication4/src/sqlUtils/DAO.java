
package sqlUtils;
import SignIn_interface.Login_interfaceU;
import UpdateBooks.model_Books;
import UpdateBooks.view_updateBooks;
import admin_interface.user_account_GUI;
import borrow_area.TraSachaArea;

import com.sun.jdi.connect.Connector;
import sqlUtils.*;
import borrow_area.borrow_area;
import in4_borrower.model_borrower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DAO {
   
    public static Connection getDBConnect(){
            Connection con;
            try {

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            con = DriverManager.getConnection(connectionUrl);
                con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=libraries;integratedSecurity=true","sa","Dinhsqlserver2004");
                return con;
            } catch (ClassNotFoundException ex) {
                System.out.println("Where is Driver?");
                System.out.println("Error:" + ex);

            } catch (SQLException ex) {
                System.out.println("Error:" + ex);
            }
            return null;
        }
        static Connection conn = getDBConnect();
        public DAO() {
            if (conn != null) {
                System.out.println("Kết nối thành công");
            } else {
                System.out.println("Kết nối thất bại");
            }
        }
        
        public ArrayList<model_Books>getListStudent(){
            ArrayList<model_Books>list = new ArrayList<>();
            String sql = "SELECT * FROM IN4BOOK";
            try{ 
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                        model_Books hi = new model_Books();
                        hi.setId(rs.getString("ID_BOOK"));
                        hi.setNamebook(rs.getString("TENSACH"));
                        hi.setAuthor(rs.getString("TACGIA"));
                        hi.setCategory(rs.getString("THELOAI"));
                        hi.setPrice(rs.getFloat("GIATIEN"));
                        hi.setQuantity(rs.getInt("SOLUONG"));
                        list.add(hi);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return list;
        }
        
        
        
          public boolean addBooks(model_Books s){
              String sql = "INSERT INTO IN4BOOK(ID_BOOK, TENSACH, TACGIA,THELOAI,GIATIEN,SOLUONG)"+ "VALUES(?,?,?,?,?,?)";
              try{
                  // "?" theo thứ tự của câu lệnh sql
                  PreparedStatement ps =  conn.prepareStatement(sql);
                  ps.setString(1, s.getId());
                  ps.setString(2, s.getNamebook());
                  ps.setString(3, s.getAuthor());
                  ps.setString(4, s.getCategory());
                  ps.setFloat(5, s.getPrice());
                  ps.setInt(6, s.getQuantity());

                  return ps.executeUpdate()>0;
                  
              }catch(Exception e){
              e.printStackTrace();
              }
              return false;
          }
        
          public ArrayList<model_Books>findByName(){
            ArrayList<model_Books>list = new ArrayList<>();
            String sql = "SELECT * FROM IN4BOOK WHERE tenSach =?";
            try{ 
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,  borrow_area.jTextField_findbooks.getText());
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                        model_Books hi = new model_Books();
                        hi.setId(rs.getString("ID_BOOK"));
                        hi.setNamebook(rs.getString("TENSACH"));
                        hi.setAuthor(rs.getString("TACGIA"));
                        hi.setCategory(rs.getString("THELOAI"));
                        hi.setPrice(rs.getFloat("GIATIEN"));
                        hi.setQuantity(rs.getInt("SOLUONG"));
                        
                        list.add(hi);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return list;
        }
        public ArrayList<model_Books>findByNameUp(){
            ArrayList<model_Books>list = new ArrayList<>();
            String sql = "SELECT * FROM IN4BOOK WHERE tenSach =?";
            try{ 
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,  view_updateBooks.jTextField_search.getText());
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                        model_Books hi = new model_Books();
                        hi.setId(rs.getString("ID_BOOK"));
                        hi.setNamebook(rs.getString("TENSACH"));
                        hi.setAuthor(rs.getString("TACGIA"));
                        hi.setCategory(rs.getString("THELOAI"));
                        hi.setPrice(rs.getFloat("GIATIEN"));
                        hi.setQuantity(rs.getInt("SOLUONG"));
                        
                        list.add(hi);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return list;
        }
          public boolean delete_table()throws SQLException{
              delet_muonsach();
              String sql =  "DELETE FROM IN4BOOK WHERE ID_BOOK = ?";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1,borrow_area.abc2().toString());
              return ps.executeUpdate()>0;
          }
          public void delet_muonsach() throws SQLException{
              String sql ="DELETE FROM MUONSACH WHERE ID_BOOK = ?";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1, borrow_area.abc2().toString());
              ps.executeUpdate();
          }
          private int ConvertIntoNumericMOunt(String xVal)
                {
                    int mount;
             try
              { 
                 return mount =Integer.parseInt(xVal) ;
              }
             catch(NumberFormatException ex) 
              {
                 return 0; 
              }
            }
          public int update_table() throws SQLException{
                     String sql = "UPDATE IN4BOOK "+
                             " SET  TENSACH = ? , TACGIA = ? , THELOAI = ? , GIATIEN = ? , SOLUONG = ?  WHERE ID_BOOK = ?  "; 
                     PreparedStatement ps =  conn.prepareStatement(sql);
                     
                     ps.setString(1, view_updateBooks.jTextField_n.getText());
                     ps.setString(2, view_updateBooks.jTextField_a.getText());
                     ps.setString(3, view_updateBooks.jTextField_c.getText());
                     
                     ps.setString(4, view_updateBooks.jTextField_m.getText());
                     ps.setInt(5,ConvertIntoNumericMOunt(view_updateBooks.jTextField_mount.getText()));
                     ps.setString(6, view_updateBooks.jTextField_id.getText());
                    int i = ps.executeUpdate();
                    return i;
          }
              public ArrayList<model_borrower> in4Borrower(){
              ArrayList<model_borrower> list_borrower = new ArrayList<>();
              String sql = "SELECT ST.ID_STUDENT, ST.FULLNAME, ST.CLASS, MS.BORROWED_DATE,MS.RETURN_DATE FROM STUDENT ST, MUONSACH MS, IN4BOOK B \n" +
"WHERE MS.ID_BOOK = ? AND ST.ID_STUDENT  = MS.ID_STUDENT AND MS.ID_BOOK= B.ID_BOOK";
              
              try{
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1, borrow_area.abc().toString());//
                    ResultSet rs = ps.executeQuery();
                    
                    while(rs.next()){
                        model_borrower m = new model_borrower();
                        
                        m.setID_STU(rs.getString("ID_STUDENT"));
                        m.setName(rs.getString("FULLNAME"));
                        m.setClasses(rs.getString("CLASS"));
                        m.setBorrowed_date(rs.getDate("BORROWED_DATE"));
                        m.setReturn_date(rs.getDate("RETURN_DATE"));
                        
                        list_borrower.add(m);
                    }
              }catch(Exception e){
                    e.printStackTrace();
                    }
              return list_borrower;
          }
          public ArrayList<model_borrower> in4Borrower2(){
              ArrayList<model_borrower> list_borrower2 = new ArrayList<>();
              String sql = "SELECT ST.ID_STUDENT, ST.FULLNAME, ST.CLASS, MS.BORROWED_DATE,MS.RETURN_DATE FROM STUDENT ST, MUONSACH MS, IN4BOOK B \n" +
"WHERE MS.ID_BOOK = ? AND ST.ID_STUDENT  = MS.ID_STUDENT AND MS.ID_BOOK= B.ID_BOOK";
              
              try{
                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1, borrow_area.abc2().toString());//
                    ResultSet rs = ps.executeQuery();
                    
                    while(rs.next()){
                        model_borrower m = new model_borrower();
                        
                        m.setID_STU(rs.getString("ID_STUDENT"));
                        m.setName(rs.getString("FULLNAME"));
                        m.setClasses(rs.getString("CLASS"));
                        m.setBorrowed_date(rs.getDate("BORROWED_DATE"));
                        m.setReturn_date(rs.getDate("RETURN_DATE"));
                        
                        list_borrower2.add(m);
                    }
                    
              }catch(Exception e){
                    e.printStackTrace();
                    }
              return list_borrower2;
          }
          
          
          public String idS_query(){
              String id="";
              String sql = "SELECT ID_STUDENT FROM STUDENT S, ACCOUNT_USER A WHERE S.USERNAME = A.USERNAME AND A.USERNAME = ?";
              try{
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1,Login_interfaceU.user_name2);
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  id = rs.getString("ID_STUDENT");
              }
              }catch(SQLException e){
                  e.printStackTrace();
              }
              return id;
          }
          
          public int muon(){
              int i = 0;
              String sql = "INSERT INTO MUONSACH (ID_BOOK, ID_STUDENT, BORROWED_DATE, RETURN_DATE) VALUES (?,?,?,?)";
              try{
                  PreparedStatement ps = conn.prepareStatement(sql);
                  ps.setString(1, borrow_area.abc().toString());
                  ps.setString(2, idS_query());
                  ps.setDate(3,Date.valueOf(java.time.LocalDate.now()));
                  ps.setDate(4, Date.valueOf(java.time.LocalDate.now().plusDays(21)));
                  i =ps.executeUpdate();
              }catch(SQLException e){
                  e.printStackTrace();
              }
              
              return i ;
          }
          int a  = 0;
         public int SOluongBook() throws SQLException{
              String sql = "SELECT SOLUONG FROM IN4BOOK WHERE ID_BOOK = ?";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1, borrow_area.abc().toString());
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                   a = rs.getInt("SOLUONG");
              }
              return a;
          }
          
          public void updateSoLuongBook() throws SQLException{
              String sql = "UPDATE IN4BOOK SET SOLUONG = ? WHERE ID_BOOK = ?";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(2, borrow_area.abc().toString());
              ps.setInt(1, borrow_area.soLuongBook);
             ps.executeUpdate();
         }
          
          public int SOluongBook2() throws SQLException{
              String sql = "SELECT SOLUONG FROM IN4BOOK WHERE ID_BOOK = ?";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1, TraSachaArea.jTextField1.getText());
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                   a = rs.getInt("SOLUONG");
              }
              return a;
          }
          public void updateSoLuongBook2() throws SQLException{
              String sql = "UPDATE IN4BOOK SET SOLUONG = ? WHERE ID_BOOK = ?";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(2, TraSachaArea.jTextField1.getText());
              ps.setInt(1, borrow_area.soLuongBook);
             ps.executeUpdate();
         }
          
          public int demsach() throws SQLException{
              int i = 0;
              String sql ="SELECT QUANTITY FROM STUDENT WHERE ID_STUDENT = ?  ";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1, idS_query());
              ResultSet rs = ps.executeQuery();
              while(rs.next()){
                  i  = rs.getInt("QUANTITY");
              }
              return i;
          }
          
         public void updateUpQuantity() throws SQLException{
              String sql = "UPDATE STUDENT SET QUANTITY = ? WHERE ID_STUDENT  = ?";
              PreparedStatement ps = conn.prepareStatement(sql);
              ps.setString(1,String.valueOf(borrow_area.demSach) );
              ps.setString(2,idS_query() );
              ps.executeUpdate();
          }
         
         public ArrayList<model_borrower> getlistIN2() throws SQLException{
             ArrayList<model_borrower> list  = new ArrayList<>();
             String sql = "SELECT DISTINCT I.ID_BOOK  ,I.TENSACH, M.BORROWED_DATE, M.RETURN_DATE from ACCOUNT_USER A, STUDENT S , MUONSACH M, IN4BOOK I \n" +
"WHERE S.ID_STUDENT = M.ID_STUDENT  AND M.ID_BOOK = I.ID_BOOK AND M.ID_STUDENT = ?";
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, idS_query());
             ResultSet rs= ps.executeQuery();
             while(rs.next()){
                 model_borrower mb = new model_borrower();
                 mb.setIdSach(rs.getString("ID_BOOK"));
                 mb.setTenSach(rs.getString("TENSACH"));
                 mb.setBorrowed_date(rs.getDate("BORROWED_DATE"));
                 mb.setReturn_date(rs.getDate("RETURN_DATE"));
                 
                 list.add(mb);
                 
             }
             return list;
         }
         public boolean xoaSachDM() throws SQLException{
                String sql = "delete from MUONSACH WHERE ID_BOOK = ? AND ID_STUDENT = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, TraSachaArea.jTextField1.getText());
                ps.setString(2, idS_query());
                return ps.executeUpdate()>0;
         }
         public ArrayList<model_borrower> in4brer() throws SQLException{
         
             ArrayList<model_borrower> list = new ArrayList<>();
             String sql ="select S.ID_STUDENT, S.FULLNAME ,S.CLASS, S.HOMETOWN, S.YOB, S.QUANTITY FROM STUDENT S, ACCOUNT_USER A\n" +
"WHERE  S.USERNAME = A.USERNAME and A.USERNAME = ?";
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, user_account_GUI.getValueat().toString());
             ResultSet rs= ps.executeQuery();
             while(rs.next()){
                 model_borrower mb = new model_borrower();
                 mb.setID_STU(rs.getString("ID_STUDENT"));
                 mb.setName(rs.getString("FULLNAME"));
                 mb.setClasses(rs.getString("CLASS"));
                 mb.setHomeTown(rs.getString("HOMETOWN"));
                 mb.setyOB(rs.getString("YOB"));
                 mb.setQuantity_borrowed(rs.getInt("QUANTITY"));
                 list.add(mb);
             }
             return list;
         }
         
         public ArrayList<model_borrower> listDateborrow() throws SQLException{
             ArrayList<model_borrower> list = new ArrayList<>();
             String sql  ="SELECT DISTINCT I.ID_BOOK, I.TENSACH, M.BORROWED_DATE, M.RETURN_DATE FROM IN4BOOK I,  STUDENT S, MUONSACH M \n" +
"WHERE S.ID_STUDENT = M.ID_STUDENT AND M.ID_BOOK = I.ID_BOOK AND M.ID_STUDENT = ?";
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, user_account_GUI.getValueAt2().toString());
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 model_borrower mb = new model_borrower();
                 
                 mb.setIdSach(rs.getString("ID_BOOK"));
                 mb.setTenSach(rs.getString("TENSACH"));
                 mb.setBorrowed_date(rs.getDate("BORROWED_DATE"));
                 mb.setReturn_date(rs.getDate("RETURN_DATE"));
                 
                 list.add(mb);
             }
             return list;
         }
         
         public int tongSachinL() throws SQLException{
             int i = 0;
             String sql = "SELECT COUNT(*) COUNTT FROM IN4BOOK ";
             PreparedStatement ps  = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 i = rs.getInt("COUNTT");
             }
             return i;
         }
         
         public int tongConLai() throws SQLException{
             int i = 0;
             String sql ="SELECT SUM(SOLUONG) A FROM IN4BOOK";
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 i = rs.getInt("A");
             }
             return i;
         }
         
         public int diffCatogery() throws  SQLException{
             int i = 0;
             String sql = "SELECT COUNT(DISTINCT THELOAI) A FROM IN4BOOK ";
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
                 i = rs.getInt("A");
             }
             return i;
         
         }
         public int countAcc() throws SQLException{
            int i = 0;
            String sql = "SELECT COUNT(*) C FROM ACCOUNT_USER";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                i = rs.getInt("C");
            }
            return i;
         }
         
         public ArrayList<model_Books> tenSach_like() throws SQLException {
             ArrayList<model_Books> list = new ArrayList<>();
             String sql = "SELECT * FROM IN4BOOK WHERE TENSACH LIKE ?";
             //try{
             PreparedStatement pr = conn.prepareStatement(sql);
             pr.setString(1,"%"+borrow_area.jTextField_findbooks.getText() +"%");
             ResultSet rs = pr.executeQuery();
             while(rs.next()){
                     model_Books hi = new model_Books();
                        hi.setId(rs.getString("ID_BOOK"));
                        hi.setNamebook(rs.getString("TENSACH"));
                        hi.setAuthor(rs.getString("TACGIA"));
                        hi.setCategory(rs.getString("THELOAI"));
                        hi.setPrice(rs.getFloat("GIATIEN"));
                        hi.setQuantity(rs.getInt("SOLUONG"));
                        
                        list.add(hi);
             }
          //   }catch(Exception e){
             //        e.printStackTrace();
             //        }
             
             return list;
         } 
         
         public ArrayList<model_Books> tenSach_like2() throws SQLException {
             ArrayList<model_Books> list = new ArrayList<>();
             String sql = "SELECT * FROM IN4BOOK WHERE TENSACH LIKE ?";
             //try{
             PreparedStatement pr = conn.prepareStatement(sql);
             pr.setString(1,"%"+view_updateBooks.jTextField_search.getText() +"%");
             ResultSet rs = pr.executeQuery();
             while(rs.next()){
                     model_Books hi = new model_Books();
                        hi.setId(rs.getString("ID_BOOK"));
                        hi.setNamebook(rs.getString("TENSACH"));
                        hi.setAuthor(rs.getString("TACGIA"));
                        hi.setCategory(rs.getString("THELOAI"));
                        hi.setPrice(rs.getFloat("GIATIEN"));
                        hi.setQuantity(rs.getInt("SOLUONG"));
                        
                        list.add(hi);
             }
          //   }catch(Exception e){
             //        e.printStackTrace();
             //        }
             
             return list;
         } 
        public static void main(String[] args) throws SQLException {
            DAO dao = new DAO();
           // System.out.println(dao.SOluongBook());
    }
}
