package SignIn_interface;

import Homepage.homePage;
import UpdateBooks.view_updateBooks;
import admin_interface.user_account_GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DAO_Account {
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
        public DAO_Account() {
            if (conn != null) {
               // System.out.println("Kết nối thành công");
            } else {
                System.out.println("Kết nối thất bại");
            }
        }
        
        public String signin_userNameU() throws SQLException{
            Account_model ac = new Account_model();
          String user_name = "" ;
          String sql = "SELECT * FROM ACCOUNT_USER WHERE USERNAME = ? ";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1,  Login_interfaceU.jTextField_userName.getText());
          
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              user_name = rs.getString("USERNAME");
          }
          return user_name;
          }
        
        public String signin_passwordU() throws SQLException{
           
            String pas = "";
            String sql = "SELECT PASSWORD FROM ACCOUNT_USER WHERE USERNAME = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, Login_interfaceU.jTextField_userName.getText());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                pas = rs.getString("PASSWORD");
                
            }
            return pas;
        }
        
          public String signin_userNameA() throws SQLException{
          Account_model ac = new Account_model();
          String user_name = "" ;
          String sql = "SELECT * FROM ACCOUNT_ADMIN WHERE USERNAME = ? ";
          PreparedStatement ps = conn.prepareStatement(sql);
          ps.setString(1,  homePage.jTextField_usernameAdmin.getText());
          
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
              user_name = rs.getString("USERNAME");
          }
          return user_name;
          }
          
          
          public String signin_passwordA() throws SQLException{
           
            String pas = "";
            String sql = "SELECT PASSWORD FROM ACCOUNT_ADMIN WHERE USERNAME = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, homePage.jTextField_usernameAdmin.getText());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                
                pas = rs.getString("PASSWORD");
                
            }
            return pas;
        }
          public int register() throws SQLException{
                
                int i = 0;
                //NẾU mật khẩu xác nhận đúng thì thực hiện đăng kí 
                if(String.valueOf(Register_interface.jPasswordField1.getPassword()).equals(String.valueOf(Register_interface.jPasswordField2.getPassword()))){
                    
                    //thêm dữ liệu vào bảng mẹ trước(STUDENT)
                    
                    
                    String sql = "INSERT INTO  ACCOUNT_USER VALUES(?,?)";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, Register_interface.jTextField_username.getText());
                    ps.setString(2, String.valueOf(Register_interface.jPasswordField1.getPassword()));
                    i= ps.executeUpdate();
                     register2();
                    return i;
                   
                }else return 3;
                
                
                
          }
         
public int register2() throws SQLException{
                    int i  = 0;
                    String sql2 = "INSERT INTO STUDENT (ID_STUDENT, FULLNAME, CLASS, HOMETOWN, YOB, USERNAME) VALUES (?,?,?,?,?,?)";
                    PreparedStatement ps2 = conn.prepareStatement(sql2);
                    ps2.setString(1, Register_interface.jTextField_id.getText());
                    ps2.setString(2, Register_interface.jTextField_name.getText());
                    ps2.setString(3, Register_interface.jTextField_cl.getText());
                    ps2.setString(4, Register_interface.jTextField_ht.getText());
                    ps2.setString(5, Register_interface.jTextField_yob.getText());
                    ps2.setString(6, Register_interface.jTextField_username.getText());
                    i = ps2.executeUpdate();
                    return i;
                }
                
          public ArrayList<Account_model> list_userAccount() throws SQLException{
                    ArrayList<Account_model> list = new ArrayList<>();
                    String sql = "SELECT * FROM ACCOUNT_USER";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ResultSet rs= ps.executeQuery();
                    while(rs.next()){
                        Account_model ac = new Account_model();
                        ac.setUserName(rs.getString("USERNAME"));
                        ac.setPassword(rs.getString("PASSWORD"));
                        list.add(ac);
                    }
                    return list;
                }
          
          public ArrayList<Account_model> search_accountU() throws SQLException{
                    ArrayList<Account_model> list = new ArrayList<>();
                    String sql = "SELECT * FROM ACCOUNT_USER WHERE USERNAME = ? ";
                    PreparedStatement ps = conn.prepareStatement(sql);
                    //ps.setString(1, view_updateBooks.jTextField_search.getText());
                    ps.setString(1, user_account_GUI.jTextField_searchA.getText());
                    ResultSet rs= ps.executeQuery();
                    while(rs.next()){
                        Account_model ac = new Account_model();
                        ac.setUserName(rs.getString("USERNAME"));
                        ac.setPassword(rs.getString("PASSWORD"));
                        list.add(ac);
                    }
                    return list;
                }
         
        public static void main(String[] args) {
        new DAO_Account();
    }
}
