/*

	Pattern 5:

			   *
			 * * *
		   * * * * *
		 * * * * * * *
	   * * * * * * * * *
	 * * * * * * * * * * *
   * * * * * * * * * * * * *

*/

import java.util.Scanner;

class Pattern5 {
	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);

		System.out.println("what should be the length of the pattern?");
		int length = src.nextInt();

		for (int i=length; i>1; i--) {
			for (int j=i; j>1; j--) {
				System.out.print("  ");
			}
			for(int k=i; k<=length; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}