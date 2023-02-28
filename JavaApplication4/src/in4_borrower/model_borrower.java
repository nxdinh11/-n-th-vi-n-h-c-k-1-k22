package in4_borrower;

import java.util.Date;

public class model_borrower {
        private String ID_STU;
        private String name;
        private String classes;
        private String homeTown;
        private String yOB;
        private int quantity_borrowed;
        private Date borrowed_date ;
        private Date return_date;
        private String tenSach;
        private String idSach;
    public model_borrower() {
    }

    public model_borrower(String ID_STU, String name, String classes, String homeTown, String yOB, int quantity_borrowed) {
        this.ID_STU = ID_STU;
        this.name = name;
        this.classes = classes;
        this.homeTown = homeTown;
        this.yOB = yOB;
        this.quantity_borrowed = quantity_borrowed;
        
    }

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

    
    
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    
    public String getID_STU() {
        return ID_STU;
    }

    public void setID_STU(String ID_STU) {
        this.ID_STU = ID_STU;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getyOB() {
        return yOB;
    }

    public void setyOB(String yOB) {
        this.yOB = yOB;
    }

    public int getQuantity_borrowed() {
        return quantity_borrowed;
    }

    public void setQuantity_borrowed(int quantity_borrowed) {
        this.quantity_borrowed = quantity_borrowed;
    }

    public Date getBorrowed_date() {
        return borrowed_date;
    }

    public void setBorrowed_date(Date borrowed_date) {
        this.borrowed_date = borrowed_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }

        
        
        
}