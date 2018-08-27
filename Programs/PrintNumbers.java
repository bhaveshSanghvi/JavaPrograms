import java.util.Scanner;

class PrintNumbers {
	public static void main(String[] args) {
		System.out.println("How many numbers do you want to print?");
		Scanner src = new Scanner(System.in);
		int number = src.nextInt();

		System.out.println("Numbers:");
		
		for(int i=1;i<=number;i++) {
			System.out.print(i+" ");
		}

		System.out.println();
	}
}