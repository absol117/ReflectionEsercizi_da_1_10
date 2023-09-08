package com.luca.main;

import com.luca.annotationTest.DaCorreggere;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main7V1 {
    public static void main(String[] args) {


        /*
            ### Esercizio 7: Esecuzione di Costruttori
            #### Obiettivo:
                            Utilizza la reflection per creare una nuova istanza della classe `Date`
                            utilizzando uno dei suoi costruttori.
         */


        try {
            Class<?> aClass = Class.forName("java.util.Date");

            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, int.class, int.class);

            @DaCorreggere(descrizione = "stesso probleam dell es 7")
            Object o = declaredConstructor.newInstance(1998, 12, 10);
            Date date = (Date) o;

            System.out.println("Data : " + date);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }


    }
}
