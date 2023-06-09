
public class ques8 {

	public static void main(String[] args) {

		String string1 = "b.v.raju college";
		String string2 = "raju";
		
		if(string1.contains(string2))
			{
			String new_string= string2.toUpperCase();
			string1 = string1.replace(string2 , new_string);
			}
		

		System.out.println(string1);

	}
}
