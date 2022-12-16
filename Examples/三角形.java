package study.Examples;

public class 三角形 {
    public static void main(String[] args) {

        //一行一行输出
        //第一行输出五个空格加一个星号
        //第二行四个三个星号
        //以此类推
        //因此最外面写个大循环
        for (int i = 0; i <=5; i++) {

            //将最左边的空格当作一个倒三角形
            for (int j = 5; j >=i ; j--) {
                System.out.print(" ");
            }

            //把*三角形从中间切开，这个for循环负责左边
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }

            //同理这个for循环负责三角形的右边
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            //每次输出完一行，换行
            System.out.println();
        }
    }
}
