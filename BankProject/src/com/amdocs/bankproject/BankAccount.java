package com.amdocs.bankproject;

import java.util.Random;

public class BankAccount {
	private double current_balance ; //member variable
	private int account_number;

	public BankAccount(double current_balance) { //parameter
		this.account_number = (int)(Math.random() * 100000000);
		this.current_balance = current_balance;
	}

	// deposite
	
	public void Deposite(double D_ammount) {
		if (D_ammount > 0) {
			current_balance = current_balance + D_ammount;
			System.out.println("Dear customer(" + this.account_number + ") your account has credited Rs."+ D_ammount + " And your current account balance is= " + current_balance);

		}
		
		else {
			System.out.println("Invalid ammount ");
		}	
	}
	
	//withdrawl
	
	public void Withdrawl(double W_ammount) {
		if ((W_ammount > 0) && (W_ammount <= current_balance)){
			current_balance = current_balance - W_ammount;
			System.out.println("Dear customer your account hasbeen debited=" + W_ammount + " And your account current balance is= " + current_balance);
		}
		else {
			System.out.println("Withdrawl Ammount entered invalid");
		}
	}
	
	// Check balance
	public void CheckBalance( ) {
		System.out.println("Dear customer your account current balance is= "+ current_balance +". Keep Smiling");
		
	}
	
	// Transfer
	public void Transfer(double T_Ammount, BankAccount B2 ) {
		if (T_Ammount<= this.current_balance) {
			this.Withdrawl(T_Ammount);
			B2.Deposite(T_Ammount);
			System.out.println(" The Rs. " + T_Ammount+ " Tranfered Succesfully");
		}
		else {
			System.out.println("Invalid tranfer ammount entered");
		
		}
	
	}
	
}
