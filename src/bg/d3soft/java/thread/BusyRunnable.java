package bg.d3soft.java.thread;


public class BusyRunnable implements Runnable {

	@Override
	public void run() {
		while(true) {
			"Foo".matches("F.*");
		}
	}
}