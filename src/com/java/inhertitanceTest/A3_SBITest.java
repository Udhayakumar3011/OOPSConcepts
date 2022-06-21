package com.java.inhertitanceTest;
             
              //Child Class      //Parent Class
public class A3_SBITest extends A1_RBITest {

	public static void main(String[] args) {

		// SBI-Child
		credit(); // RBI
		debit(); // RBI     //Debit-RBi/SBI
		internetBanking(); // RBI

		A1_RBITest rbiObj = new A1_RBITest();
		rbiObj.loan();

	}

	public static void EduLoan() {
		System.out.println("SBI_Education Loan function");
	}

}
