package Day3;/*
Write a program which creates two dimensional
// array and stores a multiplication table (from 1 - 10) in it.
    Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100
    Hint:
       1) don't forget that you have to save the values in the array and output them from the array.
       2) Arrays should be the size of [10][10]
 */

public class MultiplicationTable {

    public static void main (String[] args){
        int[][] table = new int[10][10];
        calculateMultiplicationTable(table);
        printTable(table);
    }

    public static void calculateMultiplicationTable (int[][] table) {
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table[i].length ; j++){
                table[i][j] = (i+1)*(j+1);
            }
        }
    }

    public static void printTable (int[][] table){
        for (int[] row : table){
            for (int x : row){
                System.out.print(x + " ");
            }
            System.out.println("\n");
        }
    }
}
