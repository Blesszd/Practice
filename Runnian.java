package runnian;

import java.util.Scanner;

/**
 * 判断某年是否是闰年。
 *
 */
public class Runnian {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year;
        year = in.nextInt();
        if (year < 0 || year > 3000) {
            return ;
        }else {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    System.out.print("N");
                }else {
                    System.out.print("Y");
                }
            }else {
                System.out.print("N");
            }
        }
    }
}
