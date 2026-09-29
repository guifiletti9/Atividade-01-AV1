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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int[][] rotacionada = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < 5; l++) {
                System.out.println("Digite o valor:");
                matriz[i][l] = ler.nextInt();
            }
        }
         for (int i = 0; i < 5; i++) {
            for (int l = 0; l < 5; l++) {
                rotacionada[l][4 - i] = matriz[i][l];
            }
        }
         
System.out.println("\nMatriz original:");

        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(matriz[i][l] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatriz rotacionada:");

        for (int i = 0; i < 5; i++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(rotacionada[i][l] + " ");
            }
            System.out.println();
        }
    }
}

