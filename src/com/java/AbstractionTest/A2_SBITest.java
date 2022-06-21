package com.java.AbstractionTest;

             //Child             //Parent
public class A2_SBITest extends A1_WorldBankTest {

	// inheritance Keyword-extends
	// interface-implements
	public static void main(String[] args) {
		A2_SBITest objsbi=new A2_SBITest();
		//objsbi.credit();
		//objsbi.debit();
		objsbi.loan();
		
	//	A1_WorldBankTest objWorld=new A1_WorldBankTest();
		
		//Object can't be created
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}
	

	

}
