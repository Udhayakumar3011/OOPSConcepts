package com.java.ConstructorTest;

public class ParameterizedConstructorTest {
	int studentID;
	String studentName;

	ParameterizedConstructorTest(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public static void main(String[] args) {
		ParameterizedConstructorTest obj = new ParameterizedConstructorTest(100,"value");
		System.out.println(obj.studentID);
		System.out.println(obj.studentName);

		ParameterizedConstructorTest obj1 = new ParameterizedConstructorTest(101, "Tech");
		System.out.println(obj1.studentID);
		System.out.println(obj1.studentName);
	}
}
