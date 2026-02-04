package lista3.src.aulaum;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//instância
        int num1, num2, soma;//defubução de variaveis
        System.out.println("Informe o primeiro número:");
        num1 = sc.nextInt();
        System.out.println("\nInforme o segundo número:");
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.println("\nA soma é " + soma);
        sc.close();
    }
}
