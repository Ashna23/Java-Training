
public class ques7 {

	public static int checkSmallest(int num1, int num2, int num3) {
		if (num1 < num2) {
			if (num1 < num3) {
				return num1;
			}
		} else {
			if (num2 < num3) {
				return num2;
			}
		}
		return num3;
	}

	public static void main(String args[]) {
		System.out.println("The smallest value is" + checkSmallest(25, 27, 39));
	}
}
