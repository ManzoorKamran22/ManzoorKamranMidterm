package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        //implement
        int longWordLen = 0;
        String longestWord = "";
        for (Map.Entry<Integer, String> wordMap : wordNLength.entrySet()) {
            if (longWordLen < wordMap.getKey()) {
                longWordLen = wordMap.getKey();
                longestWord = wordMap.getValue();

            }
        }
        System.out.println("The longest word in the given sentence is: " + longestWord +
                           "\nThe size of the longest word is: " + longWordLen);

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";

        //implement
        String[] split = wordGiven.split(" ");
        for (int i = 0; i < split.length; i++) {
            map.put(split[i].length(), split[i]);

        }
        return map;
    }
}
