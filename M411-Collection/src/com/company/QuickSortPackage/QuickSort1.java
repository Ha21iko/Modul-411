package com.company.QuickSortPackage;

import java.util.Random;

/**
 * Sort array Algorithm
 * 1 loop creating left and a right partition
 *
 */
public class QuickSort1 {
    int[] arr;

    public QuickSort1(int[] arr) {
        this.arr = arr;
        System.out.print("unsorted: ");
        show();
        quickSort();
        System.out.println(" ");
        System.out.print("sorted: ");
        show();
    }

    public void quickSort(){
        _quickSort(0, arr.length-1);
    }

    public static void main(String[] args) {
        int[] array = {17,41,5,22,54,6,29,3,13};
        QuickSort1 quickSort1  = new QuickSort1(array);
    }

    /**
     * Rekursive methode
     */
    private void _quickSort(int low, int high){
            if (low < high+1){
                int pivot = partition(low, high);
                _quickSort(low, pivot-1);
                _quickSort(pivot+1, high);
            }
    }

    /**
     * Swaps two values
     * @param index1
     * @param index2
     */
    private void swap(int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     *
     * @param low
     * @param high
     * @return the radom pivot index between low and the high inclusive.
     */
    private int getPivot(int low, int high){
        Random random = new Random();
        return random.nextInt((high-low)+1)+low;
    }

    private int partition(int low, int high){
        swap(low, getPivot(low,high));
        int border = low + 1;
        for (int i = border; i<= high; i++){
            if (arr[i] < arr[low]){
                swap(i, border++);
            }
        }
        swap(low, border-1);
        return border-1;
    }

    private void show(){
        for (int number: arr) {
            System.out.print(number+",");
        }
    }


}
