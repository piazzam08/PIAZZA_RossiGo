package org.example;

import static java.lang.IO.println;

public class Bici extends Veicolo{
    private int numeroMaricie;

    public Bici(String stato, double batteria, String codice, int numeroMaricie) {
        super(stato, batteria, codice);
        this.numeroMaricie = numeroMaricie;
    }

    @Override
    public double calcolaCosto(int minuti) {

        return  0.15 * minuti;
    }

    @Override
    public double consumoBatteriaPerMinuto() {
        return this.batteria ;
    }
    public int  getNumeroMarcie(){
        return this.numeroMaricie;
    }
}
