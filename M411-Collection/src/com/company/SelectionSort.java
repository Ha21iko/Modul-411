package com.company;

public class SelectionSort {
    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
        sort();
        show();
    }

    private void sort(){
        for (int i = 0; i < arr.length -1; i++){
            for (int k = i+1; k < arr.length; k++){
                if (arr[k] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }

    private void show(){
        for (int number: arr) {
            System.out.print(number);
        }
        System.out.println("    Selection");
    }
}
