package com.amdocs.tester;

import com.amdocs.bankproject.BankAccount;
import com.amdocs.bankproject.CurrentAccount;
import com.amdocs.bankproject.SavingAccount;

public class TestBankProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BankAccount B1 = new BankAccount(900);
		 BankAccount B2 = new BankAccount(1200);
     B1.Deposite(5000);
      B1.CheckBalance();
      B1.Withdrawl(2000000);
      B1.Transfer(400, B2);
      B1.CheckBalance();
      B2.CheckBalance();
		 
		 System.out.println("Created Saving Account with initial balance 2000 =>");
		 SavingAccount S1 = new SavingAccount(2000);
		 System.out.println();
		 
		 System.out.println("Deposited 500 in saving a/c =>");
		 S1.Deposite(500);
		 System.out.println();
		 
		 System.out.println("Checking balance of saving a/c =>");
		 S1.CheckBalance();
		 System.out.println();
		 
		 System.out.println("Created Current A/C with Initial balance 2000 =>");
		 CurrentAccount C1 = new CurrentAccount(2000);
		 System.out.println();
		 
		 System.out.println("Deposited 500 in Current A/C");
		 C1.Deposite(500);
		 System.out.println();
		 
		 System.out.println("Withdraw 100 from this Current A/C");
		 C1.Withdrawl(100);
		 System.out.println();
		 
		 System.out.println("Transfer 500 to Saving a/c");
		 C1.Transfer(500, S1);
		 System.out.println();
		 
		 System.out.println("Checking balance of Current a/c");
		 C1.CheckBalance();
		 System.out.println();
		 
		 System.out.println("Checking balance of Saving a/c");
		 S1.CheckBalance();
		 System.out.println();
		 

	}
			

}
