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
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] tabuleiro = new int[8][8];

        int linha,coluna,repetido,acertos = 0,erros = 0,disparosRepetidos = 0,navios = 0;

        for (int i = 0; i < 8; i++) {
            for (int l = 0; l < 8; l++) {
                tabuleiro[i][l] = 0;
            }
        }

        for (int i = 0; i < 5; i++) {
            repetido = 1;

            while (repetido == 1) {
                System.out.println("Digite a linha do navio (0 a 7): ");
                linha = ler.nextInt();

                System.out.println("Digite a coluna do navio (0 a 7): ");
                coluna = ler.nextInt();

                if (linha >= 0 && linha < 8 && coluna >= 0 && coluna < 8) {

                    if (tabuleiro[linha][coluna] == 0) {
                        tabuleiro[linha][coluna] = 1;
                        repetido = 0;
                    } else {
                        System.out.println("Posição repetida. Digite outra posicao.");
                    }

                } else {
                    System.out.println("Posicao fora do tabuleiro.");
                }
            }
        }

        for (int i = 0; i < 15 && navios < 5; i++) {

            System.out.println("\nDisparo " + (i + 1));

            System.out.println("Digite a linha (0 a 7): ");
            linha = ler.nextInt();

            System.out.println("Digite a coluna (0 a 7): ");
            coluna = ler.nextInt();

            if (linha < 0 || linha >= 8 || coluna < 0 || coluna >= 8) {
                System.out.println("Posição fora do tabuleiro.");
                i--;
            } else if (tabuleiro[linha][coluna] == 2 || tabuleiro[linha][coluna] == 3) {
                System.out.println("Disparo repetido.");
                disparosRepetidos++;
            } else if (tabuleiro[linha][coluna] == 1) {
                System.out.println("Acerto!");
                tabuleiro[linha][coluna] = 2;
                acertos++;
                navios++;
            } else {
                System.out.println("Erro!");
                tabuleiro[linha][coluna] = 3;
                erros++;
            }
        }

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.println("Disparos repetidos: " +disparosRepetidos);

        if (navios == 5) {
            System.out.println("Todos os navios foram destruidos!");
        } else {
            System.out.println("Ainda existem navios no tabuleiro.");
        }

    }
}