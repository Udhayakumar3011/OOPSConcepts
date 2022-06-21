package com.java.encapsulationTest;

public class A3_CitiBankTest {

	private int otp; // global

	public void setOtp(int otp) { // local
		this.otp = otp;
		System.out.println("Please Enter the Mobile Number");
	}

	public String getOtp() {
		System.out.println("Please wait we are validating your mobile number");
		//otp login code......
		return "Otp validated successfully";
	}

}
