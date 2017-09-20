package FP;

import java.util.Scanner;

/**
 * 2017.9.15
 * @author 祝典
 *完数的定义：如果一个大于1的正整数的所有因子之和等于它的本身，则称这个数是完数，比如6，28都是完数：6=1+2+3；
 *28=1+2+4+7+14。本题的任务是判断两个正整数之间完数的个数。
 *输入数据包含多行，第一行是一个正整数n，表示测试实例的个数，然后就是n个测试实例，每个实例占一行，
 *由两个正整数num1和num2组成,(1<num1,num2<10000) 。
 *对于每组测试数据，请输出num1和num2之间（包括num1和num2）存在的完数个数。
 */

public class Secondsubject {

	public static void main(String[] args) {
		int i,j,k,l,m,account;
		Scanner scanner = new Scanner(System.in);
		//输入需要测几组数据
		i = scanner.nextInt();
		int[][] num = new int[i][2];
		//输入待测数组
		for (j = 0; j < i; j++) {
			for (k = 0; k < 2; k++) {
				num[j][k] = scanner.nextInt();
			}
		}
		//测试数组
		for (j = 0; j < i; j++) {
			l = 0;
			if (num[j][0] > num[j][1]) {
				int tmp = num[j][0] ;
				num[j][0] = num[j][1] ;
				num[j][1] = tmp ;
			}
			//分别判断每组数据中有多少完数
			for (k = num[j][0]; k <= num[j][1]; k++) {
				account = 0;
				for (m = 1; m < k; m++) {
					if ( (k % m) == 0 )
						account = account + m;
				}
				if (account == k)
					l++;
			}
			System.out.println(l);
		}
	}
}	