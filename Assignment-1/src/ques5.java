class Employee
{
	int empid , empsal;
	String empname, empaddress, empemail;
	
	public Employee(int empid , int empsal , String empname , String empaddress , String empemail)
	
	{
		this.empid = empid;
		this.empsal =empsal;
		this.empname = empname;
		this.empaddress =empaddress;
		this.empemail =empemail;
	}
	
}

public class ques5 {

	public static void main(String args[])
	{
		Employee emp1 = new Employee(1, 1234567 , "ashna" , "gurugram" , "ashna@gmail.com");
		System.out.println(emp1.empid);
		System.out.println(emp1.empname);
		System.out.println(emp1.empsal);
		System.out.println(emp1.empaddress);
		System.out.println(emp1.empemail);
	}
}
