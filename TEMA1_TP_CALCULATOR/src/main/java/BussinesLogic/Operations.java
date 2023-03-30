package BussinesLogic;

import DataModels.Monomial;
import DataModels.Polynomial;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Operations {

    public static Polynomial addition(Polynomial p1, Polynomial p2){
        Polynomial result = new Polynomial(p2.getPolynomial());
        TreeMap<Integer,Double > auxiliar = new TreeMap<>(p2.getPolynomial());

        for(Entry<Integer, Double> entry : p1.getPolynomial().entrySet()) {
            Integer power1 = entry.getKey();
            Double coefficient1 = entry.getValue();

            if (result.getPolynomial().containsKey(power1)) {
                Double suma = coefficient1 + result.getPolynomial().get(power1); //get(putere) ia coeficientul din p2 asociat puterii date ca parametru
                result.addMonomial(new Monomial(suma, power1));

            } else {
                result.addMonomial(new Monomial(coefficient1, power1));
            }
        }
        for(Entry<Integer,Double> entry : p2.getPolynomial().entrySet()){
            Integer power = entry.getKey();
            Double coefficient = entry.getValue();
            result.addMonomial(new Monomial(coefficient,power));
        }
        p2.setPolynomial(auxiliar);

        return result;
    }

    public static Polynomial subtraction(Polynomial p1, Polynomial p2){
        Polynomial result = new Polynomial(p2.getPolynomial());
        TreeMap<Integer,Double > auxiliar = new TreeMap<>(p2.getPolynomial());

        for(Map.Entry<Integer,Double> entry1 : result.getPolynomial().entrySet()){
            Double nCoeficient = entry1.getValue() * (-1);
            entry1.setValue(nCoeficient);
        }

        for(Map.Entry<Integer, Double> entry : p1.getPolynomial().entrySet()) {
            Integer power1 = entry.getKey();
            Double coefficient1 = entry.getValue();

            if (p2.getPolynomial().containsKey(power1)) {
                Double difference = coefficient1 + p2.getPolynomial().get(power1);
                result.addMonomial(new Monomial(difference, power1));
            } else {
                result.addMonomial(new Monomial(coefficient1, power1));
            }
        }
        for(Map.Entry<Integer,Double> entry : p2.getPolynomial().entrySet()){
            Integer power = entry.getKey();
            Double coefficient = entry.getValue();
            result.addMonomial(new Monomial(coefficient,power));
        }
        p2.setPolynomial(auxiliar);

        return result;
    }

    public static Polynomial multiplication(Polynomial p1, Polynomial p2){
        Polynomial result = new Polynomial();
        TreeMap<Integer,Double > auxiliar = new TreeMap<>(p2.getPolynomial());
        for(Map.Entry<Integer,Double> entry1 : p1.getPolynomial().entrySet()){
            Polynomial intermediateResult = new Polynomial();
            for(Map.Entry<Integer,Double> entry2 : p2.getPolynomial().entrySet()){
                Integer power = entry1.getKey() + entry2.getKey();
                Double coefficient = entry1.getValue() * entry2.getValue();
                intermediateResult.addMonomial(new Monomial(coefficient,power));
            }
            result = addition(result,intermediateResult);

        }
        p2.setPolynomial(auxiliar);
        return result;
    }

    public static Polynomial derivation(Polynomial p1){
        Polynomial result = new Polynomial();
        for(Map.Entry<Integer,Double> entry : p1.getPolynomial().entrySet()){
            Double coefficient = entry.getValue() * entry.getKey();
            Integer power = (entry.getKey() - 1);
            if(power >= 0) {
                result.addMonomial(new Monomial(coefficient, power));
            }
        }
        return result;
    }

    public static Polynomial integration(Polynomial p1) {
        Polynomial result = new Polynomial();
        for (Map.Entry<Integer, Double> entry : p1.getPolynomial().entrySet()) {
            Double coefficient = entry.getValue() * 1 / (entry.getKey() + 1);
            Integer power = entry.getKey() + 1;
            result.addMonomial(new Monomial(coefficient, power));
        }
        return result;
    }

    public static Polynomial[] division(Polynomial p1, Polynomial p2){
        Polynomial q = new Polynomial();
        Polynomial r = new Polynomial(p1.getPolynomial());
        Polynomial t = new Polynomial();

        Polynomial [] ans = new Polynomial[2];

        if(Polynomial.degree(p1) > Polynomial.degree(p2)){
            while (r.getPolynomial().size() != 0 && Polynomial.degree(r) >= Polynomial.degree(p2)) {
                t = new Polynomial();
                Double coeficient = r.firstNonZeroCoefficient(r)/p2.firstNonZeroCoefficient(p2);
                Integer putere = r.firstNonZeroPower(r) - p2.firstNonZeroPower(p2);

                t.addMonomial(new Monomial(coeficient, putere));
                q = addition(q, t);
                r = subtraction(r, multiplication(t, p2));
            }
        }else {
            throw new RuntimeException("Division can not be performed!");
        }
        ans[0] = q;
        ans[1] = r;

        System.out.println("Quotient:" + ans[0]);
        System.out.println("Remainder:" + ans[1]);
        return ans;
    }

}

