import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = scan.nextInt();
		System.out.println("Enter Second number");
		int b = scan.nextInt();
		System.out.println("Enter Third number");
		int c = scan.nextInt();
		System.out.println("Enter Fourth number");
		int d = scan.nextInt();
		System.out.println("Enter Fifth number");
		int e = scan.nextInt();
		int sum = a + b + c + d + e;
		float average = sum/5;
		System.out.println("Sum of numbers : " + sum);
		System.out.println("Aaverage of numbers : " + average);
		scan.close();
	}
}
