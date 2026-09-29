/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.trabalho;

/**
 *
 * @author fef
 */
import java.util.Scanner;
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        

        int[] vetor = new int[15];
        int[] distintos = new int[15];

        int quantidade = 0, encontrou;

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o numero: ");
            vetor[i] = ler.nextInt();
        }

        for (int i = 0; i < 15; i++) {

            encontrou = 0;

            for (int j = 0; j < quantidade; j++) {
                if (vetor[i] == distintos[j]) {
                    encontrou = 1;
                }
            }

            if (encontrou == 0) {
                distintos[quantidade] = vetor[i];
                quantidade++;
            }
        }

        System.out.println("\nValores distintos:");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(distintos[i] + " ");
        }

        System.out.println("\nQuantidade de valores diferentes:" +quantidade);

    }
}
