package FP;

import java.util.Scanner;
import java.lang.Math;

/**
 * 2017.9.15
 * �������ʻ��ļ��ڣ�ˮ�ɻ��������������˵Ĵ�����ѧ���и�ˮ�ɻ�����������������ģ�
��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3��
����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
 * @author ף��
 *
 */
public class Firstsubject {

	public static void main(String[] args) {
			int k;
			Scanner scanner = new Scanner(System.in);
				int m = scanner.nextInt();
				int n = scanner.nextInt();
				for (int j = m;j < n;j++) {//�ȶԵ�һ�����ݽ����ж�
					int a = j % 10;
					int b = (j % 100) / 10;
					int c = j / 100;
					if ( (Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) == j) 
						System.out.println(j);
				}
		}	
}

