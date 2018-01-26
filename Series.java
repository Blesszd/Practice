package oj;

import java.util.Scanner;

/**
 *题目：Eva的家庭作业里有很多数列填空练习。填空练习的要求是：已知数列的前四项，填出第五项。
 * 因为已经知道这些数列只可能是等差或等比数列，她决定写一个程序来完成这些练习。
 *
 * 输入：第一行是数列的数目t（0 <= t <= 20）。以下每行均包含四个整数，表示数列的前四项。
 * 约定数列的前五项均为不大于10^5的自然数，等比数列的比值也是自然数。
 *
 *输出：对输入的每个数列，输出它的前五项
 */

public class Series {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        int series[][] = new int[t][5];
        for (int i = 0;i < t;i++) {
            for (int j = 0;j < 4;j++) {
                series[i][j] = in.nextInt();
            }
        }
        for (int i = 0;i < t;i++) {
            int sum = 1,num;
            num = series[i][1] - series[i][0];
            for (int j = 1;j < 3;j++) {
                if (series[i][j+1] - series[i][j] == num) {
                    sum++;
                }
            }
            if (sum == 3) {
                series[i][4] = series[i][3] + num;
            }else {
                series[i][4] = series[i][3] * (series[i][3] / series[i][2]);
            }
        }
        for (int i = 0;i < t;i++) {
            for (int j = 0;j < 5;j++) {
                System.out.print(series[i][j]+" ");
            }
            System.out.println();
        }
    }
}
