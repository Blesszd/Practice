package oj;
/**
 * 输入一个非负整数n（n≥0），求从0到n之间（注意包括n）所有能被3除尽的数之和。
 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        while (in.hasNext()) {
            n = in.nextInt();
            if (n < 0) {
                return;
            } else {
                int sum = 0;
                for (int i = 0; i < n + 1; i++) {
                    if (i % 3 == 0) {
                        sum = sum + i;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
