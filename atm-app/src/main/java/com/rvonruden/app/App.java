package com.rvonruden.app;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Von Ruden Bank!" );
        System.out.println( "      " );
        System.out.println( "Enter bank account number" );
        Scanner scanner = new Scanner(System.in);
        int inputAccountNumber = scanner.nextInt();
        AtmService atmService = new AtmService();
        boolean accountExistance = atmService.DoesBankAccountExist(inputAccountNumber);
        if(accountExistance == false)
        {
            System.out.println(" No account with that account number.");
            System.out.println("     ");
            System.out.println(" Try again another time");
        }
        else
        {
            System.out.println(" Would you like to 1 = checkBalance, 2 = Deposit, 3 = Withdraw");
            int inputAction = scanner.nextInt();
            if(inputAction != 1 && inputAction != 2 && inputAction != 3)
            {
                System.out.println(" Ivalid action, please pick 1 = checkBalance, 2 = Deposit, 3 = Withdraw");
            }
            else if (inputAction == 1)
            {
                BigDecimal accountBalance = atmService.CheckBalance(inputAccountNumber);
                System.out.println(" Your account balance is " + accountBalance);
            }
            else if (inputAction == 2)
            {
                System.out.println(" Please enter smmount to deposit");
                BigDecimal depositAmmount = scanner.nextBigDecimal(); 
                BigDecimal accountBalance = atmService.DepositToAccount(inputAccountNumber, depositAmmount);
                System.out.println(" Deposit sucessful, You deposited " + depositAmmount);
                System.out.println(" Your new account balance is " + accountBalance);
            }
            else
            {
                System.out.println(" Please enter smmount to withdraw");
                BigDecimal withdrawAmmount = scanner.nextBigDecimal(); 
                BigDecimal accountBalance = atmService.WithdrawFromAccount(inputAccountNumber, withdrawAmmount);
                System.out.println(" Your account balance is " + accountBalance);
            }
        }

    }
    

    // BankVault b = new BankVault();
    // b.InitializeBankVault();
    // b.CheckBalance(12345);

    public static String methodToTest(int input)
    {
        return "1";
    }

    public static String CheckBalance(int input)
    {
        return "You have $99";
    }

    public static String Withdraw(int input)
    {
        return "You have withdrawn $99";
    }

    public static String Deposit(int input)
    {
        return "You have deposited $99";
    }
}
