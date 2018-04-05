package com.rvonruden.app;

import java.math.BigDecimal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void test_Check_Balance()
    {
        int accountNumber = 12345;
        String actual = App.CheckBalance(accountNumber);
        assertEquals("You have $99", actual);
    }

    public void test_Withdraw()
    {
        int accountNumber = 12345;
        String actual = App.Withdraw(accountNumber);
        assertEquals("You have withdrawn $99", actual);
    }

    public void test_Deposit()
    {
        int accountNumber = 12345;
        String actual = App.Deposit(accountNumber);
        assertEquals("You have deposited $99", actual);
    }

    public void test_BankVault_Can_Get_Bank_Account_Happy_Path()
    {
        int accountNumber = 12345;
        BigDecimal expected_balance = new BigDecimal("99.05");
        BankVault vault = new BankVault();
        vault.InitializeBankVault();
        BankAccount bankAccount = vault.Get_Bank_Account(accountNumber); 
        assertEquals(expected_balance, bankAccount.Balance());
        assertEquals(accountNumber, bankAccount.AccountNumber());
    }

    public void test_BankVault_Can_Get_Bank_Account_Not_Found()
    {
        int accountNumber = 54321;
        BankVault vault = new BankVault();
        vault.InitializeBankVault();
        BankAccount bankAccount = vault.Get_Bank_Account(accountNumber); 
        assertNull(bankAccount);
    }

    public void test_AtmService_Can_Check_Balance()
    {
        int accountNumber = 43215;
        BigDecimal expectedBalance = new BigDecimal("50.15");
        AtmService atmService = new AtmService();
        BigDecimal actualBalance = atmService.CheckBalance(accountNumber);
        assertEquals(expectedBalance, actualBalance);
    }

    public void test_AtmService_Can_Check_Balance_Not_Found()
    {
        int accountNumber = 54321;
        AtmService atmService = new AtmService();
        BigDecimal actualBalance = atmService.CheckBalance(accountNumber);
        assertNull(actualBalance);
    }

    public void test_AtmService_Withdraw()
    {
        int accountNumber = 43215;
        BigDecimal withdrawAmmount = new BigDecimal("40.05");
        BigDecimal expectedBalance = new BigDecimal("10.10");
        AtmService atmService = new AtmService();
        BigDecimal actualBalance = atmService.WithdrawFromAccount(accountNumber, withdrawAmmount);
        assertEquals(expectedBalance, actualBalance);
    }
}