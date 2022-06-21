package com.java.ConstructorTest;

public class ChildConstructorTest extends ParentConstructorTest {

	public ChildConstructorTest() {
		
		//this and super
		//super();
		System.out.println("Child");
	}

	public static void main(String[] args) {
		ChildConstructorTest childObj = new ChildConstructorTest();
		//ParentConstructorTest
	}
}
