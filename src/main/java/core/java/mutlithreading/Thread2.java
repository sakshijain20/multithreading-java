package core.java.mutlithreading;

public class Thread2 implements Runnable{


	@Override
	public void run() {
		thread2();
      }
		
	public static String thread2() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			return e.getMessage();
		}
		return "Thread2";
	}

}


