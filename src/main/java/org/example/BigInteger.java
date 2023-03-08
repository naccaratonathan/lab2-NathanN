package org.example;

public class BigInteger {

    public static void main(String[] args)
    {

        java.math.BigInteger a = new java.math.BigInteger("12345678987654321");

        int exponent1 = 2;
        int exponent2 = 4;
        int exponent3 = 8;


        java.math.BigInteger square = a.pow(exponent1);
        java.math.BigInteger fourth = a.pow(exponent2);
        java.math.BigInteger eighth = a.pow(exponent3);

        System.out.println(square);
        System.out.println(fourth);
        System.out.println(eighth);

    }
}
