package com.java.ConstructorTest;

public class DefaultConstructorTest {

	int studentID;
	String studentName;
	Integer studentRollNo;

	//default-value provide-complier
	public static void main(String[] args) {
		DefaultConstructorTest obj = new DefaultConstructorTest();
		System.out.println(obj.studentID);
		System.out.println(obj.studentName);
		System.out.println(obj.studentRollNo);
	}
}
