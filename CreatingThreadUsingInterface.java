package multithreadingPrograms;

//Creating Thread Using Runnable Interface and print the name 

public class CreatingThreadUsingInterface {

	public static void main(String[] args) throws Exception{
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Hey you are in Runnable Interface : child thread....");
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hello "+ i);
				}
			}
		});	
		thread.start();
		thread.join();
		System.out.println("Hey you are in main thread....");
		System.out.println("Name of the thread : "+ thread.getName());
		
	}

}
