package com.company;

import java.util.Random;
import java.util.Scanner;

public class GameField {
    private int rows;
    private int elements;
    private boolean[][] matrix;
    private char placeholder = '☠';
    private Field[] fields;

    public GameField(int rows, int elements) {
        this.rows = rows;
        this.elements = elements;
        this.matrix = new boolean[rows][elements];
        this.fields = new Field[rows*elements];
        fillMatrix(matrix);
        setLive(matrix);
        do {
            drawMatrix();
            checkState();
        } while (getInput());
    }

    private boolean getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Continue type 'J' on the keyboard");
        if (scanner.nextLine().equals("J")){
            return true;
        }
        return false;
    }

    private void fillMatrix(boolean[][] matrix){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < elements; j++){
                matrix[i][j] = false;
            }
        }
    }

    private void setLive(boolean[][] matrix){
        Random random = new Random();
        int many = random.nextInt(rows*elements);
        for (int i = 0; i < many; i++){
            int randomX = random.nextInt(rows);
            int randomY = random.nextInt(elements);
            matrix[randomX][randomY] = true;
        }
    }


    private void drawMatrix(){
        for (boolean[] row: matrix) {
            for (boolean element: row) {
                if (element){
                    System.out.print('∎');
                }else {
                    System.out.print(placeholder);
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }


    private void checkState(){
        for (int row = 0; row < matrix.length; row++) {
            for (int element = 0; element < matrix[row].length; element++) {
                System.out.print(numbersOfNeighbours(row, element));
                System.out.print(matrix[row][element]);
                System.out.print(" | ");
                life(row, element);
            }
            System.out.println(" ");
        }
    }

    private void life(int row, int column){
        if (matrix[row][column]){
            if (numbersOfNeighbours(row, column)<2){
                matrix[row][column] = false;
            }
        }
        if (matrix[row][column]){
            if (numbersOfNeighbours(row, column) > 3){
                matrix[row][column] = false;
            }
        }
        if (matrix[row][column]){
            if (numbersOfNeighbours(row, column) == 2 || numbersOfNeighbours(row, column) == 3){
                matrix[row][column] = true;
            }
        }
        if (!matrix[row][column]){
            if (numbersOfNeighbours(row, column) == 3){
                matrix[row][column] = true;
            }
        }
    }

    private int numbersOfNeighbours(int x, int y){
        int nachbarn = 0;
        int row_limit = matrix.length -1;
        int column_limit;
        if (row_limit > 0){
            column_limit = matrix[0].length -1;
            for (int k = Math.max(0, x-1); k <= Math.min(x + 1, row_limit); k++) {
                for (int l = Math.max(0,y - 1); l <= Math.min(y + 1, column_limit); l++) {
                    if (k != x || l != y) {
                        if (matrix[k][l]){
                            nachbarn++;
                        }
                    }
                }
            }
        }
        return nachbarn;
    }
}
