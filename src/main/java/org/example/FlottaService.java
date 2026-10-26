package org.example;

import java.util.List;

public class FlottaService {
      List<Veicolo> veicoli;
      List<Utente>  utenti;
     Noleggio noleggio;

    public FlottaService(List<Veicolo> veicoli, List<Utente> utenti, Noleggio noleggio) {
        this.veicoli = veicoli;
        this.utenti = utenti;
        this.noleggio = noleggio;
    }

}
