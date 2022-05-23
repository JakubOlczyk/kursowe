package com.example.basics.operators;

public class Op5_logicalOperatorOr {
    public static void main(String[] args) {

        //operator logiczny alternatywa, inaczej lub, or (||)
        //true||true = true  chociaż po jednej stronie true = true
        //false||false = false

        System.out.println( 10>2 || 5>=5 ); //true
        System.out.println( 10<5 || 5==5); //true
        System.out.println( 10>5 || 5<2);  //true
        System.out.println(10<5 || 5<2);  //false
    }
}
