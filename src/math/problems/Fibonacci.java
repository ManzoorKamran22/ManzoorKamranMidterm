package math.problems;

public class Fibonacci {

    //Fibonacci function
    public static long fnFibonacci(int n) {

        if (n <= 1) {
            return n;
        } else {
            return fnFibonacci(n - 1) + fnFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int n = 40;
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fnFibonacci(i));
    }
}
