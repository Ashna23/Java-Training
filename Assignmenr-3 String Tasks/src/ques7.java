
public class ques7 {

	public static void main(String[] args) {

		int count = 0;
		String string = "bvrit college";

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'l') {
				count = count + 1;
			}

			if (count == 2) {
				char caps = (string.charAt(i));
				caps = Character.toUpperCase(caps);
				string = string.substring(0, i) + caps + string.substring(i + 1);
				break;
			}

		}

		System.out.println(string);

	}

}
