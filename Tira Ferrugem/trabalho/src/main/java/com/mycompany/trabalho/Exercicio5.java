/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabalho;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[20];
        int[] original = new int[20];

        int trocas = 0,comparacoes = 0, aux;
        double mediana;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite o valor: ");
            vetor[i] = ler.nextInt();
            original[i] = vetor[i];
        }

        for (int i = 0; i < 19; i++) {
            for (int l = 0; l < 19 - i; l++) {
                comparacoes++;

                if (vetor[l] > vetor[l + 1]) {
                    aux = vetor[l];
                    vetor[l] = vetor[l + 1];
                    vetor[l + 1] = aux;

                    trocas++;
                }
            }
        }

        mediana = (vetor[9] + vetor[10]) / 2.0;

        System.out.println("\nVetor original:");

        for (int i = 0; i < 20; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println("\n\nVetor ordenado:");

        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\nQuantidade de trocas: " +trocas);
        System.out.println("Quantidade de comparacoes: " +comparacoes);
        System.out.println("Mediana: " +mediana);
    }
    
}
