package com.company;

public class InsertionSort {
    int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
        show();
        insertionSort();
        show();
    }

    private void insertionSort(){
        for (int i = 0; i < arr.length; i++){
            int indexToSort = i;
            int numberToSort = arr[indexToSort];
            while (indexToSort > 0 &&  arr[indexToSort-1] > numberToSort){
                arr[indexToSort] = arr[indexToSort-1];
                --indexToSort;
            }
            arr[indexToSort] = numberToSort;
        }
    }

    private void show(){
        for (int number: arr) {
            System.out.print(number+",");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] A = {1,2,42,45,34546,354,23,646346,346,346};
        InsertionSort insertionSort =  new InsertionSort(A);
    }
}
