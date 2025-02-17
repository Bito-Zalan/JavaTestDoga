package hu.szamalk.idomok;

import java.util.ArrayList;

public class FaIdom implements Comparable<FaIdom>{
    private ArrayList<String> lista;
    private static double fajsuly;
    private static double gombTerfogat;
    private static double gombSuly;
    private static double hasabTerfogat;
    private static double hasabSuly;


    /*public FaIdom(double gombTerfogat, double gombSuly) {

    }*/

    public FaIdom(ArrayList<String> lista, double gombTerfogat, double gombSuly, double hasabTerfogat, double hasabSuly) {
        this.lista = lista;
        this.gombTerfogat = gombTerfogat;
        this.gombSuly = gombSuly;
        this.hasabTerfogat = hasabTerfogat;
        this.hasabSuly = hasabSuly;
    }



    public static double getFajsuly() {
        return fajsuly;
    }

    public static double getGombTerfogat() {
        return gombTerfogat;
    }

    public static double getGombSuly() {
        return gombSuly;
    }

    public static double getHasabTerfogat() {
        return hasabTerfogat;
    }

    public static double getHasabSuly() {
        return hasabSuly;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public static double terfogat(){

        return 0;
    }
    public static double suly(){
        return 0;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "lista=" + lista +
                ", gombTerfogat=" + gombTerfogat +
                ", gombSuly=" + gombSuly +
                ", hasabTerfogat=" + hasabTerfogat +
                ", hasabSuly=" + hasabSuly +
                '}';
    }

    @Override
    public int compareTo(FaIdom o) {
        return Integer.compare(FaIdom.get);
    }
}
