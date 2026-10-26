package org.example;

import static java.lang.IO.println;

public class CreditoInsufficienteException extends RossiGoExeption {
    public CreditoInsufficienteException(String message) {
        super(message);
        println("Credito insufficente hai " );
    }
}
