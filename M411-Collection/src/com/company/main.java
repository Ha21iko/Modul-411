package com.company;

public class main {
    public static void main(String[] args) {
        int[] unsorted = {1,8,6,5,2,3,8,6,4,};
//        InsertionSort insertionSort = new InsertionSort(unsorted);
//        BubbleSort bubbleSort = new BubbleSort(unsorted);
//        SelectionSort selectionSort = new SelectionSort(unsorted);
//        QuickSort quickSort = new QuickSort(unsorted);
//        sort();
        insertionSort(unsorted);

    }

    private static void sort(){
        int[] arr = {1,8,6,5,2,3,8,6,4,};
        for (int i = 0; i<arr.length-1;i++){
            for (int k = 0; k <arr.length-1-i; k++){
                if (arr[k] > arr[k+1]){
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        show(arr);
    }

    private static void insertionSort(int[] arr){
        for (int i = 1; i< arr.length; i++){
            int numberToSort = arr[i];
            int indexToSort = i;
            while (indexToSort > 0 && arr[indexToSort-1] > numberToSort){
               arr[indexToSort] = arr[indexToSort-1];
                --indexToSort;
            }
            arr[indexToSort] = numberToSort;
        }
        show(arr);
    }




    private static void show(int[] arr){
        for (int number: arr) {
            System.out.print(number+",");
        }
    }
}
