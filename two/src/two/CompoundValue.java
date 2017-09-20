package two;

import java.util.Scanner;;

public class CompoundValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将年利率设置成常量
		final double annuallyInterestRate = 0.05;
		//输入存入银行账户的钱数
		System.out.print("Enter the monthly saving amount: ");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		
		//求得月利率
		double monthlyInterestRate = annuallyInterestRate / 12 ;
		
		//分别求得1-6月张华上的钱数
		double amountOfOneMonth = amount * (1 + monthlyInterestRate);
		double amountOfTwoMonth = (amount + amountOfOneMonth) * (1 + monthlyInterestRate);
		double amountOfThreeMonth = (amount + amountOfTwoMonth) * (1 + monthlyInterestRate);
		double amountOfFourMonth = (amount + amountOfThreeMonth) * (1 + monthlyInterestRate);
		double amountOfFiveMonth = (amount + amountOfFourMonth) * (1 + monthlyInterestRate);
		double amountOfSixMonth = (amount + amountOfFiveMonth) * (1 + monthlyInterestRate);
		
		//显示第六个月账户的钱数
		System.out.println("After the six month, the account value is $" + 
				(int)(amountOfSixMonth * 100) / 100.0);
		
	}

}
