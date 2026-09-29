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
public class Exercicio1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] notas = new double[10];

        double soma = 0, media, maior, menor;
        int aprovados = 0, abaixomedia = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota do aluno" + (i + 1) + ": ");
            notas[i] = ler.nextDouble();

            soma = soma + notas[i];

            if (notas[i] >= 7) {
                aprovados++;
            }
        }

        media = soma / 10;
        maior = notas[0];
        menor = notas[0];

        for (int i = 0; i < 10; i++) {

            if (notas[i] > maior) {
                maior = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }

            if (notas[i] < media) {
                abaixomedia++;
            }
        }
        System.out.println("Resultado:");
        System.out.println("Media da turma: " +media);
        System.out.println("Maior nota: " +maior);
        System.out.println("Menor nota: " +menor);
        System.out.println("Alunos com nota maior ou igual a 7: " +aprovados);
        System.out.println("Alunos abaixo da media: " +abaixomedia);

    }
}
