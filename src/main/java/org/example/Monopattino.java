package org.example;

public class Monopattino extends  Veicolo{
     int velocitaMax;

    public Monopattino(String stato, double batteria, String codice, int velocitaMax) {
        super(stato, batteria, codice);
        this.velocitaMax = velocitaMax;
    }

    @Override
    public double consumoBatteriaPerMinuto() {
        return this.batteria - 2;
    }

    @Override
    public double calcolaCosto(int minuti) {
        return 0.25 * minuti;
    }
    public void Monopattino(){
        IO.println("attento modera la velocita ZTL");
    }
}
