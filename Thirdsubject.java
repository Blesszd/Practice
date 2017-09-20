package FP;

import java.util.Scanner;

/**
 * 2017.9.19
 * @author 祝典
 *xiaoou33对既是素数又是回文的数特别感兴趣。比如说151既是素数又是个回文。现在xiaoou333想要你帮助他找出某个范围内的素数回文数，
 *请你写个程序找出 a 跟b 之间满足条件的数。(5 <= a < b <= 100,000,000); 
 *这里有许多组数据，每组包括两组数据a跟b。
 *对每一组数据,按从小到大输出a，b之间所有满足条件的素数回文数（包括a跟b）每组数据之后空一行。 
 */
public class Thirdsubject {

	public static void main(String[] args) {
		int begin,end;
		Scanner scanner = new Scanner(System.in);
		
		begin = scanner.nextInt();
		end = scanner.nextInt();
		//先判断待测数据是否为素数
		for (int i = begin;i < end;i++) {
			int k = 0;
			for (int j = 2;j <= i;j++) {
				if ((i % j) != 0)
					k++;
					}
			if (k == (i - 2)) { //再确定待测数据是否为素数的基础上，判断待测数据是否为回文数字
				int val = i,sum = 0;
				while(val != 0) {
					sum = (sum * 10) + (val % 10);
					val = val / 10;
				}
				if (sum == i && i != 2)
					System.out.println(i);
			}
		}		
	}
}
