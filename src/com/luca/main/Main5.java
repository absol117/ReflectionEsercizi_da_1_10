package com.luca.main;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main5 {
    public static void main(String[] args) {

        /*
                ### Esercizio 5: Invocazione Dinamica di Metodi
                #### Obiettivo:
                                  Crea un oggetto di tipo `String` e utilizza la reflection per chiamare il suo metodo `length`.
         */


        String ris = "suka";
        Class<? extends String> aClass = ris.getClass();

        try {
            Method length = aClass.getMethod("length");
            Object invoke = length.invoke(ris);
            int lInv = (int) invoke;
            System.out.println("lunghezza stringa tramite reflection: " + lInv);


        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
