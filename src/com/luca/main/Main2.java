package com.luca.main;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main2 {
    public static void main(String[] args) {

        /*
        ### Esercizio 2: Lista di Metodi
        #### Obiettivo:
                        Estrai e stampa tutti i metodi pubblici della classe `String`
         */


        try {
            Class<?> aClass = Class.forName("java.lang.String");

            Method[] methods = aClass.getMethods();

            for(Method method : methods) {
                if(method.getModifiers() == Modifier.PUBLIC) {
                    System.out.println(method.getName() + " " + method.getModifiers());
                }
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
