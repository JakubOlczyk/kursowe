package com.example.basics.data;
import java.lang.*;

public class MathExample {
    public static void main(String[] args) {

        double d = 16.5d;
        double sqrt = Math.sqrt(d);
        System.out.println(sqrt);

        double power = Math.pow(d, 2);
        System.out.println(power);

        double mnoz = power * sqrt;
        System.out.println(mnoz);

        System.out.println(power/sqrt);
        System.out.println(mnoz*sqrt);
    }
}
