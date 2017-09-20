package two;

import java.util.Scanner;

/**
 * 输入的输入值是整数，其最后两位代表的是美分币值。
 * 例如：1156就表示的是11美元56美分
 * @author 段新新
 *
 */

public class MonetaryUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in penny, for example 1156: ");
		int amount = input.nextInt();
		
		//amount 输出时会使用，重新定义一个变量
		int remainingAmount = amount;
		
		//先找出美元的数量
		int numberOfDollars = amount / 100;
		remainingAmount = remainingAmount % 100;
		
		//在剩余的钱数中找出2角5分的数量
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		//在剩余的钱数中找出1角的数量
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		//在剩余钱数中找到5分的数量
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount;
		
		//在剩余的钱数中找到1分的数量
		int numberOfPennies = remainingAmount;
		
		//显示结果
		System.out.println(amount + " consists of: " + numberOfDollars + 
				" dollars, " + numberOfQuarters + " quarters, " + numberOfDimes +
				" dimes, " + numberOfNickels + " nickels, " + numberOfPennies + 
				" pennies. ");
		
	}

}
