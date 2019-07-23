package io.purva;

public class RunnableExample {

	public static void main(String[] args) {
		
		// classic way
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside Runable");
			}
			
		});
		
		myThread.run();
		
		
		Thread myThreadLambda = new Thread(() -> System.out.println("Inside Lambda thread"));
		myThreadLambda.run();
	}

}
