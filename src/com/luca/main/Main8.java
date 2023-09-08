package com.luca.main;

import com.luca.annotationTest.DaCorreggere;

import java.util.Arrays;
@DaCorreggere(descrizione = "Non stampa un cazzo")
public class Main8 {
    public static void main(String[] args) {

        /*
                ### Esercizio 8: Annotazioni
                #### Obiettivo:
                                Estrai e stampa tutte le annotazioni utilizzate in una classe personalizzata
                                 (userò la classe Date).
         */



        // non va Capitan Babbazzo
        // WHYYYYYY?????
        try {
            Class<?> aClass = Class.forName("java.util.Date");

            Arrays.stream(aClass.getAnnotations()).map(annotation -> annotation.annotationType().getName()).forEach(System.out::println);

            Arrays.stream(aClass.getAnnotations())
                    .flatMap(annotation -> Arrays.stream(annotation.annotationType().getAnnotations()))
                    .forEach(System.out::println);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
