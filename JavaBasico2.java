package com.opencampus;

public class PrecioConIVA {
    public static void main(String[] args) {

        double precio = 15;
        double totalApagar = total(precio);
        System.out.println(totalApagar);
    }
    public static double total (double precio){
        return precio+(0.21*precio);
    }
}
