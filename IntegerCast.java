package com.example.helloworld.HelloWorld;

public class IntegerCast {
    public static void main(String[] args) {

        // Results in 2
        int x = 5/2;
        System.out.println(x);

        // Results in 2.5
        double d = 5.0/2;
        System.out.println(d);

        // Results in 2.5 since you're casting
        double dd = (double) 5/2;
        System.out.println(dd);
    }
}
