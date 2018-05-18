package com.rvonruden.app;

import java.math.BigDecimal;
import java.util.Scanner;


public class App 
{
    static AtmService atmService = new AtmService();
    static Scanner scanner = new Scanner(System.in);
    
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
            int inputAction = 0;
            while(inputAction != 4)
            {
                System.out.println("Would you like to 1 = checkBalance, 2 = Deposit, 3 = Withdraw, 4 = Log Out");
                inputAction = scanner.nextInt();
    
                if(inputAction != 1 && inputAction != 2 && inputAction != 3 && inputAction != 4)
                {
                    System.out.println("Ivalid action, please pick 1 = checkBalance, 2 = Deposit, 3 = Withdraw, 4 = Log Out");
                }
                else if (inputAction == 1)
                {
                    CheckBalance(inputAccountNumber);
                }
                else if (inputAction == 2)
                {
                    Deposit(inputAccountNumber);
                }
                else if (inputAction == 3)
                {
                    Withdraw(inputAccountNumber);
                }
            }
            System.out.println("  ");
            System.out.println("Tranaction complete, thank you for using Von Ruden bank");
        }

    }
    
    public static void noAccountWithNumber()
    {
        System.out.println("  ");
        System.out.println("No account with that account number.");
        System.out.println("   ");
        System.out.println("Try again another time");
    }

    public static void CheckBalance(int inputAccountNumber)
    {
        BigDecimal accountBalance = atmService.CheckBalance(inputAccountNumber);
        System.out.println("  ");
        System.out.println("Your account balance is " + accountBalance);
        System.out.println("  ");
    }

    public static void Deposit(int inputAccountNumber)
    {
        System.out.println("Please enter ammount to deposit");
        BigDecimal depositAmmount = scanner.nextBigDecimal();
        System.out.println("  ");         
        BigDecimal accountBalance = atmService.DepositToAccount(inputAccountNumber, depositAmmount);
        System.out.println("Deposit sucessful, You deposited " + depositAmmount);
        System.out.println("  ");
        System.out.println("Your new account balance is " + accountBalance);
        System.out.println("  ");
        
    }

    public static void Withdraw(int inputAccountNumber)
    {
        System.out.println("Please enter ammount to withdraw");
        BigDecimal withdrawAmmount = scanner.nextBigDecimal();
        System.out.println("  ");        
        BigDecimal accountBalance = atmService.WithdrawFromAccount(inputAccountNumber, withdrawAmmount);
        System.out.println("  ");
        System.out.println("Your account balance is " + accountBalance);
        System.out.println("  ");
        
    }
}
    

  
