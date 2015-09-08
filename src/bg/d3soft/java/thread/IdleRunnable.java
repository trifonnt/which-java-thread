package bg.d3soft.java.thread;

import java.util.concurrent.TimeUnit;


public class IdleRunnable implements Runnable {

	@Override
	public void run() {
		try {
			TimeUnit.HOURS.sleep(1);
		} catch (InterruptedException e) {
		}
	}
}