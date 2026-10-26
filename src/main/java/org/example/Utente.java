package org.example;

import it.kamaladafrica.codicefiscale.CodiceFiscale;

public class Utente {
     String id;
     String email;
     String codiceFiscale;
     double credito;

    public Utente(String id, String email, String codiceFiscale, double credito) {
        this.id = id;
        this.email = email;
        this.codiceFiscale = codiceFiscale;
        this.credito = credito;
    }
}
