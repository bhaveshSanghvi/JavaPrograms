/*

	Pattern 3:

	* * * * *
	* * * *
	* * *
	* *
	*

*/

import java.util.Scanner;

class Pattern3 {
	public static void main(String[] args) {
		System.out.println("What should be the length of the pattern");
		Scanner src = new Scanner(System.in);

		int length = src.nextInt();

		for (int i=length; i>=1; i--) {
			for (int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}