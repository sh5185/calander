package calender;

import java.util.Scanner;

public class getDays {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		int month;
		System.out.println("");
		while (true) {
			System.out.println("��� �޷��� ����Ͻðڽ��ϱ�?");
			month = scan.nextInt();
			if (month < 1) {
				break;
			}
			int date = getMaxDaysOfMonth(month);
			System.out.println("��     ��     ȭ     ��     ��     ��     ��");
			for (int day = 1; day < date;) {
				for (int count = 0; count < 7; count++, day++) {
					if (day > date) {
						break;
					}
					System.out.print(day + "\t");
				}
				System.out.println();
			}
		}
		scan.close();
	}
}
