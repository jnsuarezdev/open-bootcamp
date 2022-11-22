package com.opencampus;

public class Concatenar {
    public static void main(String[] args) {


        String[] nombres = {"Mario", "Juan", "David", "Andrés"};
        String concatenar = nombres[0];
        for (int i = 1; i < nombres.length; i++) {
            concatenar = concatenar + nombres[i];
        }
        System.out.println(concatenar);
    }
}
