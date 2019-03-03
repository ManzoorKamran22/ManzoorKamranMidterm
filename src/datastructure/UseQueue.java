package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<String> religion = new LinkedList<String>();
		religion.add("Nonreligious");
		religion.add("Islam");
		religion.add("Christianity");
		religion.add("Hinduism");
		religion.add("Buddhism");

		//Iterator
		Iterator it = religion.iterator();
		System.out.println("Retrieving data by using while loop with Iterator: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\nPlaying with peek, remove, pool method - using For Each Loop: ");
		for (String s : religion) {
			System.out.println("First religion in the Queue is: " + religion.peek());
			System.out.println("Removing the first religion from the Queue is: " + religion.remove());
			System.out.println("After removing - the head of the religion Queue is now: " + religion.poll());
			break;
		}
	}
}
