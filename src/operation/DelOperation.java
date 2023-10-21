package operation;

import book.Book;

import java.util.ArrayList;

public class DelOperation {


    public void delete(ArrayList<Book> books, String bookname){

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(bookname)){
                books.remove(i);
                System.out.println("删除完成！新的图书库是：");
                System.out.println(books);
                return;
            }
        }
        System.out.println("该图书库中还暂时没有这本书，不能进行删除操作！");
    }
}
