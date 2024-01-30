package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App
{
    /**
     * Main program:  The entry point of the program. The local time will be printed first,
     *      Then it will create two binary variables. It will add, bitwise-or, bitwise-and,
     *      and multiply the binary variables and print the results of each operation.
     *
     * @param args: not used
     */
    public static void main( String[] args )
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Binary binary1 = new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
        Binary binary2 = new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
        Binary sum = Binary.add(binary1,binary2);
        System.out.println( "Their summation is "+sum.getValue());
        Binary or = Binary.or(binary1,binary2);
        System.out.println( "Their bitwise-OR result is "+or.getValue());
        Binary and = Binary.and(binary1,binary2);
        System.out.println( "Their bitwise-AND result is "+and.getValue());
        Binary prod = Binary.multiply(binary1,binary2);
        System.out.println( "Their product is "+prod.getValue());
    }
}