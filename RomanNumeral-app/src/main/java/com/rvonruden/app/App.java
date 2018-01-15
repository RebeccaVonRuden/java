package com.rvonruden.app;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "The Roman numeral is " + Romanize(25) );
        
    }

    public static String Romanize(int input) 
    {
        int i = input;
        String result = "";
        // Special Roman numerals mapping
        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] numerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        // Prosses each numeral before checking the next one in order of highest to lowest.
        for(int n = 0; n < numbers.length; n++)
        {
            // Check for multiples of of this numeral
            while(i >= numbers[n])
            {
                result = result + numerals[n];
                i = i - numbers[n];
            }

        }
      
        return result;

    }
}
