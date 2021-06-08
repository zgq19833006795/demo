package tset;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ke ="";
        do {
            System.out.println("请输入课程代码:");
            ke = input.nextLine();
            if (ke.equals("1")){
                System.out.println("JAvA语言");
            }else if (ke.equals("2")){
                System.out.println("学习数学");
            }else if (ke.equals("3")){
                System.out.println("学习语文");
            }
            else if (ke.equals("4")){
                System.out.println("学习英语1");
                System.out.println("学习画画啊啊啊啊啊啊");
            }else if (ke.equals("n")){
                System.out.println("退出系统");
                break;
            }else {
                System.out.println("输入错误");
            }
        }while (true);
    }
}
