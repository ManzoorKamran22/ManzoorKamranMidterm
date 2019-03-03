package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[100000];
        storeRandomNumbers(num);

        //Creating Sort class object
        Sort algo = new Sort();

        //Connection to DB
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        //Selection Sort:
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        //Sort.printSortedArray(num);

//        //Inserting the sorted data from the array to the SQL DB table
//        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
//        //Reading those sorted data from the DB and storing the value to the List
//        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
//        //Printing those sorted data to the console
//        printValue(numbers);

        int n = num.length;
        randomize(num, n);

        //Insertion Sort:
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
        //Sort.printSortedArray(num);

        //By following above, Continue for rest of the Sorting Algorithm....

        //Bubble Sort:
        randomize(num, n);
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
        //Sort.printSortedArray(num);

        //Merge Sort:
        randomize(num, n);
        algo.mergeSort(num, 0, n - 1);
        long mergeSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
        //Sort.printSortedArray(num);

        //Quick Sort:
        randomize(num, n);
        algo.quickSort(num, 0, n - 1);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
        //Sort.printSortedArray(num);

        //Heap Sort:
        randomize(num, n);
        algo.heapSort(num);
        int maxValueForBucketSort = num[num.length - 1];
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
        //Sort.printSortedArray(num);

        //Bucket Sort:
        randomize(num, n);
        algo.bucketSort(num, maxValueForBucketSort);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
        //Sort.printSortedArray(num);
    }


    //Come to conclusion about which Sorting Algo is better in given data set.


    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(100000);
        }
    }

    public static void randomize(int arr[], int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
