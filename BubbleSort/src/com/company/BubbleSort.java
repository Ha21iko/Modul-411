package com.company;

public class BubbleSort {
    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
        show();
        bubbleSort();
        show();
    }

    private void bubbleSort(){
        for (int i = 0; i < arr.length; i++){
            for (int k =1; k < arr.length-i; k++){
                if (arr[k-1] > arr[k]){
                    int temp = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = temp;
                }
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
        int[] A = {1,2,3,4,34,3,5,35,5,46,45,345,3245,234,214,124,12};
        BubbleSort bubbleSort =  new BubbleSort(A);
    }
}
