package com.ericsson.java8;

@FunctionalInterface
interface Calculator {
	public int printName(int num);

	public default void m1() {
		System.out.println("default implementation from m1 with override option");
	}

	public static void m2() {
		System.out.println("static implementation from m2 with out override option");
	}
}

public class FITest {
	public static void main(String[] args) {
		Calculator calc = a -> a*a ;
		System.out.println(calc.printName(23));
	}

}
