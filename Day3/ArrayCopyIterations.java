package Day3;/*
Declare and initialize an array with four arbitrary whole numbers.
Write a Java program to copy this array by iterating it.
 */

import java.util.Arrays;

public class ArrayCopyIterations {

    public static void main (String args[]){
        int[] arrayInitial = {1,6,39,67};
        int[] arrayCopy;

        arrayCopy = copyArray(arrayInitial);

        System.out.println("Initial :" + Arrays.toString(arrayInitial));
        System.out.println("Copy :" + Arrays.toString(arrayCopy));
    }

    public static int[] copyArray (int[] arrayFrom){
        int length;
        length = arrayFrom.length;
        int [] arrayTo = new int[length];

        for (int i = 0; i < length ; i++){
            arrayTo[i] = arrayFrom[i];
        }
        return arrayTo;
    }
}
