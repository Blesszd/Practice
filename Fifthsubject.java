package FP;

import java.util.Scanner;

/**
 * 2017.9.19
 * @author ף��
 *����һ���ٷ��Ƶĳɼ�t������ת���ɶ�Ӧ�ĵȼ�������ת���������£�
 *90~100ΪA;
 *80~89ΪB;
 *70~79ΪC;
 *60~69ΪD;
 *0~59ΪE;
 */
public class Fifthsubject {

	public static void main(String[] args) {
		int score;
		char s = 'l';
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		while(s != 'k') {
			if (score <60)
				System.out.println('E');
			else if (score >= 60 && score < 70)
				System.out.println('D');
			else if (score >= 70 && score < 80)
				System.out.println('C');
			else if (score >= 80 && score < 90)
				System.out.println('B');
			else if (score >= 90 && score <= 100)
				System.out.println('A');
			else if (score < 0 || score > 100){
				System.out.println("Score is error!");
				s = 'k';
			}
			score = scanner.nextInt();
		}
	}
}
