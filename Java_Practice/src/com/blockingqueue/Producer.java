package com.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{

	private String threadName;
	private BlockingQueue<String> blckingqueue;


	Producer(String threadName,BlockingQueue<String> blckingqueue){
		this.threadName=threadName;
		this.blckingqueue=blckingqueue;
	}
	@Override
	public void run() {
		int count=0;
		while(true) {
			try {
				this.blckingqueue.put(threadName + "@@" +count);
				count++;
				System.out.println("Producer Thread : Named ::" + this.threadName + " Producting Item. Current Element Put :: " + threadName + "@@" +count);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
