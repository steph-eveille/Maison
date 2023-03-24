package com.bnpparibas.bcef.epita.exceptions;

public class FactorielleExceptionNeg extends FactorielleException {
    public FactorielleExceptionNeg(long n) {
        super(n);
        System.out.println("Les nombres négatifs sont interdits");
    }
}
