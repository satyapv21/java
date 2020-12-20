package com.example.helloworld.HelloWorld;

public class IndexOOfBounds {

    public static void main(String[] args) {
        String x = "hello";

        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
        System.out.println(x.charAt(4));

    }
}
