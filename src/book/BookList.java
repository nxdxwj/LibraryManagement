package book;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> books = new ArrayList<Book>();
//    private Book[] books1 = new Book[10];

    boolean isBorrowed = false;
    public BookList() {
        books.add(0,new Book("三国演义","罗贯中",17,"小说",isBorrowed));
        books.add(1,new Book("西游记","吴承恩",20,"小说",isBorrowed));
        books.add(2,new Book("水浒传","施耐庵",31,"小说",isBorrowed));

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
