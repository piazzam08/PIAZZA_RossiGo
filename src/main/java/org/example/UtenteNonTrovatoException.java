package org.example;

import static java.lang.IO.println;

public class UtenteNonTrovatoException extends RossiGoExeption {
    public UtenteNonTrovatoException(String message) {
        super(message);
        println("Utente non trovato");
    }
}
