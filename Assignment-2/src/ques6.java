import java.util.Scanner;

public class ques6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee Id");
		String id = scan.next();
		System.out.println("Enter employee name");
		String name = scan.next();
		System.out.println("Enter employee salary");
		int salary = scan.nextInt();
		System.out.println("Enter employee address");
		String address = scan.next();
		System.out.println("Enter employee contact");
		int contact = scan.nextInt();
		System.out.println("Enter employee gender");
		String gender = scan.next();
		System.out.println("Employee Details - Name: " + name + " Id:" + id + " Salary:" + salary + " Address: "
				+ address + " Contact: " + contact + " Gender: " + gender);
		scan.close();
	}

}
