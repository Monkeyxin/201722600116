package two;

import java.util.Scanner;;

public class CalculateVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double P = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius an high of a cylinder: ");
		double radius = input.nextDouble();
		double high = input.nextDouble();
		
		double area = radius * radius * P;
		double volume = area * high;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}

}
