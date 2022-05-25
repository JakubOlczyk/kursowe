package com.example.basics.data;

import java.math.*;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {

        BigInteger bigInt = new BigInteger("543543534534534534534535432342");
        bigInt = bigInt.add(new BigInteger("543534534534534534534"));
        System.out.println(bigInt.toString());

        BigDecimal decimal = new BigDecimal("54354353453212.231231321");
        decimal = decimal.pow(3);
        System.out.println(decimal.toString());
    }
}

