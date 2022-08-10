package multithreadingPrograms;

class HelloIndia_1 implements Runnable{
	public void run() {
		System.out.println("Hello India 1");
	}
}
class HelloIndia_2 implements Runnable{
	public void run() {
		System.out.println("Hello India 2");
	}
}
class HelloIndia_3 implements Runnable{
	public void run() {
		System.out.println("Hello India 3");
	}
}
class HelloIndia_4 implements Runnable{
	public void run() {
		System.out.println("Hello India 4");
	}
}
class HelloIndia_5 implements Runnable{
	public void run() {
		System.out.println("Hello India 5");
	}
}

public class Create5ThreadsUsingInterface {

	public static void main(String[] args) {
		Runnable thread1 = new HelloIndia_1();
		Runnable thread2 = new HelloIndia_2();
		Runnable thread3 = new HelloIndia_3();
		Runnable thread4 = new HelloIndia_4();
		Runnable thread5 = new HelloIndia_5();
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		Thread t4 = new Thread(thread4);
		Thread t5 = new Thread(thread5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
