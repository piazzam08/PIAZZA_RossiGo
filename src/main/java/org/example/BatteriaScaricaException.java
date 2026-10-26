package org.example;

import static java.lang.IO.println;

public class BatteriaScaricaException extends RossiGoExeption {
    public BatteriaScaricaException(String message) {

        super(message);
        println("Batteria quasi scarica");
    }
}
