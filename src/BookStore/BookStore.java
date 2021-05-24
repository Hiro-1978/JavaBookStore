
package BookStore;

import java.util.ArrayList;

public class BookStore {
    
    public static ArrayList<Book> books;
    public static void main(String[] args){
        books = new ArrayList<Book>();
        LoginWindow loginwindow = new LoginWindow();
        loginwindow.setAlwaysOnTop(true);
        loginwindow.setVisible(true);
    }
    
        public static void checkBook(int index){
        System.out.println("-Book Detail-");
        System.out.println("ISBN : "+ books.get(index).getIsbn());
        System.out.println("ISBN : "+ books.get(index).getName());
    }
}
