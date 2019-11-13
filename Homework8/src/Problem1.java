
public class Problem1 {

	public static void main(String[] args) {
		int x=1, y=2,z;
		// Write one statement to assign the sum of x and y to z, then increment x by 1.
		z = x+++y;
		System.out.println(z);
		
		// Test whether variable count is greater than 20. If it is, print "Count is greater than 20".
		int count = 0;
		if (count > 20)
			System.out.println("Count is greater than 20");
		
		// Use one statement to decrement the variable x by 1, then subtract it from variable
		// total and store the result in variable total.
		int total = 0;
	    total = total---x;
		
		// Calculate the remainder after q is divided by divisor, and assign the result to q.
	    int q = 0;
		int divisor = 1;
		q = q% divisor;
		System.out.println(q);
	}

}
