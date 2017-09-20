package FP;

import java.util.Scanner;

/**
 * 2017.9.19
 * @author 祝典
 *新年快到了，“猪头帮协会”准备搞一个聚会，已经知道现有会员N人，把会员从1到N编号，其中会长的号码是N号，凡是和会长是老朋友的，
 *那么该会员的号码肯定和N有大于1的公约数，否则都是新朋友，现在会长想知道究竟有几个新朋友？请你编程序帮会长计算出来。
 */
public class Forthsubject {

	public static void main(String[] args) {
		int cn,account;
		Scanner scanner = new Scanner(System.in);
		cn = scanner.nextInt();
		int[] num = new int[cn];
		//输入待测数组
		for (int i = 0;i < cn;i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0;i < cn;i++) {//分别测试cn组数据
			account = num[i] - 1;//acount用来计数有多少个是会长的新朋友
			for (int j = 1;j < num[i];j++) {//从1开始数到num[i]，看看有几个是会长的新朋友
				for (int k = 2; k <= j;k++) {//单个数字判断是否为会长的新朋友
					if ((j % k) == 0 && (num[i] % k) == 0) { 
						account = account - 1;
						break;
					}
				}
			}
			System.out.println(account);
		}
	}		
}
