package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        FileReader fr = null;
        BufferedReader br = null;
        String st = "";
        String storedStValue = "";

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

        try {
            fr = new FileReader(textFile);
            br = new BufferedReader(fr);
        } catch (Exception e) {
            System.out.println("File NOT found");
            e.printStackTrace();
        }

        try {
            while ((st = br.readLine()) != null) { //read the file until its null
                System.out.println(st);
                storedStValue += st; //
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                fr = null;
            }
            if (br != null) {
                br = null;
            }
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        String[] storeArr = storedStValue.split(" "); //Splitting the 'storedStValue' based on the space delimiter

        //Creating Stack and LinkedList object
        Stack<String> stack = new Stack<String>();
        List<String> list = new LinkedList<String>();

        for (String vals : storeArr) { //using for each loop to iterate through 'storeArr'
            stack.push(vals); //push method is used to add an element to the stack
            list.add(vals);
        }

        System.out.println("\nPeek-(last item in the stack but first out): " + stack.peek() + " ");
        System.out.println("\nPush-(add an item at the top of the stack): " + stack.push("Hello") + " ");
        System.out.println("\nPeek-(after Push): " + stack.peek() + " ");
        System.out.println("\nSearch-(search an item position, ex:companies): " + stack.search("companies"));
        System.out.println("\nPop-(removes the item at the top of this stack): " + stack.pop());

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("\nReading data in a FIFO order:");
        System.out.println("----------------------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n\nReading data in a LIFO order:");
        System.out.println("----------------------------");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
