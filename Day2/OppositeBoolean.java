package Day2;/*
Write a program which reads boolean value from user and prints out the opposite value:
    Example input:
        Enter boolean value: true
    Expected output:
        Opposite of "true" is "false"
 */
import java.util.Scanner;

public class OppositeBoolean {
    public static void main (String args[]){
        boolean booleanValue;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter boolean value:");
        booleanValue = input.nextBoolean();
        System.out.println("Opposite of " + booleanValue + " is  " + (!booleanValue));
    }
}
