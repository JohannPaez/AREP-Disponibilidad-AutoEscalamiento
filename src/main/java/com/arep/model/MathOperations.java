package com.arep.model;

import java.math.BigInteger;

public class MathOperations {

    /**
     * Retorna el factorial de n
     * @param n El número
     * @return Factorial(n)
     */
    public static BigInteger factorial(BigInteger n) {
        if (n.compareTo(new BigInteger("0")) == 0) return BigInteger.ONE;
        else if (n.compareTo(new BigInteger("3")) < 0) return n;

        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    /**
     * Calcula la combinatoria de n, r
     * @param n Límite superior
     * @param r Límite inferior
     * @return Combinatoria(n, r)
     */
    public static BigInteger combinate(int n , int r) {
        if (n == r) return BigInteger.ONE;
        if (n < r) return BigInteger.ZERO;

        return factorial(BigInteger.valueOf(n)).divide((factorial(BigInteger.valueOf(r)).multiply(factorial(BigInteger.valueOf(n - r)))));
    }

}
