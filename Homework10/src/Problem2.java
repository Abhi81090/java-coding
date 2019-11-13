
public class Problem2 {

	public static void main(String[] args) {
		// Pattern A
		System.out.println("Pattern A");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// Pattern B
		System.out.println("\nPattern B");
		for(int i = 10; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// Pattern C
		System.out.println("\nPattern C");
		for(int i = 10; i >= 1; i--) {
			// Print Spaces
			for(int j = 1; j <= 10-i; j++) {
				System.out.print(' ');
			}
			// Print Stars
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		// Pattern D
		System.out.println("\nPattern D");
		for(int i = 1; i <= 10; i++) {
			// Print Spaces
			for(int j = 1; j <= 10-i; j++) {
				System.out.print(' ');
			}
			// Print Stars
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
