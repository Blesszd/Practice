package FP;

import java.util.Scanner;
import java.lang.Math;

/**
 * 2017.9.15
 * 春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的：
“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。
现在要求输出所有在m和n范围内的水仙花数。
 * @author 祝典
 *
 */
public class Firstsubject {

	public static void main(String[] args) {
			int k;
			Scanner scanner = new Scanner(System.in);
				int m = scanner.nextInt();
				int n = scanner.nextInt();
				for (int j = m;j < n;j++) {//先对第一组数据进行判断
					int a = j % 10;
					int b = (j % 100) / 10;
					int c = j / 100;
					if ( (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) == j) 
						System.out.println(j);
				}
		}	
}

