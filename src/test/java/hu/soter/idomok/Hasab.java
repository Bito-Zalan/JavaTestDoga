package hu.soter.idomok;

import hu.szamalk.idomok.FaIdom;

public class Hasab extends FaIdom {
    private double a;
    private double b;
    private double m;
    public Hasab(double v, double v1, double v2) {
        super(getHasabTerfogat(),getHasabSuly());
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getM() {
        return m;
    }
}
