package com.practice.bank_atm_using_thread;

public class ClientThread extends Thread{
	
	private String name;
	private int amount;
	private JointAccount jointaccount;
	
	ClientThread(String name,int amount,JointAccount jointaccount){
		this.name=name;
		this.amount=amount;
		this.jointaccount=jointaccount;
	}
	
	@Override
	public void run() {
		this.jointaccount.withDrawAmount(name, amount);
	}

}
