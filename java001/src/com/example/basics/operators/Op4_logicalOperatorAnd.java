package com.example.basics.operators;

public class Op4_logicalOperatorAnd {
    public static void main(String[] args) {

        //koniunkcja - operator logiczny, inaczej and (&&)

        System.out.println( 5<10 && 20>=15 ); //true && true = wynik true
        System.out.println( 5<10 && 20<15 ); //true && true = wynik false
        System.out.println( 5>10 && 10==11 ); //false && true = wynik false
        System.out.println( 5<10 && 10==20 ); //false && false = wynik false
    }
}
