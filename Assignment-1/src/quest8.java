
public class quest8 {

	static float average;

	public static float checkAverage(int n1, int n2, int n3) {

		average = (n1 + n2 + n3) / 3;
		return average;
	}

	public static void main(String args[]) {
		System.out.println(checkAverage(25, 45, 65));
	}
}
