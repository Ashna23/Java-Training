import java.util.Scanner;

public class ques2 {

	public static int checkGreatest(int num1, int num2, int num3) {
		if (num1 > num2) {
			if (num1 > num3) {
				return num1;
			}
		} else {
			if (num2 > num3) {
				return num2;
			}
		}
		return num3;
	}

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = scan.nextInt();
		System.out.println("Enter Second number");
		int b = scan.nextInt();
		System.out.println("Enter third number");
		int c = scan.nextInt();
		System.out.println("The greatest value is " + checkGreatest(a, b, c));
	}
}
