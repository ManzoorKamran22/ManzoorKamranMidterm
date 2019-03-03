package datastructure;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<String> arrayList = new ArrayList<String>();
		arrayList.add("UFT");
		arrayList.add("Selenium");
		arrayList.add("DBA");
		arrayList.add("Mobile Testing");
		arrayList.add("Manual Testing");
		arrayList.add("Java Master");

		//For Each Loop - retrieving data from the arrayList
		System.out.println("Retrieving data from the arrayList by using For Each Loop: ");
		for (String course : arrayList) {
			System.out.println(course);
		}

		//Removing some elements from the arrayList
		arrayList.remove(5);
		arrayList.remove("DBA");

		//Iterator
		Iterator it = arrayList.listIterator();

		System.out.println("\nRetrieving data from the arrayList after removing some elements by using while loop with Iterator: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
