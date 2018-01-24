package oj;

import java.util.Scanner;

/**
 给出一系列非负整数，判断是否是一个回文数。回文数指的是正着写和倒着写相等的数。
 输入：若干行，每行是一个非负整数（不超过99999999）
 输出：对每行输入，如果其是一个回文数，输出YES。否则输出NO。
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        while (in.hasNext()) {
            number = in.nextInt();
            if(number < 10 && number >= 0) {
                System.out.println("YES");
            } else {
                    int num;
                    num = number;
                    int sum;
                    sum = num % 10;
                    num = num / 10;
                    while (num >= 10) {
                        sum = sum * 10 + num % 10;
                        num = num / 10;
                    }
                    sum = sum * 10 + num;
                    if (sum == number) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
