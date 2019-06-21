package com.labc.Simulation;

import java.util.concurrent.locks.Lock;

public class You implements Runnable{
	public Thread t;
	
	You(int id){
		this.t = new Thread(this, id+"");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub		
		synchronized(Main.lck) {
			System.out.println(this.t.getName());	
			try {
				Main.lck.wait();
				System.out.println("Terminating thread "+this.t.getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
