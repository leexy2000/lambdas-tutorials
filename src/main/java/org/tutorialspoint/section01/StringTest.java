package org.tutorialspoint.section01;

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

		printString(arr);
	}

	// Approach 1: Create Methods that Search for Strings
	private static void printString(List<String> list) {
		for (String str : list) {
			if (str.contains("Git") && str.length() > 20)
				System.out.println(str);
		}
	}

}
