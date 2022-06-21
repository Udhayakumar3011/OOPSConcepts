package com.java.InterfaceTest;
             //Child					//Parent
public class A2_SBItest implements A1_WorldBank {

	public static void main(String[] args) {
		A2_SBItest objsbi=new A2_SBItest();
		objsbi.credit();
		objsbi.debit();
		objsbi.loan();
		A1_WorldBank.netBanking();
	}
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Sbi-Credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Sbi-DEBIT");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Sbi-Loan");
	}

	
}
