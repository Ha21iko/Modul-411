package com.company;

public class Rekursion {

    private static void  shopTree( int tree){
        if (tree == 1){
            System.out.println("Tree falls");
        }
        else {
            System.out.println(tree);
            tree -= 1;
            shopTree(tree);
        }
    }

    private static int calculateFaculty(int number){
        if (number ==1){
            return 1;
        }else {
            return number * calculateFaculty(number-1);
        }
    }
    public static void main(String[] args) {
        shopTree(100);
        System.out.println(calculateFaculty(5));
        factorial(5);
        int[] arr = {-4,-4343,-3232003,-3232};
        getBiggest(arr);
        getShortest(arr);
    }

    public static void factorial(int input){
        int result = 1;
        for (int i = 1; i < input+1; i++){
            result *= i;
            System.out.println(i);
        }
        System.out.print(result);
    }

    public static void getBiggest(int[] arr) {
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (biggest < arr[i]) {
                biggest = arr[i];
            }
        }
        System.out.println(biggest);
    }

    public static void getShortest(int[] arr){
        int shortest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (shortest > arr[i]){
                shortest = arr[i];
            }
        }
        System.out.println(shortest);
    }
}
