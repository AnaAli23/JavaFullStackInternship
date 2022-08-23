package CollectionsPrograms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue();
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println("Queue elements are : "+queue);
		
		queue.remove();
		queue.poll();
		
		System.out.println("After removing 2 Queue elements: "+queue);
		
		Stack<Integer> stack = new Stack<>();
		
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()) {
			Integer integer = itr.next();
			stack.add(integer);
		}
		
		System.out.println("Stack elements are :"+stack);

	}

}
