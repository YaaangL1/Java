package study.Examples;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr= {33,19,4,20,100,25,27};
        //一共需要比较N-1轮
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            //第二个循环需要比较N-i轮
            for (int j =i+1; j < arr.length; j++) {
                //j = i + 1:从排序好的数字的下一位开始排序
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            //把找到的最小值与i的位置进行交换
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
