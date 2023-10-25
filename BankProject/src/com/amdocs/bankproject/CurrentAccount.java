package com.amdocs.bankproject;

public class CurrentAccount extends BankAccount {

	public double Penalty = 200;
	public CurrentAccount(double current_balance) {
		super(current_balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Withdrawl(double W_ammount) {
		
		
		super.Withdrawl(W_ammount + Penalty);
		
	}

//	public void Withdrawl(double W_ammount, boolean penalty) {
//		if (penalty) {
//			this.Withdrawl(W_ammount);
//		} else {
//			super.Withdrawl(W_ammount);
//		}
//	}
	
	
	

}
