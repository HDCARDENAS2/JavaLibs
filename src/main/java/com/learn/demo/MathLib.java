package com.learn.demo;

public class MathLib {

    public static void main(String[] args) {
        // Ejemplo de uso de Math.abs
        int valorNegativo = -10;
        int valorPositivo = Math.abs(valorNegativo);
        System.out.println("abs(" + valorNegativo + ") = " + valorPositivo);

        // Ejemplo de uso de Math.max y Math.min
        double a = 5.5, b = 10.2;
        System.out.println("max(" + a + ", " + b + ") = " + Math.max(a, b));
        System.out.println("min(" + a + ", " + b + ") = " + Math.min(a, b));

        // Ejemplo de potencia y raíz cuadrada
        double base = 2.0, exponente = 3.0;
        System.out.println(base + "^" + exponente + " = " + Math.pow(base, exponente));
        double numero = 16.0;
        System.out.println("sqrt(" + numero + ") = " + Math.sqrt(numero));

        // Ejemplo de funciones trigonométricas (en radianes)
        double grados = 45;
        double radianes = Math.toRadians(grados);
        System.out.println("sin(" + grados + "°) = " + Math.sin(radianes));
        System.out.println("cos(" + grados + "°) = " + Math.cos(radianes));
        System.out.println("tan(" + grados + "°) = " + Math.tan(radianes));

        // Ejemplo de redondeo
        double valor = 2.7;
        System.out.println("round(" + valor + ") = " + Math.round(valor));
        System.out.println("floor(" + valor + ") = " + Math.floor(valor));
        System.out.println("ceil(" + valor + ") = " + Math.ceil(valor));

        // Ejemplo de número aleatorio entre 0 y 1
        double aleatorio = Math.random();
        System.out.println("random() = " + aleatorio);

        // Ejemplo de número aleatorio en rango (1 - 100)
        int min = 1, max = 100;
        int aleatorioRango = min + (int) (Math.random() * (max - min + 1));
        System.out.println("Random entre " + min + " y " + max + " = " + aleatorioRango);
    }
}
