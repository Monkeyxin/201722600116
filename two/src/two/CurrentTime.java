package two;

import java.util.Scanner;

public class CurrentTime {
	public static void main(String[] agrs) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the timr zone offset to GMT: ");
		int offset = input.nextInt();
		
		//��ȡ�ܵĺ�����
		long time = System.currentTimeMillis();
		//�õ��ܵ�����
		long totalSeconds = time / 1000;
		//�õ���ǰ������
		long currentSeconds =totalSeconds % 60;
		//�õ��ܵķ�����
		long totalMinutes = totalSeconds / 60;
		//�õ���ǰ�ķ�����
		long currentMinutes = totalSeconds % 60;
		//�õ��ܵ�Сʱ��
		long totalHours = totalMinutes / 60;
		//�õ���ǰСʱ��
		long currentHours = totalHours % 24;
		
		//����GMTʱ��ƫ�ƺ󣬵�ǰ��Сʱʱ���
		currentHours = currentHours + offset;
		
		//��ʾ���
		System.out.println("The current time is " + currentHours + 
				":" + currentMinutes + ":" + currentSeconds);
	}

}
