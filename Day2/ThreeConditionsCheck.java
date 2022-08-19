package Day2;/*
Write a program which asks the user to input two whole numbers a and b. Output "true", if one of this condition is true:
    1) a and b is equal
    2) a is less than 0 and b is greater than 0
    3) both of them are greater than 100
    otherwise output "false":
    Examples:
        a is -1 and b is -2 -> false
        a is -2 and b is 1 -> true
        a is -1 and b is -1 -> true
        a is 101 and b is 102 -> true
        a is 99 and b is 200 -> false
*/
import java.util.Scanner;

public class ThreeConditionsCheck {

    public static void main (String args[]) {
        int numberA;
        int numberB;
        boolean answer;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter whole number a:");
        numberA = input.nextInt();
        System.out.println("Enter whole number b:");
        numberB = input.nextInt();
        answer = checkingThreeConditions(numberA,numberB);
        System.out.println("a is " + numberA + " and b is " + numberB + " -> " + answer);
    }
    static boolean checkingThreeConditions (int numberA, int numberB){
        if ((numberA == numberB) || ((numberA < 0) && (numberB >0)) || ((numberA > 100) && (numberB >100))){
            return true;
        }
        else {
            return false;
        }
    }
}
