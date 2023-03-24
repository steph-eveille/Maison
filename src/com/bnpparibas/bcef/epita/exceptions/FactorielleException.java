package com.bnpparibas.bcef.epita.exceptions;

public class FactorielleException extends Exception {
//public class FactorielleException extends RuntimeException {
    public FactorielleException() {
        System.out.println("Le nombre est trop grand.");


    }

    public FactorielleException(long n) {

        this.getMessage();
        this.getLocalizedMessage();
        this.printStackTrace();

    }
}
