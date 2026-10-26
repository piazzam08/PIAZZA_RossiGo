package org.example;

import static java.lang.IO.println;

public class CodiceFiscaleNonValidoException extends RuntimeException {
    public CodiceFiscaleNonValidoException(String message) {

        super(message);
        println("Codice Fisacle non valido");
    }
}
