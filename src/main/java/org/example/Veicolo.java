package org.example;

public abstract class Veicolo {
     String codice;
     double batteria;
     String stato;

    public Veicolo(String stato, double batteria, String codice) {
        this.stato = stato;
        this.batteria = batteria;
        this.codice = codice;
    }

    public  abstract double  calcolaCosto(int minuti);
    public abstract double consumoBatteriaPerMinuto();
}
