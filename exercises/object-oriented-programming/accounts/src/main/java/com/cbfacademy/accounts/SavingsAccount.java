package com.cbfacademy.accounts;
public class SavingsAccount extends Account { // SavingsAccount class is a subclass of Account

    protected double interestRate; // there's no interestRate field in the Account class, so we are creating/defining it here.

    // constructor that accepts parameters representing the new account number, starting balance and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance); // when we call super, we are calling the constructor method for the parent class, using the super keyword, you're passing the fields or parameters from the Accounts (base, parent or super) class into this class. So, no need to create fields for accountNumber and balance again in this class.

        this.interestRate = interestRate;
    }

    // applies interest to the account
    public void applyInterest(){ // we want to apply the interest on the amount in the account aka the balance
        deposit(getBalance() * interestRate); // getBalance is getting the Balance method from the Account class. This line of code will give the result of the getBalance method e.g 10000, times the interestRate e.g 5%. the account number and balance in the Account class are private, so we need to call the deposit method to pass new values in
    }

    // returns the current interest rate
    public double getInterestRate(){ //
        return this.interestRate;
    }

    // sets the interest rate
    public void setInterestRate(double interestRate) { // our interestRate field at the top takes type double, so this should be double as well
        if (interestRate >= 0) {
            this.interestRate = interestRate; // set the instance interest rate to the new interest rate value
        }
    }
}
