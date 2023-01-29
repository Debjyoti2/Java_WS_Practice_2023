package com.practice.bank_atm_using_thread;

public class Client_Runner {

	public static void main(String[] args) {

		JointAccount jc = new JointAccount();
		
		ClientThread th1 = new ClientThread("Kittu",4000,jc);
		ClientThread th2 = new ClientThread("Debrup",4000,jc);
	    th1.start();
	    th2.start();
		
		
		
				
				
		
	    
	    

	}

}
