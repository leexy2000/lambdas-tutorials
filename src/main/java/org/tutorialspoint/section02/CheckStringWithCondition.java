package org.tutorialspoint.section02;

public class CheckStringWithCondition implements CheckIf {

	@Override
	public boolean test(String str) {

		return str.contains("Git") && str.length() > 20;
	}

}
