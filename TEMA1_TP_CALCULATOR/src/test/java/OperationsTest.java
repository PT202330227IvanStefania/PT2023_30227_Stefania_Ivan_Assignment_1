import BussinesLogic.Operations;
import DataModels.Monomial;
import DataModels.Polynomial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {
    @Test
    public void addTestAddition1(){
        Monomial m1 = new Monomial(1.0, 3);
        Monomial m2 = new Monomial(-2.0, 2);
        Monomial m3 = new Monomial(6.0,1);
        Monomial m6 = new Monomial(-5.0, 0);

        Monomial m4 = new Monomial(1.0,2);
        Monomial m5 = new Monomial(-1.0,0);

        Monomial m7 = new Monomial(1.0, 3);
        Monomial m8 = new Monomial(-1.0, 2);
        Monomial m9 = new Monomial(6.0, 1);
        Monomial m10 = new Monomial(-6.0, 0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);
        p1.addMonomial(m6);

        p2.addMonomial(m4);
        p2.addMonomial(m5);

        result.addMonomial(m7);
        result.addMonomial(m8);
        result.addMonomial(m9);
        result.addMonomial(m10);
        
        assertEquals(Operations.addition(p1,p2), result);
    }

    @Test
    public void addTestAddition2(){
        Monomial m1 = new Monomial(2.5, 6);
        Monomial m2 = new Monomial(3.5, 4);
        Monomial m3 = new Monomial(-2.0,0);

        Monomial m4 = new Monomial(-5.5,6);
        Monomial m5 = new Monomial(-4.1,3);
        Monomial m6 = new Monomial(-2.0,4);
        Monomial m11 = new Monomial(5.0,0);

        Monomial m7 = new Monomial(-3.0, 6);
        Monomial m8 = new Monomial(0.6, 4);
        Monomial m9 = new Monomial(-4.1, 3);
        Monomial m10 = new Monomial(5.0, 0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        p2.addMonomial(m4);
        p2.addMonomial(m5);
        p2.addMonomial(m6);
        p2.addMonomial(m11);

        result.addMonomial(m7);
        result.addMonomial(m8);
        result.addMonomial(m9);
        result.addMonomial(m10);

        assertEquals(Operations.addition(p1,p2), result);
    }

    @Test
    public void addTestSubtraction1(){
        Monomial m1 = new Monomial(5.0, 5);
        Monomial m2 = new Monomial(-0.5, 4);
        Monomial m3 = new Monomial(3.0,0);

        Monomial m6 = new Monomial(7.0,5);
        Monomial m7 = new Monomial(-6.0,4);
        Monomial m8 = new Monomial(-3.5,3);
        Monomial m9 = new Monomial(2.0,0);

        Monomial m11 = new Monomial(-2.0,5);
        Monomial m12 = new Monomial(5.5,4);
        Monomial m13 = new Monomial(3.5,3);
        Monomial m14 = new Monomial(1.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        p2.addMonomial(m6);
        p2.addMonomial(m7);
        p2.addMonomial(m8);
        p2.addMonomial(m9);

        result.addMonomial(m11);
        result.addMonomial(m12);
        result.addMonomial(m13);
        result.addMonomial(m14);

        assertEquals(Operations.subtraction(p1,p2), result);

    }

    @Test
    public void addTestSubtraction2(){
        Monomial m1 = new Monomial(5.0, 5);
        Monomial m2 = new Monomial(-0.5, 4);
        Monomial m3 = new Monomial(3.0,0);

        Monomial m6 = new Monomial(7.0,5);
        Monomial m7 = new Monomial(-6.0,4);
        Monomial m8 = new Monomial(-3.5,3);
        Monomial m9 = new Monomial(2.0,0);

        Monomial m11 = new Monomial(-2.0,5);
        Monomial m12 = new Monomial(5.5,4);
        Monomial m13 = new Monomial(-3.5,3);
        Monomial m14 = new Monomial(1.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        p2.addMonomial(m6);
        p2.addMonomial(m7);
        p2.addMonomial(m8);
        p2.addMonomial(m9);

        result.addMonomial(m11);
        result.addMonomial(m12);
        result.addMonomial(m13);
        result.addMonomial(m14);

        assertEquals(Operations.subtraction(p1,p2), result);
    }

    @Test
    public void addTestMultiply1(){
        Monomial m1 = new Monomial(3.0, 2);
        Monomial m2 = new Monomial(-1.0, 1);
        Monomial m3 = new Monomial(1.0, 0);

        Monomial m4 = new Monomial(1.0, 1);
        Monomial m5 = new Monomial(-2.0, 0);

        Monomial m6 = new Monomial(3.0,3);
        Monomial m7 = new Monomial(-7.0,2);
        Monomial m8 = new Monomial(3.0,1);
        Monomial m9 = new Monomial(-2.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        p2.addMonomial(m4);
        p2.addMonomial(m5);

        result.addMonomial(m6);
        result.addMonomial(m7);
        result.addMonomial(m8);
        result.addMonomial(m9);

        assertEquals(Operations.multiplication(p1,p2), result);
    }

    @Test
    public void addTestMultiply2(){
        Monomial m1 = new Monomial(3.0, 2);
        Monomial m2 = new Monomial(-1.0, 1);
        Monomial m3 = new Monomial(1.0, 0);

        Monomial m4 = new Monomial(1.0, 1);
        Monomial m5 = new Monomial(-2.0, 0);

        Monomial m6 = new Monomial(3.0,3);
        Monomial m7 = new Monomial(-8.0,2);
        Monomial m8 = new Monomial(3.0,4);
        Monomial m9 = new Monomial(-2.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        p2.addMonomial(m4);
        p2.addMonomial(m5);

        result.addMonomial(m6);
        result.addMonomial(m7);
        result.addMonomial(m8);
        result.addMonomial(m9);

        assertEquals(Operations.multiplication(p1,p2), result);
    }

    @Test
    public void addTestDerivation1(){
        Monomial m1 = new Monomial(1.0,3);
        Monomial m2 = new Monomial(-2.0,2);
        Monomial m3 = new Monomial(6.0,1);
        Monomial m4 = new Monomial(-5.0,0);

        Monomial m5 = new Monomial(3.0,2);
        Monomial m6 = new Monomial(-4.0,1);
        Monomial m7 = new Monomial(6.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);
        p1.addMonomial(m4);

        result.addMonomial(m5);
        result.addMonomial(m6);
        result.addMonomial(m7);

        assertEquals(Operations.derivation(p1), result);

    }

    @Test
    public void addTestDerivation2(){
        Monomial m1 = new Monomial(1.0,3);
        Monomial m2 = new Monomial(-2.0,2);
        Monomial m3 = new Monomial(6.0,1);
        Monomial m4 = new Monomial(-5.0,0);

        Monomial m5 = new Monomial(7.0,2);
        Monomial m6 = new Monomial(-4.0,3);
        Monomial m7 = new Monomial(6.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);
        p1.addMonomial(m4);

        result.addMonomial(m5);
        result.addMonomial(m6);
        result.addMonomial(m7);

        assertEquals(Operations.derivation(p1), result);

    }

    @Test
    public void addTestIntegration1(){
        Monomial m1 = new Monomial(1.0,3);
        Monomial m2 = new Monomial(4.0,2);
        Monomial m3 = new Monomial(5.0,0);

        Monomial m5 = new Monomial(0.25,4);
        Monomial m6 = new Monomial(4.0/3,3);
        Monomial m7 = new Monomial(5.0,1);

        Polynomial p1 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        result.addMonomial(m5);
        result.addMonomial(m6);
        result.addMonomial(m7);

        assertEquals(Operations.integration(p1), result);

    }

    @Test
    public void addTestIntegration2(){
        Monomial m1 = new Monomial(1.0,3);
        Monomial m2 = new Monomial(4.0,2);
        Monomial m3 = new Monomial(5.0,0);

        Monomial m5 = new Monomial(0.25,4);
        Monomial m6 = new Monomial(4.0,3);
        Monomial m7 = new Monomial(5.0,1);

        Polynomial p1 = new Polynomial();
        Polynomial result = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        result.addMonomial(m5);
        result.addMonomial(m6);
        result.addMonomial(m7);

        assertEquals(Operations.integration(p1), result);

    }

    @Test
    public void addTestDivison1(){
        Monomial m1 = new Monomial(1.0,3);
        Monomial m2 = new Monomial(-2.0,2);
        Monomial m3 = new Monomial(6.0,1);
        Monomial m4 = new Monomial(-5.0, 0);

        Monomial m5 = new Monomial(1.0,2);
        Monomial m6 = new Monomial(-1.0,0);

        Monomial m7 = new Monomial(1.0,1);
        Monomial m8 = new Monomial(-2.0,0);

        Monomial m9 = new Monomial(7.0,1);
        Monomial m10 = new Monomial(-7.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial quotient = new Polynomial();
        Polynomial remainder = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        p2.addMonomial(m5);
        p2.addMonomial(m6);

        quotient.addMonomial(m7);
        quotient.addMonomial(m8);

        remainder.addMonomial(m9);
        remainder.addMonomial(m10);

        assertEquals(Operations.division(p1,p2)[0], quotient);
        assertEquals(Operations.division(p1,p2)[1], remainder);

    }

    @Test
    public void addTestDivison2(){
        Monomial m1 = new Monomial(2.0,4);
        Monomial m2 = new Monomial(1.0,2);
        Monomial m3 = new Monomial(1.0,1);
        Monomial m4 = new Monomial(-3.0, 0);

        Monomial m5 = new Monomial(1.0,2);
        Monomial m6 = new Monomial(-4.0,1);

        Monomial m7 = new Monomial(2.0,2);
        Monomial m8 = new Monomial(8.0,1);
        Monomial m11 = new Monomial(33.0,0);

        Monomial m9 = new Monomial(133.0,1);
        Monomial m10 = new Monomial(-3.0,0);

        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial quotient = new Polynomial();
        Polynomial remainder = new Polynomial();

        p1.addMonomial(m1);
        p1.addMonomial(m2);
        p1.addMonomial(m3);

        p2.addMonomial(m5);
        p2.addMonomial(m6);

        quotient.addMonomial(m7);
        quotient.addMonomial(m8);
        quotient.addMonomial(m11);

        remainder.addMonomial(m9);
        remainder.addMonomial(m10);

        assertEquals(Operations.division(p1,p2)[0], quotient);
        assertEquals(Operations.division(p1,p2)[1], remainder);

    }
}
