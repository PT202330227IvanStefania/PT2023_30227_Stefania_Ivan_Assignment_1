package DataModels;

import BussinesLogic.Operations;

public class Main {
    public static void main(String[] args){
        /*Monomial m1 = new Monomial(5,4);
        Monomial m2 = new Monomial(3,2);
        Monomial m4 = new Monomial(1,1);
        Monomial m3 = new Monomial(2,3);

        Monomial m5 = new Monomial(7,1);
        Monomial m6 = new Monomial(-3,3);
        Monomial m7 = new Monomial(2,7);
        Monomial m8 = new Monomial(-7,6);
        Monomial m9 = new Monomial(-8,7);*/

        Monomial m1 = new Monomial(1.0, 3);
        Monomial m2 = new Monomial(-2.0, 2);
        Monomial m3 = new Monomial(6.0,1);
        Monomial m6 = new Monomial(-5.0, 0);

        Monomial m4 = new Monomial(1.0,2);
        Monomial m5 = new Monomial(-1.0,0);


        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);
        p1.addMonomial(m6);

        p2.addMonomial(m4);
        p2.addMonomial(m5);


        /*p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m4);
        p1.addMonomial(m3);
        p1.addMonomial(m9);

        p2.addMonomial(m5);
        p2.addMonomial(m6);
        p2.addMonomial(m7);
        p2.addMonomial(m8);*/




        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.println("Rezultatul adunarii este:" + Operations.addition(p1,p2));
        System.out.println("Rezultatul scaderii este:" + Operations.subtraction(p1,p2));
        System.out.println("Rezultatul inmultirii este: " + Operations.multiplication(p1,p2));
        System.out.println("Rezultatul derivarii este : " + Operations.derivation(p1));
        System.out.println("Rezultatul integrarii este: " + Operations.integration(p1));
        System.out.println("Rezultatul impartirii este: ");
        System.out.println(Operations.division(p1,p2));

    }
}
