package Day3;/*
create a class "ThirdDay.BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another
 */

public class BankAccount {

    private double balance;

    public BankAccount (){
    }

    public BankAccount (double balance){
        this.balance = balance;
    }

    public void deposit (double amount){
        balance = balance + amount;
    }

    public void withdraw (double amount){
        if (balance >= amount){
            balance = balance - amount;
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }

    public void printBalance (){
        System.out.println("Balance: " + balance);
    }

    public static void transferAmount (BankAccount bankAccountFrom, BankAccount bankAccountTo, double amount){
        bankAccountFrom.withdraw(amount);
        bankAccountTo.deposit(amount);
    }

    public static void main (String[] args){
        BankAccount bankAccount_A = new BankAccount(100);
        BankAccount bankAccount_B = new BankAccount(200);
        bankAccount_A.deposit(50);
        bankAccount_A.printBalance();
        bankAccount_B.withdraw(100);
        bankAccount_B.printBalance();
        transferAmount(bankAccount_A, bankAccount_B, 40);
        bankAccount_A.printBalance();
        bankAccount_B.printBalance();
    }

}
