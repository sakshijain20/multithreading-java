package core.java.mutlithreading;

public class Thread1 implements Runnable{

	@Override
	public void run() {
	 thread1();	
	}
	
	public static String thread1() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			return e.getMessage();
		}
		return "Thread1";
	}

}
