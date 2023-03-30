package DataModels;

import java.util.*;

public class Polynomial {
    private TreeMap<Integer,Double> polynomial;

    public Polynomial(){
        this.polynomial = new TreeMap<Integer,Double>(Collections.reverseOrder());
    }

    public Polynomial(TreeMap<Integer, Double> polynomial) {
        this.polynomial = polynomial;
    }

    public TreeMap<Integer, Double> getPolynomial() {
        return polynomial;
    }

    public void setPolynomial(TreeMap<Integer, Double> polynomial) {
        this.polynomial = polynomial;
    }

    public void addMonomial(Monomial m) {
        this.polynomial.put((int) m.getPower(), (double) m.getCoefficient());
    }

    public static int degree(Polynomial p1){
        int degree = p1.firstNonZeroPower(p1);
        return degree;
    }

    public Double firstNonZeroCoefficient(Polynomial p) {
        Double entry = 0.0;
        for(Map.Entry<Integer, Double> e: p.getPolynomial().entrySet()) {
            Double coeficient = Double.valueOf(e.getValue());
            if (coeficient != 0) {
                entry = e.getValue();
                break;
            }
        }
        return entry;
    }

    public Integer firstNonZeroPower(Polynomial p) {
        Integer entry = 0;
        for(Map.Entry<Integer, Double> e: p.getPolynomial().entrySet()) {
            Double coeficient = e.getValue();
            Integer power = e.getKey();
            if (coeficient != 0) {
                entry = e.getKey();
                break;
            }
        }
        return entry;
    }
    public String toString(){
        String rezultat = "";
        for(Map.Entry<Integer, Double> entry: polynomial.entrySet()) {
            Map.Entry<Integer, Double> nextEntry = polynomial.higherEntry(entry.getKey());
            Double coeficient = Double.valueOf(entry.getValue());
            Integer putere = entry.getKey();
            if(coeficient == 0){
                rezultat += "+0";
                //rezultat += ;
                //continue;
            }else if(putere == 0){
                rezultat += coeficient;
            }else
                rezultat += coeficient + "*x^" + putere;
            if (entry.getKey() != polynomial.lastKey()) {
                if(nextEntry.getValue() > 0) {
                    rezultat += "+";
                }else if(nextEntry.getValue() < 0){
                    rezultat += "";
                }
            }
            if(entry.getKey() == polynomial.lastKey()){
                rezultat += "";
            }
        }
        return rezultat;
    }

    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Polynomial)){
            return false;
        }
        Polynomial poly = (Polynomial) o;
        return Objects.equals(this.toString(), poly.toString());
    }
}
