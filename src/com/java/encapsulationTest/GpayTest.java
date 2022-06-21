package com.java.encapsulationTest;

public class GpayTest extends A3_CitiBankTest {
	//private int otp
	public static void main(String[] args) {
		GpayTest obj=new GpayTest();
		obj.setOtp(12345);
		System.out.println(obj.getOtp());
		
	}
	
}
