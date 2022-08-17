/*
Ask user to input a whole number and output false, if it is even number and true if it is odd number
 */

import java.util.Scanner;

public class OddNumberCheck {
    public static void main (String args[]){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter whole number:");
        number = input.nextInt();
        System.out.println("Is number " + number + " odd - " + (number%2==1));
    }
}
