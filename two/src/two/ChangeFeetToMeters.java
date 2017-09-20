package two;

import java.util.Scanner;

public class ChangeFeetToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of feet: ");
		double feet = input.nextDouble();
		
		double meters = feet * 0.305;
		
		System.out.println(feet + "feet is " + meters + " meters");
	}

}
