package two;

import java.util.Scanner;;

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ĵ�ǰ����
		final int currentPopulation = 312032486;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		double totalSeconds, birthNumber, deathNumber, immigrationNumber ;
		//���⼸�����ܵ�����
		totalSeconds = years * 365 * 24 * 60 * 60;
		//����δ������ĳ�����������������������Ǩ������
		birthNumber = totalSeconds / 7.0;
		deathNumber = totalSeconds / 13.0;
		immigrationNumber = totalSeconds / 45.0;
		
		//���㼸�����˿���
		int futurePopulation = (int)(currentPopulation + birthNumber -
				deathNumber + immigrationNumber);
		
		//��ʾ���
		System.out.println("The population in " + years + " years is " + futurePopulation);
		
		
	}

}
