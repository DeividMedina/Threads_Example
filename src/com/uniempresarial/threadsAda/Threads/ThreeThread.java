package com.uniempresarial.threadsAda.Threads;

public class ThreeThread extends Thread{
	
	boolean booContinue= true;
	int intNumber=0;
	
	   public void stopThread()
	   {
	      booContinue=false;
	   }
	
	   public void run()
	   {
		   while(booContinue==true) 
		   {
			   System.out.println(numberCounter(3));
		        try {
					Thread.sleep(1000);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
		   }
	   }
	   
	   public int numberCounter(int pIncresse) 
	   {
		   intNumber=intNumber+pIncresse;
		   return  intNumber;
	   }
}
