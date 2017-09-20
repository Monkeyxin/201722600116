package two;

import java.util.Scanner;;

public class Population {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//假设的当前人数
		final int currentPopulation = 312032486;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		double totalSeconds, birthNumber, deathNumber, immigrationNumber ;
		//先这几年求总的秒数
		totalSeconds = years * 365 * 24 * 60 * 60;
		//计算未来几年的出生人数，死亡人数和移民迁入人数
		birthNumber = totalSeconds / 7.0;
		deathNumber = totalSeconds / 13.0;
		immigrationNumber = totalSeconds / 45.0;
		
		//计算几年后的人口数
		int futurePopulation = (int)(currentPopulation + birthNumber -
				deathNumber + immigrationNumber);
		
		//显示结果
		System.out.println("The population in " + years + " years is " + futurePopulation);
		
		
	}

}
