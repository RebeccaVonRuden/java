package com.rvonruden.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BankVault b = new BankVault();
        b.InitializeBankVault();
        b.CheckBalance(12345);

    }
    
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
