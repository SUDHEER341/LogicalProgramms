package com.logicalprograms;

public class Primenumber {
    public static void main(String[] args) {
        int n = 29;
        int count = 0;
        if (n <= 1)
        {
            System.out.println("The number is not prime");
        }
        for (int i = 1; i <= n / 2; i++)
        {
            if (n % i == 0)
            {
                count++;
                if(count>1)
                {
                    break;
                }
            }
        }
        if (count > 1) {
            System.out.println( n + "  is not prime number");
        }
        else {
            System.out.println(n + " is prime number");
        }
    }
}
