# Bubble Sort
## Normal
```java
private static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int k = 1; k < arr.length-i; k++){
                if (arr[k-1] > arr[k]){
                    int t = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = t;
                }
            }
        }
        for (int number: arr) {
            System.out.print(number+";");
        }
    }
```
## Optimized 
```java
private static void bubbleSort(int[] arr){
        boolean swapped;
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }

        for (int number: arr) {
            System.out.print(number+",");
        }
    }
 ```
# Insertion Sort
 ```java
public static void insertionSort(int[] arr){
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

        for (int number: arr) {
            System.out.print(number+",");
        }
    }
 ```
 
# Selection Sort 
 ```java
private static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
 ```

        for (int number : arr) {
            System.out.print(number + ",");
        }
    }
