package two;

import java.util.Scanner;

/**
 * 计算身体质量指数（BMI）。
 * 它的值通过将体重（kg为单位）除以身高（m为单位）的平方值得到。
 * @author 段新新
 *
 */
public class ComputerBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义两个常量 一磅是0.45359237公斤 ， 一英寸是0.0254米
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCHES =0.0254;
		
		Scanner input = new Scanner(System.in);
		
		//输入以磅为单位的体重数
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		
		//输入以英尺为单位的身高数
		System.out.print("Enter height in inches: ");
		double heightInInches = input.nextDouble();
		
		//计算以公斤为单位的体重数，计算以米为单位的身高数
		double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		double heightInMeters = heightInInches * METERS_PER_INCHES;
		
		//计算身体质量指数(BMI)
		double  computerBMI = weightInKilograms / (Math.pow(heightInMeters, 2));
		
		//显示结果
		System.out.println("BMI is " + (int)(computerBMI * 100) / 100.0 );		
		
	}

}
