package user;

import java.util.Scanner;

public class NormalUser {
    public void inital(String name){
        int choice =menu(name);
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
