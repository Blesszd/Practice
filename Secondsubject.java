package FP;

import java.util.Scanner;

/**
 * 2017.9.15
 * @author ף��
 *�����Ķ��壺���һ������1������������������֮�͵������ı�����������������������6��28����������6=1+2+3��
 *28=1+2+4+7+14��������������ж�����������֮�������ĸ�����
 *�������ݰ������У���һ����һ��������n����ʾ����ʵ���ĸ�����Ȼ�����n������ʵ����ÿ��ʵ��ռһ�У�
 *������������num1��num2���,(1<num1,num2<10000) ��
 *����ÿ��������ݣ������num1��num2֮�䣨����num1��num2�����ڵ�����������
 */

public class Secondsubject {

	public static void main(String[] args) {
		int i,j,k,l,m,account;
		Scanner scanner = new Scanner(System.in);
		//������Ҫ�⼸������
		i = scanner.nextInt();
		int[][] num = new int[i][2];
		//�����������
		for (j = 0; j < i; j++) {
			for (k = 0; k < 2; k++) {
				num[j][k] = scanner.nextInt();
			}
		}
		//��������
		for (j = 0; j < i; j++) {
			l = 0;
			if (num[j][0] > num[j][1]) {
				int tmp = num[j][0] ;
				num[j][0] = num[j][1] ;
				num[j][1] = tmp ;
			}
			//�ֱ��ж�ÿ���������ж�������
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