package com.luca.main;

import com.scai.model.ClasseTestEs6;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main6 {
    public static void main(String[] args) throws IllegalAccessException {

        /*
                ### Esercizio 6: Modifica del Campo Privato
                #### Obiettivo:
                               Utilizza la reflection per modificare un campo privato in una classe personalizzata

         */


        ClasseTestEs6 classeTestEs6 = new ClasseTestEs6(1,"content vuoto");

        System.out.println("Prima : \n" + classeTestEs6);

        Class<? extends ClasseTestEs6> aClass = classeTestEs6.getClass();
        try {
            Field fieldId = aClass.getDeclaredField("id");

            fieldId.setAccessible(true);

            fieldId.setInt(classeTestEs6, 98675321);

            System.out.println("Dopo : \n" + classeTestEs6);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }


    }
}
