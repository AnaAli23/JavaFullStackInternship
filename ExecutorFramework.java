package ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberPrinting implements Runnable{
	private int number;
	
	public NumberPrinting(int num) {
		this.number = num;
	}
	
	public void run() {
		System.out.println(number);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Unable to print the number");
		}
	}
	
}

public class ExecutorFramework {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Runnable task1 = new NumberPrinting(1);
		Runnable task2 = new NumberPrinting(2);
		Runnable task3 = new NumberPrinting(3);
		Runnable task4 = new NumberPrinting(4);
		Runnable task5 = new NumberPrinting(5);
		Runnable task6 = new NumberPrinting(6);
		Runnable task7 = new NumberPrinting(7);
		Runnable task8 = new NumberPrinting(8);
		Runnable task9 = new NumberPrinting(9);
		Runnable task10 = new NumberPrinting(10);
		
		executorService.execute(task1);
		executorService.execute(task2);
		executorService.execute(task3);
		executorService.execute(task4);
		executorService.execute(task5);
		executorService.execute(task6);
		executorService.execute(task7);
		executorService.execute(task8);
		executorService.execute(task9);
		executorService.execute(task10);
		
		executorService.shutdown();
	}
}	
