package two;

import java.util.Scanner;

/**
 * ������������ָ����BMI����
 * ����ֵͨ�������أ�kgΪ��λ��������ߣ�mΪ��λ����ƽ��ֵ�õ���
 * @author ������
 *
 */
public class ComputerBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������ һ����0.45359237���� �� һӢ����0.0254��
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCHES =0.0254;
		
		Scanner input = new Scanner(System.in);
		
		//�����԰�Ϊ��λ��������
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		
		//������Ӣ��Ϊ��λ�������
		System.out.print("Enter height in inches: ");
		double heightInInches = input.nextDouble();
		
		//�����Թ���Ϊ��λ������������������Ϊ��λ�������
		double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		double heightInMeters = heightInInches * METERS_PER_INCHES;
		
		//������������ָ��(BMI)
		double  computerBMI = weightInKilograms / (Math.pow(heightInMeters, 2));
		
		//��ʾ���
		System.out.println("BMI is " + (int)(computerBMI * 100) / 100.0 );		
		
	}

}
