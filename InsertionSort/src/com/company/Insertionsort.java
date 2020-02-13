package com.company;

public class Insertionsort {
    private int[] list = {0,9,4,26,2,8,5,1,7,3};


    public Insertionsort(int[] list) {
        this.list = list;
        sortList();
        showList();
    }

    public Insertionsort() {
        showList();
        sortList();
        showList();
    }

    private void sortList(){
        int behindValue;
        int currentValue;
        for (int i = 0; i < list.length;i++) {
            currentValue = list[i];
            behindValue = i-1;
            while (behindValue >= 0 && list[behindValue] > currentValue)
            {
                list[behindValue+1] = list[behindValue];
                behindValue = behindValue - 1;
            }
            list[behindValue + 1] = currentValue;

        }
    }

    private void showList(){
        for (int number: list) {
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    private void sortListOther(){
        int lastNumber, currentNumber;
        for (int i = 0; i < list.length; i++){
            currentNumber = list[i];
            lastNumber = i -1;
            while (lastNumber >= 0 && list[lastNumber] > currentNumber){

            }
        }
    }

}
