package two;

import java.util.Scanner;;

/**
 * �������
 * �û����������������ʮ�ڣ�Ȼ����ʾ��Щ�����������˶�����Ͷ�����
 * ����һ����365��
 * @author ������
 *
 */

public class ComputerYears {
	public static void main(String[] args) {
		
		//�û����������
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int number = input.nextInt();
		
		//��������ķ������Ƕ����������
		int days = (int)number / (60 * 24);
		int years = days /  365;
		int remainingDays = days % 365;
		
		//��ʾ���
		System.out.println(number + " minutes is approximately " 
				+ years + " years and " + remainingDays + " days");
	}
}
