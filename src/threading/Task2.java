package threading;

public class Task2 extends Thread{
	
	private String name;

	public Task2(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		
		Thread.currentThread().setName(this.name);
		
		for(int i = 0; i < 500; i++) {
			System.out.println("Number: " + i + " " + Thread.currentThread().getName() + " (Separate Class)");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
