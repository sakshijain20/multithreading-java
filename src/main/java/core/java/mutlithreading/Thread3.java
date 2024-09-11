package core.java.mutlithreading;

public class Thread3 implements Runnable{


	@Override
	public void run() {
		thread3();
      }
		
	public static String thread3() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			return e.getMessage();
		}
		return "Thread3";
	}

}
