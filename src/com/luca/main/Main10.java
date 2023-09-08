package com.luca.main;

import com.luca.annotationTest.DaCorreggere;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
@DaCorreggere(descrizione = "questa bho, è proprio ridicola")
public class Main10 {
    public static void main(String[] args) {

        /*
                ### Esercizio 10: Tipo di Ritorno dei Metodi
                #### Obiettivo:
                                Elenca e stampa i tipi di ritorno di tutti i metodi pubblici della classe `Math`.
         */


        try {
            Class<?> aClass = Class.forName("java.lang.Math");

            Arrays.stream(aClass.getMethods())
                    .filter(method -> method.getModifiers() == Modifier.PUBLIC)
                    .map(Method::getReturnType)
                    .forEach(System.out::println);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        //Chat GPT (va, il mio no)

        // Ottieni la classe Math
        Class<?> mathClass = Math.class;

        // Ottieni tutti i metodi pubblici della classe Math
        Method[] methods = mathClass.getMethods();

        // Itera attraverso i metodi e stampa i tipi di ritorno
        System.out.println("Tipi di ritorno dei metodi pubblici nella classe Math:");
        for (Method method : methods) {
            Class<?> returnType = method.getReturnType();
            System.out.println(method.getName() + ": " + returnType.getSimpleName());
        }


    }
}
