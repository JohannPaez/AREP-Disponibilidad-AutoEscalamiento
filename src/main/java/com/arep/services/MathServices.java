package com.arep.services;

import java.math.BigInteger;

import static com.arep.model.MathOperations.combinate;

public class MathServices {

    public MathServices() {

    }

    /**
     * Calcula la sumatoria de la combinatoria desde 1 hasta n
     * @param n Es el número a calcular la sumatoria de la combinatoria desde 1 hasta n
     * @return La sumatoria de la combinatoria
     */
    public BigInteger combinateOneToN(int n) {
        BigInteger res = BigInteger.ZERO;
        for (int i = 1; i < n; i++) {
            res = res.add(combinate(n, i));
        }
        return res;
    }
}
