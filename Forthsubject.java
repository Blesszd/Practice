package FP;

import java.util.Scanner;

/**
 * 2017.9.19
 * @author ף��
 *����쵽�ˣ�����ͷ��Э�ᡱ׼����һ���ۻᣬ�Ѿ�֪�����л�ԱN�ˣ��ѻ�Ա��1��N��ţ����л᳤�ĺ�����N�ţ����Ǻͻ᳤�������ѵģ�
 *��ô�û�Ա�ĺ���϶���N�д���1�Ĺ�Լ���������������ѣ����ڻ᳤��֪�������м��������ѣ����������᳤���������
 */
public class Forthsubject {

	public static void main(String[] args) {
		int cn,account;
		Scanner scanner = new Scanner(System.in);
		cn = scanner.nextInt();
		int[] num = new int[cn];
		//�����������
		for (int i = 0;i < cn;i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0;i < cn;i++) {//�ֱ����cn������
			account = num[i] - 1;//acount���������ж��ٸ��ǻ᳤��������
			for (int j = 1;j < num[i];j++) {//��1��ʼ����num[i]�������м����ǻ᳤��������
				for (int k = 2; k <= j;k++) {//���������ж��Ƿ�Ϊ�᳤��������
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
