
public class ques2 {
	public static void main(String[] args) {

		String string = "java standard edition";
		String new_string = " ";

		string = new_string + string;
		for (int i = 0; i < string.length();) {
			char ch = string.charAt(i);
			if (ch == ' ') {

				new_string = new_string + " " + Character.toUpperCase(string.charAt(i + 1));
				i = i + 2;

			}

			else {
				new_string = new_string + string.charAt(i);
				i = i + 1;
			}

		}

		System.out.println(new_string);

	}

}
