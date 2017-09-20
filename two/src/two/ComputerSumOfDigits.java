package two;

import java.util.Scanner;

/**
 * 求一个0-1000之间的整数各位数的和
 * @author 段新新
 *
 */
public class ComputerSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//提示用户输入一个0-1000之间地整数
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int digits = 0;
		
		//求出个位上的数字
		int bits = number % 10;;
		digits = number / 10;
		//求出十位上的数字
		int decades = digits % 10;
		//求出百位上的数字
		int hundreds = digits / 10;
		
		//计算出各数位之和
		int sum =bits + decades + hundreds;
		
		//显示结果
		System.out.println("The sum of digits is " + sum);
		
	}

}
