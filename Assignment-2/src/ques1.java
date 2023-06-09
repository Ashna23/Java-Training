import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		if (a > 0) {
			System.out.println("Number" + a + " is positive");
		} else if (a < 0) {
			System.out.println("Number" + a + " is negative");
		} else {
			System.out.println("Number" + a + " is neither positive nor negative");
		}

	}

}
