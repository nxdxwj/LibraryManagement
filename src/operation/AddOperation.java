package operation;

import book.Book;

import java.util.ArrayList;

public class AddOperation {
    public AddOperation() {
        System.out.println("===下面是添加页面===");
    }

    public void add(ArrayList<Book> books, String name, String author, int price, String type){
        boolean isBorrowed = false;
        books.add(books.size(),new Book(name,author,price,type,isBorrowed));
        System.out.println("添加完成！新的图书库是："+books);
    }
}
