package com.luca.main;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main8V1 {
    public static void main(String[] args) {

        try {
            Class<?> aClass = Class.forName("java.util.Date");

            // Arrays.stream(aClass.getDeclaredFields()).map(field -> Arrays.stream(field.getAnnotations())).forEach(System.out::println);
            // usare flatMap quando cicli 2: tua madre e tua cugina

            System.out.println("Proprietà: ");
            Arrays.stream(aClass.getDeclaredFields())
                    .flatMap(field -> Arrays.stream(field.getAnnotations()))
                    .forEach(System.out::println);

            System.out.println("Costruttori: ");
            Arrays.stream(aClass.getDeclaredConstructors())
                    .flatMap(constructor -> Arrays.stream(constructor.getAnnotations()))
                    .forEach(System.out::println);

            System.out.println("Metodi: ");
            Arrays.stream(aClass.getDeclaredMethods())
                    .flatMap(method -> Arrays.stream(method.getAnnotations()))
                    .forEach(System.out::println);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
