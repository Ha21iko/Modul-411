package com.company;

/**
 * The insertion sort -> insert
 */
public class InsertionSort {
    int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
        sort();
        show();
    }

    private void sort(){
        for (int i= 1; i< arr.length; i++){
            int numberToSort = arr[i];
            int indexToSort = i;
            // von klein .. gross | arr[indexToSort-1] < numberToSort gross..klein
            while (indexToSort > 0 && arr[indexToSort-1] > numberToSort){
                arr[indexToSort] = arr[indexToSort-1]; // verschieben
                --indexToSort;
            }
            arr[indexToSort] = numberToSort; // zuweisen kleine zahl hat seine position gefunde
        }
    }

    private void show(){
        for (int number: arr) {
            System.out.print(number);
        }
        System.out.println("    Insertion");
    }

}
