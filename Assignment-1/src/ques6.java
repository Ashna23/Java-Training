
public class ques6 {

	static int sum = 0;
	static int diff;
	static int Mutiply;
	static int divide;
	static int mod;

	public static int checkSum(int num1, int num2) {

		return (num1 + num2);
	}

	public static int checkDifference(int num1, int num2) {

		return (num1 - num2);
	}

	public static int checkMultiplication(int num1, int num2) {

		return (num1 * num2);
	}

	public static int calculateDivision(int num1, int num2) {

		return (num1 / num2);
	}

	public static int calculateMod(int num1, int num2) {

		return (num1 % num2);
	}

	public static void main(String args[]) {
		System.out.println(checkSum(125, 24));
		System.out.println(checkDifference(125, 24));
		System.out.println(checkMultiplication(125, 24));
		System.out.println(calculateDivision(125, 24));
		System.out.println(calculateMod(125, 24));
	}

}
