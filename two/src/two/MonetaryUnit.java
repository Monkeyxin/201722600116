package two;

import java.util.Scanner;

/**
 * ���������ֵ���������������λ����������ֱ�ֵ��
 * ���磺1156�ͱ�ʾ����11��Ԫ56����
 * @author ������
 *
 */

public class MonetaryUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in penny, for example 1156: ");
		int amount = input.nextInt();
		
		//amount ���ʱ��ʹ�ã����¶���һ������
		int remainingAmount = amount;
		
		//���ҳ���Ԫ������
		int numberOfDollars = amount / 100;
		remainingAmount = remainingAmount % 100;
		
		//��ʣ���Ǯ�����ҳ�2��5�ֵ�����
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//��ʣ���Ǯ�����ҳ�1�ǵ�����
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//��ʣ��Ǯ�����ҵ�5�ֵ�����
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount;
		
		//��ʣ���Ǯ�����ҵ�1�ֵ�����
		int numberOfPennies = remainingAmount;
		
		//��ʾ���
		System.out.println(amount + " consists of: " + numberOfDollars + 
				" dollars, " + numberOfQuarters + " quarters, " + numberOfDimes +
				" dimes, " + numberOfNickels + " nickels, " + numberOfPennies + 
				" pennies. ");
		
	}

}
