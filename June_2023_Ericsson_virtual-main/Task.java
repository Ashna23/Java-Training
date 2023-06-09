package com.ericsson.exceptions;

public class Task {

	public static void validateAge(int age) throws AgeNotValid {
		if (age < 18) {
			throw new AgeNotValid("You Are Not Eligible To Vote");
		} else {
			System.out.println("You Are Eligible To Vote");
		}
	}

	public static void main(String[] args) {
		try {
			Task.validateAge(12);
		} catch (AgeNotValid e) {
			System.out.println("Age is invalid");
		} finally {
			System.out.println("cleanup code");
		}
		System.out.println("Remaining statements");
	}

}
