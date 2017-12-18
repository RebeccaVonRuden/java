package com.rvonruden.app;

/**
 *
 * Fizz Buzz is a game were any multple of three is Fizz.
 * Any mutilple of five is Buzz and any mulptple of five and three is Fizz Buzz.
 *
 * All Code is unit tested in AppTest.java to prove the above buisness rules are enforced
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to FizzBuzz!" );
        for (int i = 1; i <= 100; i++)
            {
            System.out.println( FizzBuzz(i) );

            }
    }

    public static String FizzBuzz(int input)
    {
      if (input % 3 == 0 && input % 5 == 0)
        {
            return "FizzBuzz";
        }
        else if (input % 5 == 0)
        {
            return "Buzz";
        }
        else if (input % 3 == 0)
        {
            return "Fizz";
        }
        else 
        {
            return Integer.toString(input);
        } 
// incorrect code to show kids at the elementry school feild trip.
       /* if (input % 3 == 0)
        {
            return "Fizz";
        }
        else if (input % 5 == 0)
        {
            return "Buzz";
        }
        else if (input % 3 == 0 && input % 5 == 0)
        {
            return "FizzBuzz";
        }
        else 
        {
            return Integer.toString(input);
        } */
    }
}