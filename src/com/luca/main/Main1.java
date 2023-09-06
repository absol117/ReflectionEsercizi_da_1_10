package com.luca.main;

public class Main1 {
    public static void main(String[] args) {


        /*
        ### Esercizio 1: Nome della Classe
        #### Obiettivo:
                        Ottieni e stampa il nome completo della classe di un oggetto dato.
         */


        try {
            Class<?> aClass = Class.forName("com.luca.main.Main1");

            Class<?> aClass1 = Class.forName("java.util.ArrayList");


            System.out.println(aClass.getName());
            System.out.println(aClass1);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
