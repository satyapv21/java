package com.example.helloworld.HelloWorld;

public class UsageStatic {
    public static final double PI = 3.14;

    public static void main(String[] args) {

        System.out.println(PI);

        // Usage of Static
        // Call the method directly without creating Objects
        int x=10;
        int y=20;
        int z=Integer.max(x,y);
        System.out.println(z);


        //
        String money = "300";

        // Objects
        Integer a = Integer.valueOf(money);

        // parseInt is primitive data type
        int b=Integer.parseInt(money);
        System.out.println(a);
        System.out.println(b);

    }

}
