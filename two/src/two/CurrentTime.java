package two;

import java.util.Scanner;

public class CurrentTime {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the timr zone offset to GMT: ");
		int offset = input.nextInt();
		
		//获取总的毫秒数
		long time = System.currentTimeMillis();
		//得到总的秒数
		long totalSeconds = time / 1000;
		//得到当前的秒数
		long currentSeconds =totalSeconds % 60;
		//得到总的分钟数
		long totalMinutes = totalSeconds / 60;
		//得到当前的分钟数
		long currentMinutes = totalSeconds % 60;
		//得到总的小时数
		long totalHours = totalMinutes / 60;
		//得到当前小时数
		long currentHours = totalHours % 24;
		
		//对于GMT时区偏移后，当前的小时时间点
		currentHours = currentHours + offset;
		
		//显示结果
		System.out.println("The current time is " + currentHours + 
				":" + currentMinutes + ":" + currentSeconds);
	}

}
