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
        BigDecimal actualNewBalance = atmService.CheckBalance(accountNumber);
        assertEquals(expectedBalance, actualNewBalance);
    }

    public void test_AtmService_Withdraw_Not_Enough_Money()
    {
        int accountNumber = 43215;
        BigDecimal withdrawAmmount = new BigDecimal("60.30");
        AtmService atmService = new AtmService();
        BigDecimal actualBalance = atmService.WithdrawFromAccount(accountNumber, withdrawAmmount);
        assertNull(actualBalance);
    }

    public void test_AtmService_Withdraw_Failure_To_Find_Account_Number()
    {
        try
        {
            int accountNumber = 54321;
            BigDecimal withdrawAmmount = new BigDecimal("60.30");
            AtmService atmService = new AtmService();
            BigDecimal actualBalance = atmService.WithdrawFromAccount(accountNumber, withdrawAmmount);
            fail("Missing exception");
        }
        catch(IllegalArgumentException e)
        {
            assertEquals("No account with that account number", e.getMessage());
        }
    }
    
    public void test_AtmService_Deopsit()
    {
        int accountNumber = 43215;
        BigDecimal depositAmmount = new BigDecimal("40.05");
        BigDecimal expectedBalance = new BigDecimal("90.20");
        AtmService atmService = new AtmService();
        BigDecimal actualBalance = atmService.DepositToAccount(accountNumber, depositAmmount);
        assertEquals(expectedBalance, actualBalance);
        BigDecimal actualNewBalance = atmService.CheckBalance(accountNumber);
        assertEquals(expectedBalance, actualNewBalance);
    }

    public void test_AtmService_Deopsit_Fail()
    {
        int accountNumber = 54321;
        BigDecimal depositAmmount = new BigDecimal("40.05");
        AtmService atmService = new AtmService();
        BigDecimal actualBalance = atmService.DepositToAccount(accountNumber, depositAmmount);
        assertNull(actualBalance);
    }

    public void test_AtmService_Does_Bank_Account_Exist_True()
    {
        int accountNumber = 43215;
        AtmService atmService = new AtmService();
        boolean BankAccountExist = atmService.DoesBankAccountExist(accountNumber);
        assertTrue(BankAccountExist);
    }

    public void test_AtmService_Does_Bank_Account_Exist_False()
    {
        int accountNumber = 54321;
        AtmService atmService = new AtmService();
        boolean BankAccountExist = atmService.DoesBankAccountExist(accountNumber);
        assertFalse(BankAccountExist);
    }
}