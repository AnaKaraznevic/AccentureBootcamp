package ThirdDay;

public class BankAccountNew {

    private double balance;
    final static double MAX_DEPOSIT = 5000;

    public BankAccountNew (){
    }

    public BankAccountNew (double balance){
        this.balance = balance;
        System.out.println("Bank account with balance " + balance + " opened.");
    }

    public void deposit (double amount){
        if (amount > MAX_DEPOSIT){
            System.out.println("Transaction canceled. Max deposit - " + MAX_DEPOSIT + " | Your deposit: " + amount);
        }
        else {
            balance = balance + amount;
            System.out.println("The amount " + amount + " was deposited");
        }

    }

    public void withdraw (double amount){
        if (balance >= amount){
            balance = balance - amount;
            System.out.println("The amount " + amount + " was withdrawn");
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance (){
        return balance;
    }

    public void printBalance (){
        System.out.println("Balance: " + balance);
    }

    public static void transferAmount (BankAccountNew bankAccountFrom, BankAccountNew bankAccountTo, double amount){
        double balance = bankAccountFrom.getBalance();
        if (amount > balance){
            System.out.println("Transfer canceled. You are trying to transfer " + amount + " units, but only " + balance +  " are available.");
        }
        else {
            bankAccountFrom.withdraw(amount);
            bankAccountTo.deposit(amount);
        }
    }

    public static void main (String[] args){
        BankAccountNew bankAccount_A = new BankAccountNew(100);
        BankAccountNew bankAccount_B = new BankAccountNew(200);
        bankAccount_A.deposit(600);
        bankAccount_A.printBalance();
        bankAccount_B.withdraw(100);
        bankAccount_B.printBalance();
        transferAmount(bankAccount_A,bankAccount_B,60);
        bankAccount_A.printBalance();
        bankAccount_B.printBalance();
    }

}

/*
 create a class "ThirdDay.BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another

    Update your solution:
        * Encapsulate the balance property so it is private
        * add to "withdraw" method, so it would be impossible to withdraw
          more money than exists in bank account. If there is an attempt to withdraw
          more money than exists in bank account, output message:
            "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more
          money from the other account than it's balance.
                For example, if bank account A has 50 units and bank account B has 25 units
                and we try to transfer 30 units from B to A, then it should output:
                    "Transfer canceled. You are trying to transfer 30 units, but only 25 are available."
        * add a limit for depositing money. If the deposit is greater than 5000, then it should not
          do the deposit and output message:
              "Transaction canceled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account than possible
 */