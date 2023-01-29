package com.practice.bank_atm_using_thread;

public class JointAccount {
	
	private int accountBalance=6000;
	
	public void withDrawAmount(String name,int amount) {
		if(amount>0 && accountBalance>amount) {
			accountBalance =accountBalance-amount;
			System.out.println("Congrats !! HI :: " + name + " Withdrawl Amount :: " +amount + " done successfully. Current Balance is :: " + accountBalance);
		}
		else {
			System.out.println("Sorry !!! " + name + " Not enough balance left.");
		}
	}
	

}
