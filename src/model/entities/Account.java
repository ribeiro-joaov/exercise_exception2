package model.entities;

import model.DomainException;

public class Account {

    private Integer accountNumber;
    private String accountHolder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer accountNumber, String accountHolder, Double balance, Double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void deposit(double amount){
        balance += amount;
    }
    public void withDraw(double amount){
        if (amount > withdrawLimit){
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new DomainException("Withdraw error: Not enough balance");
        }
        balance -= amount;
    }
}
