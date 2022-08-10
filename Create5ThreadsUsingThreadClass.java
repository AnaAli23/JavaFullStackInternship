package multithreadingPrograms;

class HelloAll_1 extends Thread{
	public void run() {
		System.out.println("Hello All 1");
	}
}
class HelloAll_2 extends Thread{
	public void run() {
		System.out.println("Hello All 2");
	}
}
class HelloAll_3 extends Thread{
	public void run() {
		System.out.println("Hello All 3");
	}
}
class HelloAll_4 extends Thread{
	public void run() {
		System.out.println("Hello All 4");
	}
}
class HelloAll_5 extends Thread{
	public void run() {
		System.out.println("Hello All 5");
	}
}

public class Create5ThreadsUsingThreadClass {
	public static void main(String[] args) {
		HelloAll_1 thread_1 = new HelloAll_1();
		HelloAll_2 thread_2 = new HelloAll_2();
		HelloAll_3 thread_3 = new HelloAll_3();
		HelloAll_4 thread_4 = new HelloAll_4();
		HelloAll_5 thread_5 = new HelloAll_5();
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
		thread_4.start();
		thread_5.start();
	}
}
