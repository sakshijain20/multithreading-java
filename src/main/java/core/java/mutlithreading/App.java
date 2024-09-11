package core.java.mutlithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) {
    	System.out.println("Main thread started");
    	ExecutorService executorService = Executors.newFixedThreadPool(3);
    	
      List<Future<String>> taskFutures = null;
	try {
		taskFutures = executorService.invokeAll(Arrays.asList(Thread1::thread1, Thread1::thread1,
															   Thread3::thread3, Thread2::thread2,
															   Thread2::thread2, Thread1::thread1));
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
      taskFutures.forEach(res -> {
          try {
              System.out.println("Result - " + res.get());
          } catch (InterruptedException | ExecutionException e) {
              e.printStackTrace();
          } 
      });

      executorService.shutdown();
    	
    	System.out.println("Main thread ended");
    }
}
