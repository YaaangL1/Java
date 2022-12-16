package 作业.预习作业;

import java.util.Scanner;
public class Lv1_plus {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("请输入你最近七天的睡眠时间(间范围为[7, 12])：");
            int avs = 0;             //每周睡眠时间
            double t;//平均睡眠时间
            for (int i = 0; i < 7; i++) {
                int ds = sc.nextInt();   //每天睡眠时间
                if (ds < 7 || ds > 12) {
                    System.out.println("你输入了我认知意外的睡眠时间哦，请重新输入");
                    i--;
                } else {
                    avs += ds;
                }
            }
            t = avs / 7.0;
            System.out.println("你最近七天平均每天睡了" + t + "小时");
            if (t <= 10) {
                System.out.println("“熬夜有害身体，差不多得了");
            } else {
                System.out.println("“你怎么睡的着的");
            }
            System.out.println("你是否还要再玩一次？请输入 yes 或者 no");
            userInput = inputScanner.nextLine();
        }while(userInput.equals("yes"));
        System.out.println("程序退出");
    }
}