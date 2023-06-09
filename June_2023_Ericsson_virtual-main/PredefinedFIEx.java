package com.ericsson.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFIEx {
	public static boolean m1(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		PredefinedFIEx obj=new PredefinedFIEx();
		
		Predicate<Integer> predicate =PredefinedFIEx::m1; 
		System.out.println(predicate.test(23));
		Predicate<String> predicate1 = a -> a.length() > 6;
		System.out.println(predicate1.test("ericsson"));
		// IntPredicate,BiPredicate
		Consumer<String> consumer = name -> System.out.println(name.length());
		consumer.accept("ericsson");

		Supplier<String> otps = () -> {
			String otp = "";
			for (int i = 1; i <= 4; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		Function<String, String> function = (a) -> a + "india";

		System.out.println(function.apply("ericsson"));

	}

}
