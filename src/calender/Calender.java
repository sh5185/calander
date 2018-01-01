package calender;

import java.util.Scanner;

public class Calender {
	private static final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in );
		Calender c = new Calender();
		int month;
		System.out.println("");
		
				System.out.println("몇월 달력을 출력하시겠습니까?");
				month=scan.nextInt();
				while(month>0) {
				int date=c.getMaxDaysOfMonth(month);
				System.out.println("일     월     화     수     목     금     토");		
					for(int day=1 ;day<date;) {
						for( int count=0; count<7 ;count++,day++) {
							if(day>date) {
								break;
							}
							System.out.print(day+"\t");
						}
						System.out.println();
					}
				}	
	}

}
