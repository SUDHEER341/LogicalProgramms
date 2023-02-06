package com.logicalprograms;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long start,end;
        double time;

        System.out.println("Type any character to start the stopwatch");
        char startTime=scanner.next().charAt(0);

        start=System.currentTimeMillis();
        System.out.println("stop watch starts at  "+ start);

        System.out.println("Type any character to stop the stopwatch");
        char stopTime=scanner.next().charAt(0);
        end=System.currentTimeMillis();
        System.out.println("stop watch ends at  "+ end);

        time=(end-start)/1000.0;
        System.out.println(time);
    }
}
