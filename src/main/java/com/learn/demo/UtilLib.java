package com.learn.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class UtilLib {

    public static void main(String[] args) {

        // Ejemplo básico de ArrayList
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        System.out.println("Frutas: " + frutas);

        // Ejemplo básico de HashMap

        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 20);
        System.out.println("Edades: " + edades);

        // Ejemplo básico de HashSet

        Set<String> paises = new HashSet<>();
        paises.add("España");
        paises.add("Francia");
        paises.add("España"); // duplicado
        System.out.println("Países (sin duplicados): " + paises);

        // Ejemplo de Optional

        Optional<String> opt = Optional.ofNullable(null);
        System.out.println("Valor o por defecto: " + opt.orElse("Valor por defecto"));

        // Ejemplo de Collections.sort con Arrays.asList

        List<Integer> numeros = Arrays.asList(5, 3, 1, 4, 2);
        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);

    }

}
