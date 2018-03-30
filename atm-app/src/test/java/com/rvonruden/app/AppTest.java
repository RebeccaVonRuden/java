package com.rvonruden.app;

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
}