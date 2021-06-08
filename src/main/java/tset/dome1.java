package tset;

import java.util.Scanner;

/*
* 计算
* */
public class dome1 {
    public static void main(String[] args) {
        int time;
        int sum = 0;
        double avg = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i<6;i++){
            System.out.println("请输入周" + i+"的学习时间:");
            time = input.nextInt();
            sum = sum + time;
        }
        avg = (double)sum / 5;
        System.out.println("周一至周五每日平均学习时间是" +avg+"小时");
    }
}
