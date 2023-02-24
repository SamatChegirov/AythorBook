public class Book {
    private String bookName;
    private double price;
    private Author author;
    private int qty = 0;

    public Book(String bookName, double price, int qty, Author author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "BookName: " + bookName + ", price: " + price + ", qty: " + qty + ", author: " + author;
    }
}
