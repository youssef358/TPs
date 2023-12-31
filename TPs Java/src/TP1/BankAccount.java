package TP1;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;
    public BankAccount(int a, String s , int b){
        this.accountNumber = a;
        this.accountHolderName = s;
        this.balance = b;
    }

    public int getAccountNumber() {
        return (this.accountNumber);
    }

    public String getAccountHolderName() {
        return (this.accountHolderName);
    }

    public int getBalance() {
        return (this.balance);
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Cannot withdraw");
        }
    }
    public void afficher(){
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Account Holder Name: "+this.accountHolderName);
        System.out.println("Account balance: "+this.balance);
    }
}