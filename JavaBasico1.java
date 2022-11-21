package com.opencampus;

public class JavaBasico1 {

    public static void main(String[] args) {

        //Tipos de dato entero
        byte variable1 = 3; // 1 byte, de -128 a 127
        System.out.println(variable1);

        short variable2 = 34; // 2 bytes, de -32768 a 32767
        System.out.println(variable2);

        int variable3 = 234; // 4 bytes, con tamanio 2*109
        System.out.println(variable3);

        long variable4= 5687; // 8 bytes, muy grande
        System.out.println(variable4);

        // Tipos decimales

        float variable5 = 3.144f; // Decimal simple, requiere una f sino lo interpreta como double
        System.out.println(variable5);

        double variable6= 4.582; // Decimal doble, se le puede poner una d o no.
        System.out.println(variable6);

        //Tipos booleanos

        boolean variable7 = true;
        System.out.println(variable7);

        //Tipos caracteres y cadenas de caracteres
        char variable8 = 'a'; // Requiere comillas simples
        String variable9 = "Esto es una cadena"; //Realmente es un objeto
