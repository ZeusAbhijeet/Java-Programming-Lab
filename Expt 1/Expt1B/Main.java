package Expt1B;

import java.util.Scanner;

class BankAccount {
    private final String accountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(String accNum, String accHN, double bal) {
        this.accountNumber = accNum;
        this.accountHolderName = accHN;
        this.balance = bal;
        System.out.println();
    }

    public void display() {
        System.out.println("Account No.: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + balance);
        System.out.println();
    }

    public void deposit(double dep) {
        balance += dep;
        System.out.println("Amount " + dep + " deposited successfully");
        System.out.println();
    }

    public void withdraw(double with) {
        if (balance >= with) {
            balance -= with;
            System.out.println("Amount " + with + " withdrawn successfully");
        } else
            System.out.println("Insufficient balance");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account no.: ");
        String accountNumber = sc.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accountNumber, accountHolderName, balance);

        acc.display();

        System.out.print("Enter amount to be deposited: ");
        balance = sc.nextDouble();
        acc.deposit(balance);
        acc.display();

        System.out.println("Enter amount to be withdrawn: ");
        balance = sc.nextDouble();
        acc.withdraw(balance);
        acc.display();

        sc.close();
    }
}
