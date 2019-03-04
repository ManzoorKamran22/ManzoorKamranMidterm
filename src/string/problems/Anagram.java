package string.problems;

import java.util.Arrays;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    //Static method to ckeck if two Strings are Anagram or not
    public static void isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", ""); // \\s - matches single whitespace character
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        isAnagram("ARMY", "MARY");
        isAnagram("BOY", "TOY");
        isAnagram("cat", "ACT");
    }
}
