package com.luca.main;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        /*
            ### Esercizio 3: Lista di Costruttori
            #### Obiettivo:
                            Elenca e stampa tutti i costruttori pubblici della classe `ArrayList`
         */


        try {
            Class<?> aClass = Class.forName("java.util.ArrayList");

            Arrays.stream(aClass.getConstructors())
                    .filter(constructor -> constructor.getModifiers() == Modifier.PUBLIC)
                    .forEach(System.out::println);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
