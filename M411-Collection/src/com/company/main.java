package com.company;

public class main {
    public static void main(String[] args) {
        int[] unsorted = {1,8,6,5,2,3,8,6,4,};
        InsertionSort insertionSort = new InsertionSort(unsorted);
        BubbleSort bubbleSort = new BubbleSort(unsorted);
        SelectionSort selectionSort = new SelectionSort(unsorted);
        QuickSort quickSort = new QuickSort(unsorted);
    }
}
