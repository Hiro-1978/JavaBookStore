
package BookStore;

import java.util.ArrayList;


public class Bill {
    private ArrayList<Book> books = new ArrayList<Book>();
    private double totalPrice = 0;

    /**
     * @return the books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    /**
     * @return the totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void calculatePrice(){
        for(Book book : books){
            totalPrice = totalPrice + book.getPrice();
        }
    }
}
