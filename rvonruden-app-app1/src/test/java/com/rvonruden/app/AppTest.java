package com.rvonruden.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Fizz Buzz App.
 * All Rules for Fizz Buzz apply.
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
    public void testFizzBuzz_Given_1_Expect_1()
    {
        String actual = App.FizzBuzz(1);
        assertEquals("1", actual);
    }
    
    public void testFizzBuzz_Given_2_Expect_2()
    {
        String actual = App.FizzBuzz(2);
        assertEquals("2", actual);
    }

    public void testFizzBuzz_Given_3_Expect_Fizz()
    {
        String actual = App.FizzBuzz(3);
        assertEquals("Fizz", actual);
    }

    public void testFizzBuzz_Given_4_Expect_4()
    {
        String actual = App.FizzBuzz(4);
        assertEquals("4", actual);
    }

    public void testFizzBuzz_Given_5_Expect_Buzz()
    {
        String actual = App.FizzBuzz(5);
        assertEquals("Buzz", actual);
    }

    public void testFizzBuzz_Given_6_Expect_Fizz()
    {
        String actual = App.FizzBuzz(6);
        assertEquals("Fizz", actual);
    }
    
    public void testFizzBuzz_Given_7_8_Expect_7_8()
    {
        String actual = App.FizzBuzz(7);
        assertEquals("7", actual);

        actual = App.FizzBuzz(8);
        assertEquals("8", actual);
    }

    public void testFizzBuzz_Given_9_Expect_Fizz()
    {
        String actual = App.FizzBuzz(9);
        assertEquals("Fizz", actual);
    }

    public void testFizzBuzz_Given_10_Expect_Buzz()
    {
        String actual = App.FizzBuzz(10);
        assertEquals("Buzz", actual);
    }

    public void testFizzBuzz_Given_12_Expect_Fizz()
    {
        String actual = App.FizzBuzz(12);
        assertEquals("Fizz", actual);
    }

    public void testFizzBuzz_Given_15_Expect_FizzBuzz()
    {
        String actual = App.FizzBuzz(15);
        assertEquals("FizzBuzz", actual);
    }

    public void testFizzBuzz_Given_multple_of_3_Expect_Fizz()
    {
        String actual = App.FizzBuzz(3);
        assertEquals("Fizz", actual);

        actual = App.FizzBuzz(6);
        assertEquals("Fizz", actual);

        actual = App.FizzBuzz(9);
        assertEquals("Fizz", actual);

        actual = App.FizzBuzz(12);
        assertEquals("Fizz", actual);
    }

    public void testFizzBuzz_Given_multple_of_5_Expect_Buzz()
    {
        String actual = App.FizzBuzz(5);
        assertEquals("Buzz", actual);

        actual = App.FizzBuzz(10);
        assertEquals("Buzz", actual);

        actual = App.FizzBuzz(20);
        assertEquals("Buzz", actual);

        actual = App.FizzBuzz(25);
        assertEquals("Buzz", actual);
    }

    public void testFizzBuzz_Given_multple_of_3_and_5_Expect_FizzBuzz()
    {
        String actual = App.FizzBuzz(15);
        assertEquals("FizzBuzz", actual);

        actual = App.FizzBuzz(30);
        assertEquals("FizzBuzz", actual);

        actual = App.FizzBuzz(45);
        assertEquals("FizzBuzz", actual);

        actual = App.FizzBuzz(60);
        assertEquals("FizzBuzz", actual);
    }
}