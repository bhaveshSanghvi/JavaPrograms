/*
	Pattern 1:

	*
	* *
	* * *
	* * * *
	* * * * *
*/

import java.util.Scanner;

class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Pattern1");

		System.out.println("What should be the length of the pattern?");

		Scanner src = new Scanner(System.in);
		int length = src.nextInt();

		for (int i=1;i<=length;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}