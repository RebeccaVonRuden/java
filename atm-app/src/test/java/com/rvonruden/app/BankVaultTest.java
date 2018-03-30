package com.rvonruden.app;

import java.math.BigDecimal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class BankVaultTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BankVaultTest( String testName )
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
    
    public void test_Can_Check_Balance_Happy_Path()
    {
        int accountNumber = 12345;
        BigDecimal expected = new BigDecimal("99.05");
        BankVault vault = new BankVault();
        BigDecimal actual = vault.CheckBalance(accountNumber);
        assertEquals(expected, actual);
    }

}
