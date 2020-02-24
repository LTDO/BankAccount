package bank;

import javax.swing.*;
import java.io.FileReader;

public class BankAccount {
     private String accountHolder;
     private long accountNumber;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public BankAccount(){}

    public void deposit(double depAmount){
        balance += depAmount;
    }
    public boolean withdraw(double withAmount){
        if(withAmount >= balance){
            System.out.println("Insufficient funds");
            return false;
        }else{
            balance -= withAmount;
            return true;
        }
    }

    public Object showBalance(){
        StringBuilder builder = new StringBuilder();
        builder.append("Account Holder: " + getAccountHolder() + "\n");
        builder.append("Account Number: " + getAccountNumber() + "\n");
        return builder;
    }
}
