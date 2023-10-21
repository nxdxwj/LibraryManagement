package operation;

import book.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BorrowOperation {
    public void borrow( ArrayList<Book> books){
        System.out.println("===借阅图书===");
        System.out.println("请输入你要借的书名：");
        Scanner input = new Scanner(System.in);
        String bookName = input.nextLine();

        for (int i = 0; i < books.size() ; i++) {
            if (books.get(i).getName().equals(bookName) && (! books.get(i).isBorrowed())){
                books.get(i).setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("图书馆中没有此书，借阅失败！");
    }
}
