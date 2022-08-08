package multithreadingPrograms;
//creating a thread using Thread class and print the thread name

class Count extends Thread{
	public void run() {
		System.out.println("Hey you are in thread class");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

public class testOnThread {
	public static void main(String[] args) throws Exception{
		Count incrementCount = new Count();
		incrementCount.start();
		incrementCount.join();
		incrementCount.setName("Thread of my count class");
		System.out.println("Name of the thread : "+incrementCount.getName());
	}
}
