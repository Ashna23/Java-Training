import java.util.Scanner;

public class exceptionTask {

	public static void validateUsernamePassword(String user, String password) throws InvalidUsernamePassword {
		if (!(user.equals("ericsson") && password.equals("ericsson123"))) {
			throw new InvalidUsernamePassword("Invalid Credentials");
		} else {
			System.out.println("Login Successfull !");
		}
	}

	public static void main(String[] args) {
		try {

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Username");
			String user = scan.next();
			System.out.println("Enter the Password");
			String password = scan.next();
			exceptionTask.validateUsernamePassword(user, password);
		} catch (InvalidUsernamePassword e) {
		} finally {
			System.out.println("Continue with code");
		}
		System.out.println("Remaining statements");
	}

}
