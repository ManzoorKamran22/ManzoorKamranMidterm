package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        //Factorial Unit Testing
        Assert.assertEquals(Factorial.factorial(5), 120);

        //Fibonacci Unit Testing
        Assert.assertEquals(Fibonacci.fnFibonacci(5), 5);

        //Find lowest difference Unit Testing
        int  array1[] = new int[]{10, 5, 87, 11, 90, 8, 67};
        int  array2[] = new int[]{78, 45, 92, 12, 9, 3, 61};
        int minNum = array1[0];
        int diff = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                diff = Math.abs(array1[i] - array2[j]);

                if (diff < minNum)
                    minNum = diff;
            }
        }
        Assert.assertEquals(minNum, 1);

        //Find missing number Unit Testing
        int [] arr = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6}; //addition of array = 55
        Assert.assertEquals(55 - FindMissingNumber.sumOfArrayForMissingNumber(arr), 9);

        //Lowest number Unit Testing
        int  num[] = new int[]{78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        Assert.assertEquals(LowestNumber.getLowest(num, num.length), 5);

        //Prime Number Unit Testing
        Assert.assertEquals(PrimeNumber.isPrimeNumber(5), true);
    }
}
