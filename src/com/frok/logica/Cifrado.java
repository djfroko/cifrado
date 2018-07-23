package com.frok.logica;

import java.util.Scanner;

public class Cifrado {


    private Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    private String palabra;
    private int codigo = 0;
    private int selector = 0;
    private char letra;

    public void iniciarApp() {

        introducirDatos();

        if (selector == 1) {
            cifrar();
        } else {
            descifrar();
        }

        mostrarResultado();
    }

    private void introducirDatos() {

        System.out.print("Escribe la palabra que quieras codificar :");
        palabra = sc.next();
        palabra = palabra.toUpperCase();
        do {
            System.out.println("introduce el codigo (del 2 al 25)");
            codigo = sc.nextInt();

        } while (codigo < 1 || codigo > 25);

        do {
            System.out.println("Que es lo que quieres hacer");
            System.out.println(" 1. CIFRAR");
            System.out.println(" 2. DESCIFRAR");
            selector = sc.nextInt();
        } while (selector < 1 || selector > 2);

    }

    private void cifrar() {

        for (int i = 0; i < palabra.length(); i++) {

            letra = palabra.charAt(i);
            letra+= codigo;
            System.out.println(letra);

        }
    }

    private void descifrar() {

        for (int i = 0; i < palabra.length(); i++) {

            letra = palabra.charAt(i);
            letra-= codigo;
            System.out.println(letra);
        }

        System.out.println();


    }

    private void mostrarResultado() {

        System.out.println("MUestro Resultado");

    }


}



