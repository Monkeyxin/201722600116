package two;

import java.util.Scanner;

/**
 * ��һ��0-1000֮���������λ���ĺ�
 * @author ������
 *
 */
public class ComputerSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʾ�û�����һ��0-1000֮�������
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int digits = 0;
		
		//�����λ�ϵ�����
		int bits = number % 10;;
		digits = number / 10;
		//���ʮλ�ϵ�����
		int decades = digits % 10;
		//�����λ�ϵ�����
		int hundreds = digits / 10;
		
		//���������λ֮��
		int sum =bits + decades + hundreds;
		
		//��ʾ���
		System.out.println("The sum of digits is " + sum);
		
	}

}
