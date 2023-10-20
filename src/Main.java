import user.AdminUser;
import user.NormalUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("请输入姓名：");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("请输入你的身份：");
        System.out.println("0.管理员   1.普通用户");

        int who = input.nextInt();
        if (who==0){
//            return new AdminUser(name);
        }else {
            NormalUser normalUser = new NormalUser();
            normalUser.inital(name);
        }
    }
}
