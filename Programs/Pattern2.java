/*

	Pattern 2:

	1
	1 2 
	1 2 3
	1 2 3 4 
	1 2 3 4 5

*/

import java.util.Scanner;

class Pattern2 {
	public static void main(String args[]) {

		System.out.println("What should be the length of the pattern?");
		Scanner src = new Scanner(System.in);
		int length = src.nextInt();

		for (int i=1; i<=length; i++) {
			for (int j=1; j<=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}