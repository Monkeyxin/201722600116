package two;

import java.util.Scanner;;

public class CompoundValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����������óɳ���
		final double annuallyInterestRate = 0.05;
		//������������˻���Ǯ��
		System.out.print("Enter the monthly saving amount: ");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		
		//���������
		double monthlyInterestRate = annuallyInterestRate / 12 ;
		
		//�ֱ����1-6���Ż��ϵ�Ǯ��
		double amountOfOneMonth = amount * (1 + monthlyInterestRate);
		double amountOfTwoMonth = (amount + amountOfOneMonth) * (1 + monthlyInterestRate);
		double amountOfThreeMonth = (amount + amountOfTwoMonth) * (1 + monthlyInterestRate);
		double amountOfFourMonth = (amount + amountOfThreeMonth) * (1 + monthlyInterestRate);
		double amountOfFiveMonth = (amount + amountOfFourMonth) * (1 + monthlyInterestRate);
		double amountOfSixMonth = (amount + amountOfFiveMonth) * (1 + monthlyInterestRate);
		
		//��ʾ���������˻���Ǯ��
		System.out.println("After the six month, the account value is $" + 
				(int)(amountOfSixMonth * 100) / 100.0);
		
	}

}
