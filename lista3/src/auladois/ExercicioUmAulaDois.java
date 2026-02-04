package auladois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioUmAulaDois {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(); //instancia
        Scanner sc = new Scanner(System.in);
        int qtd, min, max, valor, soma = 0;
        double med;

        System.out.println("quantos numeros voce vai inserir? ");
        qtd = sc.nextInt();

        for(int i = 0; i < qtd ; i++) {
            System.out.print("digite o numero " + (i + 1) + ": ");
            valor = sc.nextInt();
            numeros.add(i);
        }
        max = Collections.max(numeros);
        min = Collections.min(numeros);

        for (Integer j : numeros) {
            soma += j;
        }
        sc.close();
        med = soma / qtd;
        System.out.println("\nValor Maximo " + max
                        + "\nValor minimo " + min
                        + "\nValor minimo "+ med
        );
        //med = numeros.
    }
}