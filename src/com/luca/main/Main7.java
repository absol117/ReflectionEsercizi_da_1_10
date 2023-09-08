package com.luca.main;

import com.luca.annotationTest.DaCorreggere;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Date;
@DaCorreggere(descrizione = "ho un problema con le date", problema = "Non so usare i loro costruttori e non ho vogli di imparare da solo")
public class Main7 {
    public static void main(String[] args) {

        /*
            ### Esercizio 7: Esecuzione di Costruttori
            #### Obiettivo:
                            Utilizza la reflection per creare una nuova istanza della classe `Date`
                            utilizzando uno dei suoi costruttori.
         */


        try {
            Class<?> aClass = Class.forName("java.util.Date");
            Constructor<?> constructor = aClass.getConstructor();

            Date date = (Date) constructor.newInstance();

            System.out.println(date);





        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
