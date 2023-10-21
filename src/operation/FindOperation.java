package operation;

import book.Book;
import book.BookList;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOperation {
    public void find(ArrayList<Book> books){
        System.out.println("===查找书籍===");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要查找的书籍：");
        String bookName = input.nextLine();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(bookName)){
                System.out.println("找到这本书的信息如下：");
                System.out.println(books.get(i).toString());
                return;
            }
        }
        System.out.println("图书馆中没有这本书！");
    }
}
