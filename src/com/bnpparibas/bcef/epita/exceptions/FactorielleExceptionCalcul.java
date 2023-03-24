package com.bnpparibas.bcef.epita.exceptions;

public class FactorielleExceptionCalcul extends FactorielleException {
    public FactorielleExceptionCalcul(long n) {
        super(n);
        System.out.println(n + " est trop grand.");
    }
}
