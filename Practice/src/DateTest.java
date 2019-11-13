import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
		// Take input day, month, year from User
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Day: ");
		int day = input.nextInt();
		System.out.println("Enter Month: ");
		int month = input.nextInt();
		System.out.println("Enter Year: ");
		int year = input.nextInt();
		// Create a Date object
		Date myDate1 = new Date(day, month, year);
		// Date myDate1 = new Date(day, month, year);
		// print - myDate1.IsValid() - returns true or false based on date validity
		System.out.println("Is Date valid?"+myDate1.IsValid() );
		// Check if date is in leap year
		System.out.println("Is Leap year? " + myDate1.IsLeapYear());
		// implement myDate1.toString() - which will print the date in dd/mm/yyyy format
		System.out.println(myDate1.toString());
	}

}
