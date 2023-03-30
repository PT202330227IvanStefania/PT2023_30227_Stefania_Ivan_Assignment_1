package DataModels;

public class Monomial {
    private Double coefficient;
    private Integer power;

    public Monomial(Double coefficient, Integer power) {
        this.coefficient = coefficient;
        this.power = power;

    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public static boolean equals(Monomial m1, Monomial m2) {
        return m1.coefficient == m2.coefficient && m1.power == m2.power;
    }

    public Monomial add(Monomial m1, Monomial m2) {
        if (m1.power != m2.power) {
            System.out.println("Can not add monomials!");
        }
        double coeficientR = m1.coefficient + m2.coefficient;
        Monomial sum = new Monomial(coeficientR, this.power);
        return sum;
    }
}

