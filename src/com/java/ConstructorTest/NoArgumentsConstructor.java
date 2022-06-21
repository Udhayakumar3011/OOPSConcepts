package com.java.ConstructorTest;

public class NoArgumentsConstructor {
	int studentID;
	String studentName;

	NoArgumentsConstructor() {
		studentID = 100;
		studentName = "Vcentry";
	}

	public static void main(String[] args) {
		NoArgumentsConstructor obj = new NoArgumentsConstructor();
		System.out.println(obj.studentID);
		System.out.println(obj.studentName);
	}
}
