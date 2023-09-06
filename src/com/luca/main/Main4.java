package com.luca.main;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {


        /*
            ### Esercizio 4: Lista di Campi
            #### Obiettivo:
                            Estrai e stampa tutti i campi pubblici della classe `System`.

     */


        try {
            Class<?> aClass = Class.forName("java.lang.System");




            Arrays.stream(aClass.getFields())
                    .filter(field -> field.getModifiers() == Modifier.PUBLIC)
                    .forEach(System.out::println);

            Arrays.stream(aClass.getConstructors())
                    .filter(constructor -> constructor.getModifiers() == Modifier.PUBLIC)
                    .forEach(System.out::println);

            Arrays.stream(aClass.getMethods())
                    .filter(method -> method.getModifiers() == Modifier.PUBLIC)
                    .forEach(System.out::println);

            System.out.println("-------------------------------------------------");

            Arrays.stream(aClass.getMethods()).map(method -> method.getName() + method.getModifiers()).forEach(System.out::println);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }




}
