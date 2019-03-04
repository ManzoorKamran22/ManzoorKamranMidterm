package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public void permutation(String str, int startingIndex, int endIndex) {
        if (startingIndex == endIndex)
            System.out.println(str);
        else {
            for (int i = startingIndex; i <= endIndex; i++) {
                str = swap(str, startingIndex, i);
                permutation(str, startingIndex + 1, endIndex);
                str = swap(str, startingIndex, i);
            }
        }
    }

    public String swap(String strValue, int position1, int position2) {
        char temp;
        char[] charArray = strValue.toCharArray();
        temp = charArray[position1];
        charArray[position1] = charArray[position2];
        charArray[position2] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        Permutation pr = new Permutation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a String to check permutation: ");
        String inputStr = sc.nextLine();

        pr.permutation(inputStr, 0, inputStr.length() - 1);

    }
}
