package UpdateBooks;

import java.io.Serializable;

public class model_Books implements Serializable{
    private String id;
    private String namebook;
    private String author;
    private String category;
    private float price;
    private int quantity;

    public model_Books() {
        this.id = "";
        this.namebook ="" ;
        this.author = "";
        this.category = "";
        this.price = 0;
        this.quantity = 0;
    }

    public String getId() {
    return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
