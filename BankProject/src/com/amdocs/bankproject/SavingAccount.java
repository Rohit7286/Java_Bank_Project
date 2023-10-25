package com.amdocs.bankproject;

public class SavingAccount extends BankAccount {

	public SavingAccount(double current_balance) {
		super(current_balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Deposite(double D_ammount) { //we override this class cause we use this method to show different functionality)
		
		double Interest = D_ammount*0.03;
		super.Deposite(D_ammount + Interest); //reusability
		
	}
	
//	public void Deposit(double D_amount, boolean interest) {
//		if (interest) {
//			this.Deposite(D_amount);
//		} else {
//			super.Deposite(D_amount);
//		}
//	}

}
