package com.uniempresarial.threadsAda;

import com.uniempresarial.threadsAda.Threads.FirstThread;
import com.uniempresarial.threadsAda.Threads.SecondThread;
import com.uniempresarial.threadsAda.Threads.ThreeThread;

public class ThreadsMain {

	public static void main(String[] args) {

		FirstThread firstThread = new FirstThread();
		SecondThread secondThread = new SecondThread();
		ThreeThread threeThread = new ThreeThread();
		firstThread.start();
		secondThread.start();
		threeThread.start();
	}

}
