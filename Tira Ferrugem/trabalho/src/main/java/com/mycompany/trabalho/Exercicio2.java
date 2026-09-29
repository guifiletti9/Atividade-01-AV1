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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        int somaPrincipal = 0, somaSecundaria = 0;

        for (int i = 0; i < 4; i++) {
            for (int l = 0; l < 4; l++) {
                System.out.println("Digite o valor: ");
                matriz[i][l] = ler.nextInt();
            }
        }

        System.out.println("\nDiagonal principal:");

        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrincipal = somaPrincipal + matriz[i][i];
        }

        System.out.println("\n\nDiagonal secundaria:");

        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");
            somaSecundaria = somaSecundaria + matriz[i][3 - i];
        }

        System.out.println("\n\nSoma da diagonal principal: " +somaPrincipal);
        System.out.println("Soma da diagonal secundaria: " +somaSecundaria);

        if (somaPrincipal > somaSecundaria) {
            System.out.println("A diagonal principal possui a maior soma.");
        } else if (somaSecundaria > somaPrincipal) {
            System.out.println("A diagonal secundaria possui a maior soma.");
        } else {
            System.out.println("As duas somas sao iguais.");
        }
        
    }
    
}
