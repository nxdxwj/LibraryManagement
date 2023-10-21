package user;

import book.Book;
import book.BookList;
import operation.BorrowOperation;
import operation.ExitOperation;
import operation.FindOperation;
import operation.ReturnOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class NormalUser {
    public void inital(String name, ArrayList<Book> books){
        int choice =menu(name);
        while (choice!=0){
            if (choice==1) {
                FindOperation findOperation = new FindOperation();
                findOperation.find(books);
            } else if (choice==2) {
                BorrowOperation borrowOperation = new BorrowOperation();
                borrowOperation.borrow(books);
            } else if (choice==3) {
                ReturnOperation returnOperation = new ReturnOperation();
                returnOperation.returnBook(books);
            }
            System.out.println("    ");
            choice =menu(name);
        }
        if (choice==0){
            ExitOperation exitOperation = new ExitOperation();
            exitOperation.exit();
        }

    }
    private int menu(String name){
        System.out.println("======普通用户菜单======");
        System.out.println("Hello，"+name+"! 下面请选择你的操作。");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("======================");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
