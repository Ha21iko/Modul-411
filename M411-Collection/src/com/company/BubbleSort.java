package com.company;

/**
 * The bubble sort always compare two, first loop the last will always be the biggest.
 */
public class BubbleSort {
    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
        sort();
        show();
    }

    private void sort(){
        boolean changesDone = true;
        for (int i = 0; i <arr.length && changesDone;i++){ // durch alle elemente loopen
            changesDone = false;
            for (int k = 0; k < arr.length - 1-i; k++){ // minus 1 damit es nicht über die länge geht.
                if (arr[k] > arr[k+1]){
                    int temp = arr[k]; // aktuelle mit nächsten tausen klein...gross
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                    changesDone = true;
                }
            }
        }
    }

    private void show(){
        for (int number: arr) {
            System.out.print(number);
        }
        System.out.println("    Bubble");
    }
}
