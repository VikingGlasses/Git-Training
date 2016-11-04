
/**
 *
 * @author Harald
 */
public class Book {

    private String name;
    private Author author[];
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        String out = "";
        for (Author a : this.author){
            out += a;
        }
        return out;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String out="";
        for (int i = 0; i<this.author.length;i++){
            out += this.author[i].getName() + ", ";
        }
        
        
        return "Book: " + this.name + "\nAuthor: " + out
                + "\nPrice: " + this.getPrice() + "\nqty: " + this.getQty();
    }

}
