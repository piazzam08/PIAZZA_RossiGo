package org.example;

import static java.lang.IO.println;

public class VeicoloNonDisponibileException extends RossiGoExeption {
    public VeicoloNonDisponibileException(String message) {

        super(message);
        println("Veicolo non disponibile");
    }
}
