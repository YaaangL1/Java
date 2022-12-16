package study.Examples;

public class 稀疏数组 {
    public static void main(String[] args) {
        //原数组
        int[][] arr0 = new int[6][7];
        arr0[0][3] = 22;
        arr0[0][6] = 15;
        arr0[1][1] = 11;
        arr0[1][5] = 17;
        arr0[2][3] = -6;
        arr0[3][6] = 39;
        arr0[4][0] = 91;
        arr0[5][2] = 28;
        //输出原数组
        for (int[] ints : arr0) {
            for (int anInt : ints) {
                if (anInt >= 10 || anInt < 0) {
                    System.out.print(anInt + " ");
                } else {
                    System.out.print(anInt + "  ");
                }
            }
            System.out.println();
        }
        //转换稀疏数组

        //获取原数组有效值
        int sum = 0;
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr0[i].length; j++) {
                if (arr0[i][j] != 0) {
                    sum++;
                }
            }
        }
        //创建稀疏数组
        int[][] arr1 = new int[sum + 1][3];
        arr1[0][0] = arr0.length;//储存行
        arr1[0][1] = arr0[0].length;//储存列
        arr1[0][2] = sum;//有效值

        //遍历原本的数组将有效值交给稀疏数组

        int count = 0;
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr0[i].length; j++) {
                if (arr0[i][j] != 0) {
                    count++;
                    arr1[count][0] = i;
                    arr1[count][1] = j;
                    arr1[count][2] = arr0[i][j];

                }
            }
        }
        //输出稀疏数组
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i][0] + "\t"
                    + arr1[i][1] + "\t"
                    + arr1[i][2] + "\t");
        }

        //还原数组
        int[][] arr2 = new int[arr1[0][0]][arr1[0][1]];
        for (int i = 1; i < arr1.length; i++) {
            arr2[arr1[i][0]][arr1[i][1]] = arr1[i][2];
        }

        //输出还原的数组

        for (int[] ints : arr2) {
            for (int anInt : ints) {
                if (anInt >= 10 || anInt < 0) {
                    System.out.print(anInt + " ");
                } else {
                    System.out.print(anInt + "  ");
                }
            }
            System.out.println();
        }
    }
}