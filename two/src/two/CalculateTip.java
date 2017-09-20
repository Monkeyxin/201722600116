package two;

import java.util.Scanner;

/**
 * 
 * @author ¶ÎÐÂÐÂ
 *
 */

public class CalculateTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity: ");
		double subtotal = input.nextDouble();
		double gratuityRate = (input.nextDouble()) / 100.0;
		
		double gratuity = subtotal * gratuityRate;
		double total = subtotal + gratuity;
		
		System.out.println("The gratutity is $" + gratuity + " and total is $" + total );
		
	}

}
