package threading;

public class Application {
	
	public static void main(String[] args) {
		
		
		System.out.println("Starting thread 1..");
		Task taskRunner = new Task("Thread A");
		
		taskRunner.start();
		// we can start the thread only ONCE
		// we can create new instance and start the thread "again" via that new instance
		
		
		System.out.println("Starting thread 2..");
		Task taskRunner2 = new Task("Thread B");
		
		taskRunner2.start();
		
		System.out.println("Starting Annother Thread created in separate Class..");
		Task2 taskRunner3 = new Task2("Another Thread");
		taskRunner3.start();
		
		
	}

}


class Task extends Thread {
	
	
	String name;
	
	// we created constructor so we can differentiate threads by their names once they have been started
	public Task(String name) {
		super();
		this.name = name;
	}
	
	//Thread class implements Runnable interface, which has run() method by default, we have to override it with our own version
	
	public void run() {
		
		//why the setter has to be in the run method??
		
		Thread.currentThread().setName(this.name);
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
			
			//we put sleep method just to make it a bit slower in execution
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


