package two;

import java.util.Scanner;

public class ComputerInterestUsingTheConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		double interest = balance * (interestRate / 1200);
		
		System.out.println("The interest is " + (int)(interest *100) / 100.0);
	}

}
