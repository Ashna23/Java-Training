package com.ericsson.oops;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number for division");
		int a = scan.nextInt();
		System.out.println("Enter Second number for division");
		int b = scan.nextInt();
		try {
		int result = a / b;
		System.out.println("division two numbers is : " + result);
		}catch(ArithmeticException exception)
		{
			System.out.println("Cannot divide by zero");
		}
		System.out.println("Remaining lines of code");

	}
}
//abnormal termination                normal termination
//system defined error messages	      user friendly error messages 

//try ,catch,finally,throw,throws