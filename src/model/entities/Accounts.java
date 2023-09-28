package model.entities;

import model.exceptions.DomainException;

public class Accounts {

    private Integer accountNumber;
    private String accountHolder;
    private Double currentBalance;
    private Double withdrawLimit;


    public Accounts(Integer accountNumber, String accountHolder, Double currentBalance, Double withdrawLimit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.currentBalance = currentBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }


    public void deposit(double amount){
        currentBalance += amount;
    }

    public void withdraw(){
        double withdraw = 0;
        currentBalance -= withdraw;
    }


    public void withdraw(double amount){
        if (amount > withdrawLimit){
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > currentBalance){
            throw new DomainException("Withdraw error: Not enough balance");
        }
        currentBalance -= amount;
    }



}
