import model.entities.Accounts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Initial balance: ");
        double currentBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();


        Accounts account = new Accounts(accountNumber, accountHolder, currentBalance, withdrawLimit);

        System.out.println();

        System.out.print("Enter amount for deposit: ");
        double amountDeposit = sc.nextDouble();
        account.deposit(amountDeposit);
        System.out.println("New balance: " + String.format("%.2f", account.getCurrentBalance()));

        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try{
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getCurrentBalance()));
        }
        catch (RuntimeException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();

    }
}