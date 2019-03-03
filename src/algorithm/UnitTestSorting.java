package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};

        //Create Sort object
        Sort sort = new Sort();

        //Apply unsorted array to selectionSort.
        //Selection Sort:
        sort.selectionSort(unSortedArray);

        //Verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "selectionSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //Bubble Sort:
        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        sort.bubbleSort(unSortedArray);

        //Verify if the unsorted array is sorted by the bubble sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "bubbleSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Insertion Sort:
        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        sort.insertionSort(unSortedArray);

        //Verify if the unsorted array is sorted by the insertion sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "insertionSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Heap Sort:
        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        sort.heapSort(unSortedArray);

        //Verify if the unsorted array is sorted by the heap sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "heapSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Shell Sort:
        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        sort.shellSort(unSortedArray);

        //Verify if the unsorted array is sorted by the shell sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "shellSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Merge Sort:
        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        sort.mergeSort(unSortedArray, 0, unSortedArray.length - 1);

        //Verify if the unsorted array is sorted by the merge sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "mergeSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Quick Sort:
        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        sort.quickSort(unSortedArray, 0, unSortedArray.length - 1);

        //Verify if the unsorted array is sorted by the quick sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "quickSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Bucket Sort:
        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
        sort.bucketSort(unSortedArray, 9);

        //Verify if the unsorted array is sorted by the bucket sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "bucketSort: Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}

