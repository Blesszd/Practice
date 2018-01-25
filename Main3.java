package oj;
/**
 假设a、b、c均为整数，且满足a，b，c 大于1，并且小于等于100，找出所有符合条件：“a2+ b2= c2”的整数组。
 输入：无
 输出：按a从小到大的顺序输出所有满足条件的整数组（若a相同，则按b从小到大的顺序输出），每行一组，每一组数据的输出样式为：
 a*a + b*b = c*c
 */
public class Main {
    public static void main(String[] args) {
        for (int a = 2; a < 101;a++) {
            for (int c = 2; c < 101;c++) {
                for (int b = a; b < 101;b++) {
                    if (a*a + b*b == c*c) {
                        System.out.println(a+"*"+a+" "+"+"+" "+b+"*"+b+" "+"="+" "+c+"*"+c);
                    }
                }
            }
        }
    }
}
