package com.logicalprograms;

public class ReverseNumber {
    public static void main(String[] args)
    {
        int number = 987654, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
       int temp = 987654;
        System.out.println("The reverse of the  " + temp + "is----  " + reverse);
    }
}
