package com.company;

public class SelectionSort {
    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
        show();
        selectionSort();
        show();
    }

    private void selectionSort(){
        for (int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for (int next = i+1; next < arr.length; next++){
                if (arr[next] < arr[minIndex]){
                    minIndex = next;
                }
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;

            }
        }
    }

    private void show(){
        for (int number: arr) {
            System.out.print(number+",");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int[] A = {1,4,2,63,3,53,2342,42523,24};
        SelectionSort selectionSort =  new SelectionSort(A);
    }
}
