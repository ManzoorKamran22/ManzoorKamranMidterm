package math.problems;

public class PrimeNumber {

    //isPrimeNumber method will return True or False
    public static boolean isPrimeNumber(int num) {

        //corner cases: If the number is less than equal to 1 then return False
        if(num <= 1) {
            return false;
        }

        for(int i = 2; i < num; i++) {

            //If the remainder NOT equal to 0 then get out the for loop and return True
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    //method to display how many prime numbers are there based on the given number
    public static void getPrimeNumbers(int num) {

        for(int i = 2; i <= num; i++) {
            if(isPrimeNumber(i))
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        getPrimeNumbers(1000000);
    }
}
