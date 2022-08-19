package Day2;/*
Ask user to input a whole number and output true, if it is even number and false if it is odd number
    Hint: use remainder operator to divide number by two and get reminder (if reminder is 0 then it means it is even number)-
 */

import java.util.Scanner;

public class EvenNumberCheck {
    public static void main (String args[]){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter whole number:");
        number = input.nextInt();
        System.out.println("Is number " + number + " even - " + (number%2==0));
    }
}
