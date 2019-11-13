import java.util.Scanner;

public class DateValidator2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Day: ");
		int day = input.nextInt();
		System.out.println("Enter Month: ");
		int month = input.nextInt();
		System.out.println("Enter Year: ");
		int year = input.nextInt();
		
		boolean date_valid = true, month_valid = true, day_valid = true, year_valid = true;
		
		boolean is_leap = (year % 4 == 0);
		System.out.println("Is Leap year? " + is_leap);
		
		if(year < 1) year_valid = false;
		if(month < 1 || month > 12) month_valid = false;
		
		int[] maxDayByMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(year_valid && month_valid) {
			if(is_leap && month == 2 && day <= 29 && day >= 1) {
				System.out.println("Day is valid");
			}
			else if(day <= maxDayByMonth[month-1] && day >= 1) {
				System.out.println("Day is Valid");
			}
			else { 
				System.out.println("Day is not Valid");
				day_valid = false; 
			}
		}
		
		date_valid = (day_valid && month_valid && year_valid);
		if(date_valid) {
			System.out.println("Date is valid");
		}
		else {
			System.out.println("Date is not valid");
		}
		
		input.close();
	}
}
