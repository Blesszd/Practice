package oj;
/**
 * 一个笼子里面关了鸡和兔子（鸡有2只脚，兔子有4只脚，没有例外）。已经知道了笼子里面脚的总数a，问笼子里面至少有多少只动物，至多有多少只动物。
 * 输入：一行，一个正整数a (a < 32768)。
 * 输出：一行，包含两个正整数，第一个是最少的动物数，第二个是最多的动物数，两个正整数用一个空格分开。
 * 如果没有满足要求的答案，则输出两个0，中间用一个空格分开。
 */
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int foot;
        foot = in.nextInt();
        if (foot % 2 != 0) {
            System.out.print(0 + " " + 0);
        } else {
            if (foot < 2 || foot > 32767) {
                System.out.print(0 + " " + 0);
            } else {
                int min, max;
                min = foot / 4 + (foot % 4) / 2;
                max = foot / 2;
                System.out.print(min + " " + max);
            }
        }
    }
}
