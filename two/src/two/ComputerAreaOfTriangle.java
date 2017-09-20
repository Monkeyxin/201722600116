package two;

import java.util.Scanner;

/**
 * 提示用户输入三角形的三个点（x1,y1），（x2,y2），（x3,y3），
 * 然后显示它的面积
 * @author 段新新
 *
 */

public class ComputerAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		  
		//用户输入三角形的三个点坐标（x1,y1），（x2,y2），（x3,y3）
		System.out.print("Enter three points for a triangle: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		/*用两点间距离公式计算三角形三边的长度，
		 * e.g: a = [(x2-x1)^2 + (y2-y1)^2]^(0.5)  * 
		 */
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		double side3 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		
		//根据所给的面积公式求面积
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		//显示结果
		System.out.println("The area of the triangle is " + (int)(area * 10) / 10.0);
	}

}
