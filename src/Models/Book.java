package Models;

public class Book {
    private String name;
    private int año;

    public Book(String name, int año) {
        this.name = name;
        this.año = año;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", año=" + año + "]";
    }
    
    
}
