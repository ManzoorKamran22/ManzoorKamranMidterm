package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        //Anagram Unit Testing:
        Assert.assertEquals(Anagram.isAnagram("mom", "mom"), true);

        //Largest word Unit Testing:
        String s = "Human brain is a biological learning machine";
        Assert.assertEquals(DetermineLargestWord.findTheLargestWord(s), "biological");

        //Duplicate word Unit Testing:
        String st = "I love her but she does not love me";
        Assert.assertEquals(DuplicateWord.duplicateWords(st), "love");

        //Palindrome Unit Testing
        Assert.assertEquals(Palindrome.isPalindrome("DAD"), true);

    }
}
