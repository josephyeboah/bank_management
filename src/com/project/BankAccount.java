package com.project;

public class BankAccount {
    private double accountNumber;
    private double balance;
    private  double phoneNumber;
    private  String name;
    private  String email;

    public BankAccount(){
        this(10744, 105, 584_66,"Joseph", "joseph@email.com");
        System.out.println("Empty Constructor Called");
    }


    public BankAccount (double accountNumber, double balance, double phoneNumber, String name, String email ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double amount){
        this.balance+= amount;

    }
    public void withdraw (double amount ){

        if (this.balance - amount < 0){
            System.out.println("Only "+ this.balance + " available. Withdraw not processed");
        }
        else {
            this.balance -= amount;
        }
    }
}
