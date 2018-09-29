package org.tutorialspoint.section02;

import java.util.*;

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

		printString(arr, new CheckStringWithCondition());
	}

	// Approach 2: Specify Search Criteria Code with policy pattern
	private static void printString(List<String> list, CheckIf checker) {
		for (String str : list) {
			if (checker.test(str))
				System.out.println(str);
		}
	}

}
