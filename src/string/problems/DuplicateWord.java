package string.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static Set<String> duplicateWords(String s) {
        if (s == null || s.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicateWords = new HashSet<>();
        String[] array = s.split(" ");
        int avgLength = s.length() / array.length;
        System.out.println("The average length of the words are: " + avgLength);
        Set<String> set = new HashSet<>();
        ArrayList<String> arraylist = new ArrayList<String>();
        for (String word : array) {
            arraylist.add(word);
            if (!set.add(word)) {
                duplicateWords.add(word);
            }
        }
        for (String word : duplicateWords) {
            if (Collections.frequency(arraylist, word) > 1) {
                System.out.println("'" + word +"' occurred " + Collections.frequency(arraylist, word) + " times.");
            }
        }
        return duplicateWords;
    }

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Set<String> duplicates = duplicateWords(st);
        System.out.println("\nDuplicate words are: " + duplicates);
    }

}
