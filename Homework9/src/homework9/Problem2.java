// Problem 2 of Homework 9

package homework9;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your weight on Earth: ");
		double x = input.nextInt();
		double Effective_Weight_Moon  = x * 0.17;
		System.out.println("Effective weight on Moon: " + Effective_Weight_Moon);
		input.close();
	}
}
