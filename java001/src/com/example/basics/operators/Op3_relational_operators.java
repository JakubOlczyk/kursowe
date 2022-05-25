package com.example.basics.operators;

public class Op3_relational_operators {
    public static void main(String[] args) {

        boolean b1 = 5==3; //false
        System.out.println(b1);

        boolean b2 = 7==7; //true
        System.out.println(b2);

        boolean b3 = 7!=7; //false
        System.out.println(b3);
        boolean b4 = 4!=7; //true
        System.out.println(b4);

        boolean b5 = 10>4; //true
        System.out.println(b5);
        boolean b6 = 10<4; //false
        System.out.println(b6);

        boolean b7 = 8>=6; //true
        System.out.println(b7);
        boolean b8 = 8>=8; //true
        System.out.println(b8);

        boolean b9 = 8>=9; //false
        System.out.println(b9);

        boolean b10 = 8<=10; //true
        System.out.println(b10);


    }
}
