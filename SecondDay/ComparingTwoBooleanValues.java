package SecondDay;/*
Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false
    Expected output:
       Is b1 and b2 equal? - false
 */

import java.util.Scanner;

public class ComparingTwoBooleanValues {
    public static void main (String args[]){
        boolean valueB1;
        boolean valueB2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter boolean value a:");
        valueB1 = input.nextBoolean();
        System.out.println("Enter boolean value b:");
        valueB2 = input.nextBoolean();
        System.out.println("Is " + valueB1 + " and " + valueB2 + " equal - " + (valueB1==valueB2));
    }
}
