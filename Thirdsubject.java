package FP;

import java.util.Scanner;

/**
 * 2017.9.19
 * @author ף��
 *xiaoou33�Լ����������ǻ��ĵ����ر����Ȥ������˵151�����������Ǹ����ġ�����xiaoou333��Ҫ��������ҳ�ĳ����Χ�ڵ�������������
 *����д�������ҳ� a ��b ֮����������������(5 <= a < b <= 100,000,000); 
 *��������������ݣ�ÿ�������������a��b��
 *��ÿһ������,����С�������a��b֮��������������������������������a��b��ÿ������֮���һ�С� 
 */
public class Thirdsubject {

	public static void main(String[] args) {
		int begin,end;
		Scanner scanner = new Scanner(System.in);
		
		begin = scanner.nextInt();
		end = scanner.nextInt();
		//���жϴ��������Ƿ�Ϊ����
		for (int i = begin;i < end;i++) {
			int k = 0;
			for (int j = 2;j <= i;j++) {
				if ((i % j) != 0)
					k++;
					}
			if (k == (i - 2)) { //��ȷ�����������Ƿ�Ϊ�����Ļ����ϣ��жϴ��������Ƿ�Ϊ��������
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
