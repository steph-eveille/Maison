package com.bnpparibas.bcef.epita.exceptions;

public class ExcMain {
    public static void main(String[] args) {

        try {
            Factorielle f1 = new Factorielle(-5);
            f1.display();
        }
        catch (FactorielleExceptionNeg e) {
            System.out.println("c'est négatif");
        }
        catch (FactorielleExceptionCalcul e) {
            System.out.println("c'est trop grand");
        }
        catch (FactorielleException e) {
            System.out.println("c'est bizarre");

        }

/*
        for (long i = 1 ; i <= 30 ; i++) {
            Factorielle f1 = new Factorielle(i);
            f1.display();

            try {
                Factorielle f1 = new Factorielle(i);
                f1.display();
            }
            catch (FactorielleException e) {
                break;
            }
        }
 */
    }


}
