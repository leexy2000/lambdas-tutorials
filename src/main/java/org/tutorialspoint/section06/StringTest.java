package org.tutorialspoint.section06;

import java.util.*;
import java.util.function.Predicate;

public class StringTest {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<>();
		arr.add("Git is a VCS");
		arr.add("Git is a distributed VCS");
		arr.add("Git is free");
		arr.add("Git is free under the GPL");
		arr.add("I love Git");
		arr.add("I have been studying Git for a long time.");
		arr.add("But I'm still not good at it");

		// Lambda Expression
		printString(arr, s -> s.contains("Git") && s.length() > 20);
	}

	// Approach 6: Use Standard Functional Interfaces with Lambda Expressions
	private static void printString(List<String> list, Predicate<String> tester) {
		for (String str : list) {
			if (tester.test(str))
				System.out.println(str);
		}
	}

}
