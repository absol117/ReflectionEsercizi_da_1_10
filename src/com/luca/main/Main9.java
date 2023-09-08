package com.luca.main;

import com.luca.annotationTest.DaCorreggere;

import java.util.Arrays;
@DaCorreggere(descrizione = "serve una spiegazione")
public class Main9 {
    public static void main(String[] args) {

        /*
            ### Esercizio 9: Interfacce Implementate
            #### Obiettivo:
                            Estrai e stampa tutte le interfacce implementate dalla classe `HashSet`.
         */


        try {
            Class<?> aClass = Class.forName("java.util.HashSet");

            Arrays.stream(aClass.getInterfaces()).forEach(System.out::println);
            // Qua signor capitano serve una spiegazione sulle interfacce Serializable e Clonable

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
