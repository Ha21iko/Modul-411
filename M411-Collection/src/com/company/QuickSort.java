package com.company;

public class QuickSort {
    int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
        sort();
        show();
    }

    private void sort(){
        _quickSort(0,arr.length-1);
    }

    private  void _quickSort(int leftIndex, int rightIndex){
        if (leftIndex >= rightIndex){
            return;
        }

        int i = leftIndex;
        int k = rightIndex -1;
        int pivot = arr[rightIndex];

        do {
            while (arr[i] <=pivot && i < rightIndex){
                i++;
            }
            while (arr[k] <=pivot && k > leftIndex){
                k--;
            }
            if (i<k){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }while (i < k);

        if (arr[i] > pivot){
            int temp = arr[i];
            arr[i] = pivot;
            arr[rightIndex] = temp;
        }
        _quickSort(leftIndex, i-1);
        _quickSort(i+1, rightIndex);
    }

    private void show(){
        for (int number: arr) {
            System.out.print(number);
        }
        System.out.println("    Quick");
    }
}
