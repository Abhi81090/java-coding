import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input.nextInt();
		System.out.println("Enter Day: ");
		int day = input.nextInt();
		System.out.println("Enter Month: ");
		int month = input.nextInt();
		System.out.println("Enter Year: ");
		int year = input.nextInt();
		boolean is_leap;
		boolean date_valid = true;
		int rem = year % 4;
		if (rem == 0) {
			is_leap = true;
		}	
		else {
			is_leap = false;
		}
		System.out.println("Is Leap year? " + is_leap);
		
		boolean month_valid = true;
		// Check month is less than 12 and greater than 1
		if (month <= 12 && month >= 1) {
			System.out.println("Month is valid");
		}
		else {
			month_valid = false;
			System.out.println("Month is not valid");
		}
		
		// Check day (Jan,March,may,july,Aug,Oct,Dec) = 31
		boolean day_valid = true;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if ( day <= 31 && day >=1) {
				day_valid = true;
				System.out.println("Day is valid");
			}
			else {
				day_valid = false;
				System.out.println("Day is not valid");
			}
		}
		else if (month == 4 || month ==6 || month == 9 || month == 11) {
			if ( day <= 30 && day >=1) {
				day_valid = true;
				System.out.println("Day is valid");
			}
			else {
				day_valid = false;
				System.out.println("Day is not valid");
			}
		}
		else if (month == 2) {
			if (is_leap == true) {
				if(day <= 29 && day>=1) {
					day_valid = true;
					System.out.println("Day is valid");
				 }
				else{
					day_valid = false;
					System.out.println("Day is not valid");
				}
			}
			else if ( day <= 28 && day >=1 ) {
				day_valid = true;
				System.out.println("Day is valid");
			}
			else {
				day_valid = false;
				System.out.println("Day is not valid");
			}	
		}
		else {
			System.out.println("Date is not Valid");
		}
		
		if (day_valid == true && month_valid == true)
			{System.out.println("Date is valid");}
		else {
			System.out.println("Date is not valid");	
		}
		input.close();
	}
}
