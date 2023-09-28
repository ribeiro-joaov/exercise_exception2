import model.DomainException;
import model.entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ACCOUNT DATA:");
        System.out.print("Account number: ");
        Integer accountNumber = sc.nextInt();
        System.out.print("Account holder: ");
        String accountHolder = sc.next();
        System.out.print("Current balance: ");
        double currentBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(accountNumber, accountHolder, currentBalance, withdrawLimit);

        System.out.print("Enter amount for deposit: ");
        double amountDeposit = sc.nextDouble();
        account.deposit(amountDeposit);
        System.out.printf("New balance: %.2f%n",account.getBalance());

        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double amountWithdraw = sc.nextDouble();

        try {
            account.withDraw(amountWithdraw);
            System.out.printf("New balance: %.2f%n", account.getBalance());

        }
        catch (DomainException msg){
            System.out.println("Withdraw error: " + msg.getMessage());
        }

    }
}