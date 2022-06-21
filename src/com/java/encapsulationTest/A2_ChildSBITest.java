package com.java.encapsulationTest;

public class A2_ChildSBITest extends A1_ParentHDFCTest {

	public static void main(String[] args) {
		A2_ChildSBITest obj = new A2_ChildSBITest();
		obj.credit();
		obj.debit();
		// loan();
		// exec()
		obj.exec();
		//super.loan(); cant be used in static method
		//this.loan();  cant be used in static method
		
	//	A1_ParentHDFCTest obj1=new A1_ParentHDFCTest();
	//	obj1.loan();
	}

	public void exec() {
	//	super.loan();    //it will triger parent first
		this.loan();     /// it will point child class first
		//this.loan
	}

	public static void loan() {
		System.out.println("SBI-loan");
		
		//Lines 5
		//implement-no
	}
}
