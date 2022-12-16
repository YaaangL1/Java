package 作业.第一次作业;
import java.util.Scanner;
import java.util.Arrays;
public class Lv2 {
    public static void main(String[] args) {
        int[] arr= {33,19,4,20,100};

        //输出排序前的结果
        System.out.println("排序前的数据为：");
        System.out.println(Arrays.toString(arr));


        System.out.println("输入1调用冒泡排序，其他数字调用选择排序");
        Scanner sc = new Scanner(System.in);
        int isPrime = sc.nextInt();
        if(isPrime == 1){
            //调用冒泡排序
            bubbleSort(arr);
            //输出排序后的结果
            System.out.println("冒泡排序后的结果为：");
            System.out.println(Arrays.toString(arr));
        }else {
            //调用选择排序
            selectSort(arr);
            //输出
            System.out.println("选择排序后的结果为：");
            System.out.println(Arrays.toString(arr));
        }


        //向数组中添加数值
        System.out.println("请输入你想添加的数值：");
        Scanner addInt = new Scanner(System.in);
        int add = addInt.nextInt();
        int[] arrAdd = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arrAdd[i] = arr[i];
        }
        arrAdd[5] = add;



        System.out.println("输入1调用冒泡排序，其他数字调用选择排序");
        Scanner scanner = new Scanner(System.in);
        int isPrime2 = sc.nextInt();
        if(isPrime2 == 1){
            //调用冒泡排序
            bubbleSort(arrAdd);
            //输出排序后的结果
            System.out.println("冒泡排序后的结果为：");
            System.out.println(Arrays.toString(arrAdd));
        }else {
            //调用选择排序
            selectSort(arrAdd);
            //输出
            System.out.println("选择排序后的结果为：");
            System.out.println(Arrays.toString(arrAdd));
        }


    }
    //冒泡排序方法
    public static int[] bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j]>=arr[j+1]){
                    int temp;
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    //选择排序方法
    public static int[] selectSort(int arr[]){
        //一共进行N-1次循环
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;//取遍数组的每一个值
            //每次排序好一个数字后内层循环需要的次数就减少一次
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            //将max与i代表的值交换
            if(i!=max){
                int temp;
                temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        return arr;
    }
}
