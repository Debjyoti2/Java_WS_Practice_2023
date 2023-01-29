package com.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{

	private String threadName;
	private BlockingQueue<String> blockingqueue;
	
	Consumer(String threadName,BlockingQueue<String> blockingqueue){
		this.threadName=threadName;
		this.blockingqueue=blockingqueue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				this.blockingqueue.take();
				System.out.println("Consumer Thread : Named ::" + this.threadName + " Consumed Item-- " + this.blockingqueue.take());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
