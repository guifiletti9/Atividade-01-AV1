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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        int numeros = 1,linhas = 1,colunas = 1,diagonais = 1;

        int somaMagica = 0,somaLinha,somaColuna,somaPrincipal = 0,somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                System.out.println("Digite o valor: ");
                matriz[i][l] = ler.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {

                if (matriz[i][l] < 1 || matriz[i][l] > 9) {
                    numeros = 0;
                }

                for (int x = l + 1; x < 3; x++) {
                    if (matriz[i][l] == matriz[i][x]) {
                        numeros = 0;
                    }
                }

                for (int x = i + 1; x < 3; x++) {
                    if (matriz[i][l] == matriz[x][l]) {
                        numeros = 0;
                    }
                }
            }
        }

        for (int l = 0; l < 3; l++) {
            somaMagica = somaMagica + matriz[0][l];
        }

        for (int i = 0; i < 3; i++) {
            somaLinha = 0;

            for (int l = 0; l < 3; l++) {
                somaLinha = somaLinha + matriz[i][l];
            }

            if (somaLinha != somaMagica) {
                linhas = 0;
            }
        }

        for (int l = 0; l < 3; l++) {
            somaColuna = 0;

            for (int i = 0; i < 3; i++) {
                somaColuna = somaColuna + matriz[i][l];
            }

            if (somaColuna != somaMagica) {
                colunas = 0;
            }
        }

        for (int i = 0; i < 3; i++) {
            somaPrincipal = somaPrincipal + matriz[i][i];
            somaSecundaria = somaSecundaria + matriz[i][2 - i];
        }

        if (somaPrincipal != somaSecundaria) {
            diagonais = 0;
        }

        System.out.println("\nMatriz:");

        for (int i = 0; i < 3; i++) {
            for (int l = 0; l < 3; l++) {
                System.out.print(matriz[i][l] + " ");
            }
            System.out.println();
        }

        if (numeros == 1 && linhas == 1 && colunas == 1 && diagonais == 1) {
            System.out.println("\nA matriz é mágica.");
        } else {
            System.out.println("\nA matriz não é mágica.");

            if (numeros == 0) {
                System.out.println("Não contém os números de 1 a 9 sem repetição.");
            }

            if (linhas == 0) {
                System.out.println("As linhas não possuem a mesma soma.");
            }

            if (colunas == 0) {
                System.out.println("As colunas não possuem a mesma soma.");
            }

            if (diagonais == 0) {
                System.out.println("As diagonais não possuem a mesma soma.");
            }
        }
    }
}