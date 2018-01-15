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
    public void test_Given_1_Expect_Roman_Numeral_I()
    {
        String actual = App.Romanize(1);
        assertEquals("I", actual);
    }

    public void test_Given_2_Expect_Roman_Numeral_II()
    {
        String actual = App.Romanize(2);
        assertEquals("II", actual);
    }

    public void test_Given_3_Expect_Roman_Numeral_III()
    {
        String actual = App.Romanize(3);
        assertEquals("III", actual);
    }

    public void test_Given_4_Expect_Roman_Numeral_IV()
    {
        String actual = App.Romanize(4);
        assertEquals("IV", actual);
    }

    public void test_Given_5_Expect_Roman_Numeral_V()
    {
        String actual = App.Romanize(5);
        assertEquals("V", actual);
    }

    public void test_Given_6_Expect_Roman_Numeral_VI()
    {
        String actual = App.Romanize(6);
        assertEquals("VI", actual);
    }

    public void test_Given_7_Expect_Roman_Numeral_VII()
    {
        String actual = App.Romanize(7);
        assertEquals("VII", actual);
    }

    public void test_Given_8_Expect_Roman_Numeral_VIII()
    {
        String actual = App.Romanize(8);
        assertEquals("VIII", actual);
    }

    public void test_Given_9_Expect_Roman_Numeral_IX()
    {
        String actual = App.Romanize(9);
        assertEquals("IX", actual);
    }

    public void test_Given_10_Expect_Roman_Numeral_X()
    {
        String actual = App.Romanize(10);
        assertEquals("X", actual);
    }

    public void test_Given_11_Expect_Roman_Numeral_XI()
    {
        String actual = App.Romanize(11);
        assertEquals("XI", actual);
    }

    public void test_Given_12_Expect_Roman_Numeral_XII()
    {
        String actual = App.Romanize(12);
        assertEquals("XII", actual);
    }

    public void test_Given_13_Expect_Roman_Numeral_XIII()
    {
        String actual = App.Romanize(13);
        assertEquals("XIII", actual);
    }

    public void test_Given_14_Expect_Roman_Numeral_XIV()
    {
        String actual = App.Romanize(14);
        assertEquals("XIV", actual);
    }

    public void test_Given_15_Expect_Roman_Numeral_XV()
    {
        String actual = App.Romanize(15);
        assertEquals("XV", actual);
    }

    public void test_Given_39_Expect_Roman_Numeral_XXXIX()
    {
        String actual = App.Romanize(39);
        assertEquals("XXXIX", actual);
    }

    public void test_Given_563_Expect_Roman_Numeral_DLXIII()
    {
        String actual = App.Romanize(563);
        assertEquals("DLXIII", actual);
    }
    public void test_Given_1871_Expect_Roman_Numeral_MDCCCLXXI()
    {
        String actual = App.Romanize(1871);
        assertEquals("MDCCCLXXI", actual);
    }

    public void test_Given_1900_Expect_Roman_Numeral_MCM()
    {
        String actual = App.Romanize(1900);
        assertEquals("MCM", actual);
    }

    public void test_Given_2018_Expect_Roman_Numeral_MMXVIII()
    {
        String actual = App.Romanize(2018);
        assertEquals("MMXVIII", actual);
    }

    public void test_Given_397_Expect_Roman_Numeral_CCCXCVII()
    {
        String actual = App.Romanize(397);
        assertEquals("CCCXCVII", actual);
    }

    public void test_Given_54_Expect_Roman_Numeral_LIV()
    {
        String actual = App.Romanize(54);
        assertEquals("LIV", actual);
    }
      


}
