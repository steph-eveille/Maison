package com.bnpparibas.bcef.epita.exceptions;

public class Factorielle {

    private long n ;
    private long facto ;

    Factorielle(long n) throws FactorielleException
    {
        if (n < 0){
            throw new FactorielleExceptionNeg(n) ;
        }
        else if ((n >= 21) && (n < 50)) {
            throw new FactorielleExceptionCalcul(n) ;
        }
        else if (n >= 50) {
            throw new FactorielleException(n) ;
        }
        else {
            this.n = n ;
            this.facto = 1L ;
            if (n > 1) {
                for (long i = 2L ; i <= n ; i++) {
                    this.facto = i * this.facto ;
                }
            }

        }

    }

    public void display() {
        System.out.println(n+"! = "+facto);
    }

}
