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
    AtmService atmService = new AtmService();
    Scanner scanner = new Scanner(System.in);
    
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Von Ruden Bank!" );
        System.out.println( "      " );
        System.out.println( "Enter bank account number" );
        int inputAccountNumber = scanner.nextInt();
        boolean accountExistance = atmService.DoesBankAccountExist(inputAccountNumber);
        if(accountExistance == false)
        {
            noAccountWithNumber();
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
                CheckBalance(inputAccountNumber);
            }
            else if (inputAction == 2)
            {
                Deposit(inputAccountNumber);
            }
            else
            {
               Withdraw(inputAccountNumber);
            }
        }

    }
    
    public static void noAccountWithNumber()
    {
        System.out.println(" No account with that account number.");
        System.out.println("     ");
        System.out.println(" Try again another time");
    }

    public static void CheckBalance(int inputAccountNumber)
    {
        BigDecimal accountBalance = atmService.CheckBalance(inputAccountNumber);
        System.out.println(" Your account balance is " + accountBalance);
    }

    public static void Deposit(int inputAccountNumber)
    {
        System.out.println(" Please enter smmount to deposit");
        BigDecimal depositAmmount = scanner.nextBigDecimal(); 
        BigDecimal accountBalance = atmService.DepositToAccount(inputAccountNumber, depositAmmount);
        System.out.println(" Deposit sucessful, You deposited " + depositAmmount);
        System.out.println(" Your new account balance is " + accountBalance);
    }

    public static void Withdraw(int inputAccountNumber)
    {
        System.out.println(" Please enter ammount to withdraw");
        BigDecimal withdrawAmmount = scanner.nextBigDecimal(); 
        BigDecimal accountBalance = atmService.WithdrawFromAccount(inputAccountNumber, withdrawAmmount);
        System.out.println(" Your account balance is " + accountBalance);
    }
}
    

  
