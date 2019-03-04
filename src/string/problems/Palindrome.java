package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;

        //check for first and last char of String:
        if(s.charAt(0) == s.charAt(s.length()-1))
            //if they are same then do the same thing for a substring with first and last char removed. and carry on this
            //until you string completes or condition fails
            //Function calling itself: Recursion

            return isPalindrome(s.substring(1, s.length()-1));

        //return false
        return false;
    }


    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter some text to check: ");
        String string = sc.nextLine();

        if(isPalindrome(string.toLowerCase()))
            System.out.println(string + " is a palindrome string");
        else
            System.out.println(string + " is not a palindrome string");
    }

}

