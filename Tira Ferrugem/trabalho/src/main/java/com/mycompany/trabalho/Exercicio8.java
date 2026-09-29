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
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int[][] assentos = new int[10][12];

        int opcao,fileira,assento,quantidade,livres,ocupados,contador,encontrou;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Reservar um assento");
            System.out.println("2 - Cancelar uma reserva");
            System.out.println("3 - Exibir o mapa dos assentos");
            System.out.println("4 - Mostrar assentos livres e ocupados");
            System.out.println("5 - Encontrar uma sequência de assentos livres");
            System.out.println("6 - Encerrar");
            System.out.println("Digite uma opcao: ");
            opcao = ler.nextInt();

            if (opcao == 1) {

                System.out.println("Digite a fileira (0 a 9): ");
                fileira = ler.nextInt();

                System.out.println("Digite o assento (0 a 11): ");
                assento = ler.nextInt();

                if (fileira >= 0 && fileira < 10 && assento >= 0 && assento < 12) {

                    if (assentos[fileira][assento] == 0) {
                        assentos[fileira][assento] = 1;
                        System.out.println("Assento reservado com sucesso.");
                    } else {
                        System.out.println("Assento ja esta ocupado.");
                    }

                } else {
                    System.out.println("Assento fora do cinema.");
                }

            } else if (opcao == 2) {

                System.out.println("Digite a fileira (0 a 9): ");
                fileira = ler.nextInt();

                System.out.println("Digite o assento (0 a 11): ");
                assento = ler.nextInt();

                if (fileira >= 0 && fileira < 10 && assento >= 0 && assento < 12) {

                    if (assentos[fileira][assento] == 1) {
                        assentos[fileira][assento] = 0;
                        System.out.println("Reserva cancelada com sucesso.");
                    } else {
                        System.out.println("Esse assento ja esta livre.");
                    }

                } else {
                    System.out.println("Assento fora do cinema.");
                }

            } else if (opcao == 3) {

                System.out.println("\n--- MAPA DOS ASSENTOS ---");

                for (int i = 0; i < 10; i++) {
                    System.out.print("Fileira " + i + ": ");

                    for (int l = 0; l < 12; l++) {
                        System.out.print(assentos[i][l] + " ");
                    }

                    System.out.println();
                }

            } else if (opcao == 4) {

                livres = 0;
                ocupados = 0;

                for (int i = 0; i < 10; i++) {
                    for (int l = 0; l < 12; l++) {

                        if (assentos[i][l] == 0) {
                            livres++;
                        } else {
                            ocupados++;
                        }
                    }
                }

                System.out.println("Assentos livres: " + livres);
                System.out.println("Assentos ocupados: " + ocupados);

            } else if (opcao == 5) {

                System.out.println("Digite a quantidade de pessoas: ");
                quantidade = ler.nextInt();

                encontrou = 0;

                for (int i = 0; i < 10; i++) {

                    contador = 0;

                    for (int l = 0; l < 12; l++) {

                        if (assentos[i][l] == 0) {
                            contador++;
                        } else {
                            contador = 0;
                        }

                        if (contador == quantidade && encontrou == 0) {

                            System.out.println("Sequencia encontrada na fileira " + i);
                            System.out.print("Assentos: ");

                            for (int x = l - quantidade + 1; x <= l; x++) {
                                System.out.print(x + " ");
                            }

                            System.out.println();

                            encontrou = 1;
                        }
                    }
                }

                if (encontrou == 0) {
                    System.out.println("Nao existe uma sequencia de " + quantidade + " assentos livres.");
                }

            } else if (opcao == 6) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção invalida.");
            }

        } while (opcao != 6);

    }
}
