package com.java.ConstructorTest;

public class ConstructorOverloadingTest {

	public void draw(int a, String b) {
		System.out.println("draw-no arg");
	}

	public void draw(String b, int a) {
		System.out.println("draw-arg");
	}

	int a = 10;
	String b="Hello";

	ConstructorOverloadingTest(int a, String b) {
		System.out.println("First");
	}

	ConstructorOverloadingTest(String a, int b) {
		System.out.println("Second");
	}
}
