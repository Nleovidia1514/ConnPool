package com.labc.Simulation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
	static class Lock{};
	public static Lock lck = new Lock();
	
	public static void main(String[] args) {
		idk();
	}	
	
	public static void idk() {
		synchronized(lck) {
			for(int i = 0; i < 50; i++) {		
				You y =new You(i);
				y.t.start();		
			}
			lck.notifyAll();
		}
		
	}
}



