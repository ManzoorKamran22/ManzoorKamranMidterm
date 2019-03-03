package datastructure;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;


public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("New York");
		cityOfUSA.add("California");
		cityOfUSA.add("Florida");

		List<String> cityOfUK = new ArrayList<String>();
		cityOfUK.add("London");
		cityOfUK.add("Manchester");
		cityOfUK.add("Birmingham");

		List<String> cityOfCanada = new ArrayList<String>();
		cityOfCanada.add("Montreal");
		cityOfCanada.add("Toronto");
		cityOfCanada.add("Vancouver");

		//key - String type
		//value - List type which contains String values
		Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();//LinkedHashMap for sorting order.
		map.put("USA", cityOfUSA);
		map.put("UK", cityOfUK);
		map.put("Canada", cityOfCanada);

		System.out.println("Retrieving data by using For Each Loop: ");
		for (Entry<String, List<String>> country : map.entrySet()) {
			System.out.println(country.getKey() + " " + country.getValue());
		}

		//Iterator
		Iterator it = map.entrySet().iterator();
		System.out.println("\nRetrieving data by using while loop with Iterator: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
