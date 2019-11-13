public class Date {
	// Instance Variables
	private int day;
	private int month;
	private int year;
		
	// Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	// Function
	public boolean IsValid() {
		boolean day_valid = true, month_valid = true, year_valid = true;
		
		// Year Valid
		if(year < 1) year_valid = false;
		
		// Month Valid
		if(month < 1 || month > 12) month_valid = false;
		
		// Day Valid
		int[] maxDayByMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(year_valid && month_valid) {
			if(this.IsLeapYear() && month == 2 && day <= 29 && day >= 1) {
			}
			else if(day <= maxDayByMonth[month-1] && day >= 1) {
			}
			else { 
				day_valid = false; 
			}
		}
		boolean date_valid = (day_valid && month_valid && year_valid);
		return date_valid;
	}
	
	public String toString() {
		return (this.day + "/" + this.month +  "/" + this.year);
		
	}
	
	public boolean IsLeapYear() {
		return year % 4 == 0;
	}
}	
