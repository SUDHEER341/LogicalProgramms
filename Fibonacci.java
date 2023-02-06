package com.logicalprograms;
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, term1 = 0, term2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(term1 + "  ");

            int sum = term1 + term2;
            term1 = term2;
            term2 = sum;
        }
    }
}
