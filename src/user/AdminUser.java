package user;

import book.Book;
import operation.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminUser {
    public void initial(String name, ArrayList<Book> books) {
        Scanner input = new Scanner(System.in);
        int choice = menu(name);
        while (choice!=0){
            if (choice==1){
                FindOperation findOperation = new FindOperation();
                findOperation.find(books);
            } else if (choice==2) {
                AddOperation addOperation = new AddOperation();

                String bookname =input.nextLine();
                System.out.print("添加图书的名字是："+bookname);

                String bookauthor =input.nextLine();
                System.out.print("添加图书的作者是："+bookauthor);

                int bookprice =input.nextInt();
                System.out.print("添加图书的价格是："+bookprice);

                String booktype =input.nextLine();
                System.out.print("添加图书的类型是："+booktype);
                addOperation.add(books,bookname,bookauthor,bookprice,booktype);
            } else if (choice==3) {
                System.out.println("目前图书库中的图书详细信息为：");
                System.out.println(books);

                System.out.print("接下来你要删除的图书的名字是：");
                String bookname = input.nextLine();
                System.out.println(bookname);

                DelOperation delOperation = new DelOperation();
                delOperation.delete(books,bookname);
            } else if (choice==4) {
                new DisplayOperation(books);
            }
            choice = menu(name);

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
        System.out.println("2.增加图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        System.out.println("======================");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
