package com.example.helloworld.HelloWorld;

import java.util.Scanner;

public class AnotherTest {

    public static void main(String[] args) {

        System.out.println("What is your name? ");

        // Take Input and save in String
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        int y = scanner.nextInt();
        int z = y + 10;
        System.out.println("Integer "+z);

        System.out.println("Hello "+name);
        var x = new AnotherTest();
        x.pizza();

    }

    public void pizza() {

        System.out.println("Pizza");

    }


}
