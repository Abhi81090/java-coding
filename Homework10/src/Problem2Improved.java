
public class Problem2Improved {

	private static void printStars(int rep) {
		for(int i=1; i<=rep; i++) {
			System.out.print("*");
		}
	}
	
	private static void printSpaces(int rep) {
		for(int i=1; i<=rep; i++) {
			System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		// Pattern A
				System.out.println("Pattern A");
				for(int i = 1; i <= 10; i++) {
					printStars(i);
					System.out.println();
				}
				
				// Pattern B
				System.out.println("\nPattern B");
				for(int i = 10; i >= 1; i--) {
					printStars(i);
					System.out.println();
				}
				
				// Pattern C
				System.out.println("\nPattern C");
				for(int i = 10; i >= 1; i--) {
					// Print Spaces
					printSpaces(10-i);
					printStars(i);
					System.out.println();
				}
				
				// Pattern D
				System.out.println("\nPattern D");
				for(int i = 1; i <= 10; i++) {
					// Print Spaces
					printSpaces(10-i);
					printStars(i);
					System.out.println();
				}
	}

}
