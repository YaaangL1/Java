package 作业.预习作业;

import java.util.Scanner;
public class Lv2 {
    public static void main(String arg[]) {
        Scanner Intputn = new Scanner(System.in);
        Scanner Intputk = new Scanner(System.in);
        Scanner inputScanner = new Scanner(System.in);
        String userInput;
        double p;
        double nfactorial = 1.0;//定义n的阶乘
        double kfactorial = 1.0;//定义k的阶乘
        double nkfactorial = 1.0;//定义n-k的阶乘
        do{
            System.out.println("请输入一共有多少个数字");
            int n = Intputn.nextInt();
            System.out.println("请输入你选择的个数");
            int k = Intputk.nextInt();
            for (int i = 1; i <= k; i++) {
                kfactorial *= i;
            }
            for (int i = 1; i <= n; i++) {
                nfactorial *= i;
            }
            for (int i = 1; i <= n - k; i++) {
                nkfactorial *= i;
            }
            p = kfactorial * nkfactorial / nfactorial;
            System.out.println("你中奖的概率是" + p);
            System.out.println("你是否还要再玩一次？请输入 yes 或者 no");
            userInput = inputScanner.nextLine();
        }while(userInput.equals("yes"));
        System.out.println("程序退出");
    }
}