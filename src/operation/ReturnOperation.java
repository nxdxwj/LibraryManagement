package operation;

import book.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnOperation {
    public void returnBook( ArrayList<Book> books){
        System.out.println("===归还图书===");
        System.out.print("请输入你要归还的书名：");
        Scanner input = new Scanner(System.in);
        String bookName = input.nextLine();

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(bookName)){
                books.get(i).setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("这本书不是该图书馆的，归还失败！");
    }
}
