package com.cbfacademy.accounts;

public class Account {

    // Creating fields accountNumber and balance. Remember to create the fields above the constructor
    protected int accountNumber; // private variables: The balance of an account may only be modified through the deposit() and withdraw() methods.
    protected double balance; // These are the two instance field variables that will store the account number and the balance when you create a new instance of the account class.

    public Account(int accountNumber, double balance) { // constructor that accepts parameters representing the new account number and starting balance
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Returns the current account balance
    public double getBalance() { // we return the current balance via the instance field for that instance
        return this.balance;
    }


    // returns the account number
    public int getAccountNumber() {
        return this.accountNumber;
    }


    // deposits funds to the account and returns the new balance
    public double deposit(double amount) { // the method called 'deposit' takes the amount that we want to deposit
        this.balance = this.balance + amount; // the balance + the amount deposited = new balance. Alternative: this balance += amount;
        return this.balance;
    }

    // withdraws funds from the account and returns the requested amount if the account has an insufficient balance, otherwise return 0.
    public double withdraw(double requested) {
        if (requested < 0  || this.balance < requested) {
            return 0;
        } else {
            this.balance -= requested;
            return requested;
        }

    }

    protected void setBalance(double newBalance) {
    }
}

// Note that the Account class is just a blueprint - it shouldn't have anything to do with the overdraft or interest rate.



// Alternative, but with more if and return statements. Less concise

//
//public double withdraw(double requested) {
//    if (requested < 0 ) {
//        return 0;
//    }
//    else if (this.balance < requested) {  // E.g if you want to withdraw £50, but you have £49,
//        return 0; // then you return '0' i.e 'no money, you can't withdraw that £50 because you don't have an overdraft facility.'
//    } else { // Otherwise,
//        this.balance -= requested; // we adjust our balance to make sure we take the £50 off,
//        return requested; //  then we withdraw that £50 out of the account.
//
//
//
//
