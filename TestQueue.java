package CollectionsPrograms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue();
		queue.add(400);
		queue.add(500);
		queue.add(600);
		queue.add(100);
		queue.add(200);
		queue.add(300);
		
		System.out.println("Queue elements are : "+queue);
		
		System.out.println("Removing element : "+queue.remove());
		System.out.println("Removing element : "+queue.poll());
		
		System.out.println("After removing 2 Queue elements: ");
		
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
