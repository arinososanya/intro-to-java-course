package com.cbfacademy.accounts;

public class CurrentAccount extends Account{

    protected double overdraftLimit;

    // constructor that accepts parameters representing the new account number, starting balance and overdraft limit
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // returns the current overdraft limit
    public double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    // sets the overdraft limit
    public void setOverdraftLimit(double expectedOverdraftLimit) {
        if (expectedOverdraftLimit >= 0) {
            this.overdraftLimit = expectedOverdraftLimit;
        }
    }


    @Override
    public double withdraw(double requested) {
        // Check if the withdrawal would exceed the overdraft limit
        if (super.getBalance() - requested < -overdraftLimit) {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
            return 0;
        } else {
            super.setBalance(super.getBalance() - requested); // Use super methods for access
            return requested;
        }
    }

//    ANDREW'S ANSWER
//    // You need an override method to be able to override the withdraw method in the Account class.
//    @Override
//    public double withdraw(double requested) {
//        // Check if the withdrawal would exceed the overdraft limit
//if (
//        (this.balance + this.overdraftLimit) < requested
//) {
//    return 0;
//} else {
//    balance -= requested; // adjust the balance to remove the amount that's been requested and then return the requested amount
//    return requested;
//        }
//    }
}


