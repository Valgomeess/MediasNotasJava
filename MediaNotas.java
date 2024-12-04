
package Questao01AV01;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array para armazenar 10 notas
        double[] notas = new double[10];
        double soma = 0;

        
        System.out.println("Digite as 10 notas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcular a média
        double media = soma / 10;

        // Exibir as notas maiores do que a média
        System.out.println("\nA media das notas e: " + media);
        System.out.println("Notas maiores do que a media:");
        for (double nota : notas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }

        scanner.close();
    }
}
