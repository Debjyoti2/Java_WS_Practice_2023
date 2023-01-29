package com.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueRunner {
	
	public static void main(String[] args) {
		
		BlockingQueue<String> blckingqueue = new ArrayBlockingQueue<String>(2);
		
		Producer pthread = new Producer("Producer-Kittu", blckingqueue);
		Consumer cThread = new Consumer("Debrup-Consumer",blckingqueue);
		pthread.start();
		cThread.start();
		
		
	}

}
