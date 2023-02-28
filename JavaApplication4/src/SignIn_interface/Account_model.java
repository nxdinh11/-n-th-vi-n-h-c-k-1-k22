package SignIn_interface;

public class Account_model {
        private String userName;
        private String  password;

    public Account_model(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account_model() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
        
}
