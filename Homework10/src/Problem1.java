
public class Problem1 {

	public static void main(String[] args) {
		double principal = 1000.0; // initial amount before interest
		// display headers
		System.out.printf("%s%8s%20s%n", "Year", "Rate", "Amount on deposit");

		// calculate amount on deposit for each of ten years
		for (int year = 1; year <= 10; ++year) {                  
			for (double rate = 0.05; rate <= 0.1; rate+=0.01) {
				// calculate new amount on deposit for specified year 
				double amount = principal * Math.pow(1.0 + rate, year);                                            
				// display the year and the amount                     
				System.out.printf("%4d%8.2f%,20.2f%n", year, rate, amount);       			
			}
		}
	}

}
