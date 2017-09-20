package two;

import java.util.Scanner;;

/**
 * 求出年数
 * 用户输入分钟数（比如十亿）然后显示这些分钟数代表了多少年和多少天
 * 假设一年有365天
 * @author 段新新
 *
 */

public class ComputerYears {
	public static void main(String[] args) {
		
		//用户输入分钟数
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int number = input.nextInt();
		
		//计算输入的分钟数是多少年多少天
		int days = (int)number / (60 * 24);
		int years = days /  365;
		int remainingDays = days % 365;
		
		//显示结果
		System.out.println(number + " minutes is approximately " 
				+ years + " years and " + remainingDays + " days");
	}
}
