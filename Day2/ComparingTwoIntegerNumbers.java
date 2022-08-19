package Day2;/*
Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true
 */

import java.util.Scanner;

public class ComparingTwoIntegerNumbers {

    public static void main (String args[]){
        int numberA;
        int numberB;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value a:");
        numberA = input.nextInt();
        System.out.println("Enter value b:");
        numberB = input.nextInt();
        System.out.println("Is number " + numberA + " equal to " + numberB + " ? - " + (numberA == numberB));
        System.out.println("Is number " + numberA + " less than " + numberB + " ? - " + (numberA < numberB));
        System.out.println("Is number " + numberA + " less or equal to " + numberB + " ? - " + (numberA <= numberB));
        System.out.println("Is number " + numberA + " greater than " + numberB + " ? - " + (numberA > numberB));
        System.out.println("Is number " + numberA + " greater than or equal to " + numberB + " ? - " + (numberA >= numberB));
    }
}