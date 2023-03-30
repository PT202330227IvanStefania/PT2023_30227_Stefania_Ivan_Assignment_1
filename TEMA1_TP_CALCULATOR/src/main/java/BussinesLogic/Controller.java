package BussinesLogic;

import DataModels.Monomial;
import DataModels.Polynomial;
import GraphicalUserInterface.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
    private View calculatorView;

    public Controller(View calculatorView) {
        this.calculatorView = calculatorView;
        this.calculatorView.addAddition(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)[a-z]\\^(\\d*)", Pattern.CASE_INSENSITIVE);
                Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)[a-z]\\^(\\d*)", Pattern.CASE_INSENSITIVE);
                Polynomial p1 = new Polynomial();
                Polynomial p2 = new Polynomial();
                try {
                    String userInput1 = calculatorView.getP1Input();
                    Matcher matcher1 = pattern.matcher(userInput1);
                    String userInput2 = calculatorView.getP2Input();
                    Matcher matcher2 = pattern.matcher(userInput2);
                    while (matcher1.find()) {
                        Double coeficient = Double.valueOf(matcher1.group(1));
                        Integer putere = Integer.valueOf(matcher1.group(2));
                        p1.addMonomial(new Monomial(coeficient, putere));
                    }
                    while (matcher2.find()) {
                        Double coeficient = Double.valueOf(matcher2.group(1));
                        Integer putere = Integer.valueOf(matcher2.group(2));
                        p2.addMonomial(new Monomial(coeficient, putere));
                    }
                    String result = String.valueOf(Operations.addition(p1, p2));
                    calculatorView.updateResultLabel(result);
                } catch(Exception ex){
                    calculatorView.showNumberError("Bad Input!");
                }
            }
        });

        this.calculatorView.addSubtraction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)[a-z]\\^(\\d*)", Pattern.CASE_INSENSITIVE);
                Polynomial p1 = new Polynomial();
                Polynomial p2 = new Polynomial();
                try {
                    String userInput1 = calculatorView.getP1Input();
                    Matcher matcher1 = pattern.matcher(userInput1);
                    String userInput2 = calculatorView.getP2Input();
                    Matcher matcher2 = pattern.matcher(userInput2);
                    while (matcher1.find()) {
                        Double coeficient = Double.valueOf(matcher1.group(1));
                        Integer putere = Integer.valueOf(matcher1.group(2));
                        p1.addMonomial(new Monomial(coeficient, putere));
                    }
                    while (matcher2.find()) {
                        Double coeficient = Double.valueOf(matcher2.group(1));
                        Integer putere = Integer.valueOf(matcher2.group(2));
                        p2.addMonomial(new Monomial(coeficient, putere));
                    }
                    String result = String.valueOf(Operations.subtraction(p1, p2));
                    calculatorView.updateResultLabel(result);
                } catch(Exception ex){
                    calculatorView.showNumberError("Bad Input!");
                }
            }
        });

        this.calculatorView.addMultiplication(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)[a-z]\\^(\\d*)", Pattern.CASE_INSENSITIVE);
                Polynomial p1 = new Polynomial();
                Polynomial p2 = new Polynomial();
                try {
                    String userInput1 = calculatorView.getP1Input();
                    Matcher matcher1 = pattern.matcher(userInput1);
                    String userInput2 = calculatorView.getP2Input();
                    Matcher matcher2 = pattern.matcher(userInput2);
                    while (matcher1.find()) {
                        Double coeficient = Double.valueOf(matcher1.group(1));
                        Integer putere = Integer.valueOf(matcher1.group(2));
                        p1.addMonomial(new Monomial(coeficient, putere));
                    }
                    while (matcher2.find()) {
                        Double coeficient = Double.valueOf(matcher2.group(1));
                        Integer putere = Integer.valueOf(matcher2.group(2));
                        p2.addMonomial(new Monomial(coeficient, putere));
                    }
                    String result = String.valueOf(Operations.multiplication(p1, p2));
                    calculatorView.updateResultLabel(result);
                }catch(Exception ex){
                    calculatorView.showNumberError("Bad Input!");
                }
            }

        });

        this.calculatorView.addDivision(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)[a-z]\\^(\\d*)", Pattern.CASE_INSENSITIVE);
                Polynomial p1 = new Polynomial();
                Polynomial p2 = new Polynomial();
                try {
                    String userInput1 = calculatorView.getP1Input();
                    Matcher matcher1 = pattern.matcher(userInput1);
                    String userInput2 = calculatorView.getP2Input();
                    Matcher matcher2 = pattern.matcher(userInput2);
                    while (matcher1.find()) {
                        Double coeficient = Double.valueOf(matcher1.group(1));
                        Integer putere = Integer.valueOf(matcher1.group(2));
                        p1.addMonomial(new Monomial(coeficient, putere));
                    }
                    while (matcher2.find()) {
                        Double coeficient = Double.valueOf(matcher2.group(1));
                        Integer putere = Integer.valueOf(matcher2.group(2));
                        p2.addMonomial(new Monomial(coeficient, putere));
                    }
                    String quotient = String.valueOf(Operations.division(p1, p2)[0]);
                    calculatorView.updateQuotientLabel(quotient);
                    String remainder = String.valueOf(Operations.division(p1, p2)[1]);
                    calculatorView.updateRemainderLabel(remainder);
                } catch (Exception ex){
                    calculatorView.showNumberError("Bad input!");
                }
            }

        });

        this.calculatorView.addDerivation(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)[a-z]\\^(\\d*)", Pattern.CASE_INSENSITIVE);
                Polynomial p1 = new Polynomial();
                Polynomial p2 = new Polynomial();
                try{
                String userInput1 = calculatorView.getP1Input();
                Matcher matcher1 = pattern.matcher(userInput1);
                while (matcher1.find()) {
                    Double coeficient = Double.valueOf(matcher1.group(1));
                    Integer putere = Integer.valueOf(matcher1.group(2));
                    p1.addMonomial(new Monomial(coeficient, putere));
                }
                String userInput2 = calculatorView.getP2Input();
                Matcher matcher2 = pattern.matcher(userInput2);
                while (matcher2.find()) {
                    Double coeficient = Double.valueOf(matcher2.group(1));
                    Integer putere = Integer.valueOf(matcher2.group(2));
                    p2.addMonomial(new Monomial(coeficient, putere));
                }
                if (calculatorView.getC1State()) {
                    String result = String.valueOf(Operations.derivation(p1));
                    calculatorView.updateResultLabel(result);
                    //String result = String.valueOf(Operations.derivare(p1));
                } else if (calculatorView.getC2State()) {
                    String result = String.valueOf(Operations.derivation(p2));
                    calculatorView.updateResultLabel(result);
                }
                } catch (Exception ex){
                    calculatorView.showNumberError("Bad Input!");
                }
            }
        });

        this.calculatorView.addIntegration(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)[a-z]\\^(\\d*)", Pattern.CASE_INSENSITIVE);
                Polynomial p1 = new Polynomial();
                Polynomial p2 = new Polynomial();
                try {
                    String userInput1 = calculatorView.getP1Input();
                    Matcher matcher1 = pattern.matcher(userInput1);
                    while (matcher1.find()) {
                        Double coeficient = Double.valueOf(matcher1.group(1));
                        Integer putere = Integer.valueOf(matcher1.group(2));
                        p1.addMonomial(new Monomial(coeficient, putere));
                    }
                    String userInput2 = calculatorView.getP2Input();
                    Matcher matcher2 = pattern.matcher(userInput2);
                    while (matcher2.find()) {
                        Double coeficient = Double.valueOf(matcher2.group(1));
                        Integer putere = Integer.valueOf(matcher2.group(2));
                        p2.addMonomial(new Monomial(coeficient, putere));
                    }
                    if (calculatorView.getC1State()) {
                        String result = String.valueOf(Operations.integration(p1));
                        calculatorView.updateResultLabel(result);
                    } else if (calculatorView.getC2State()) {
                        String result = String.valueOf(Operations.integration(p2));
                        calculatorView.updateResultLabel(result);
                    }
                } catch (Exception ex) {
                    calculatorView.showNumberError("Bad Input!");
                }
            }
        });

        this.calculatorView.addReset(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorView.updateP1Label("");
                calculatorView.updateP2Label("");
                calculatorView.updateResultLabel("");
                calculatorView.updateQuotientLabel("");
                calculatorView.updateRemainderLabel("");
            }
        });

    }


}


