/**
 * Enunciado:
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
 * A seguir mostre a relação de notas necessárias.
 * 
 * Entrada:
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 * 
 * Saída:
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.
 * 
 * Obs: Utilize ponto (.) para separar a parte decimal.
 */
import java.io.IOException;
import java.util.Scanner;
public class BEE1021 {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        double N = dado.nextDouble();
        int valor = 0;
        if (N > 0 && N < 1000000) {
            System.out.println("NOTAS:");
            valor = (int) N / 100;
            System.out.printf("%d nota(s) de R$ 100.00%n", valor);
            N = N % 100;

            valor = (int) N / 50;
            System.out.printf("%d nota(s) de R$ 50.00%n", valor);
            N = N % 50;
            
            valor = (int) N / 20;
            System.out.printf("%d nota(s) de R$ 20.00%n", valor);
            N = N % 20;

            valor = (int) N / 10;
            System.out.printf("%d nota(s) de R$ 10.00%n", valor);
            N = N % 10;

            valor = (int) N / 5;
            System.out.printf("%d nota(s) de R$ 5.00%n", valor);
            N = N % 5;

            valor = (int) N / 2;
            System.out.printf("%d nota(s) de R$ 2.00%n", valor);
            N = N % 2;

            N = N * 100.0;

            System.out.println("MOEDAS:");
            valor = (int) N / 100;
            System.out.printf("%d moeda(s) de R$ 1.00%n", valor);
            N = N % 100;

            valor = (int) N / 50;
            System.out.printf("%d moeda(s) de R$ 0.50%n", valor);
            N = N % 50;

            valor = (int) N / 25;
            System.out.printf("%d moeda(s) de R$ 0.25%n", valor);
            N = N % 25;

            valor = (int) N / 10;
            System.out.printf("%d moeda(s) de R$ 0.10%n", valor);
            N = N % 10;

            valor = (int)  N / 5;
            System.out.printf("%d moeda(s) de R$ 0.05%n", valor);
            N = N % 5;

            valor = (int)  N / 1;
            System.out.printf("%d moeda(s) de R$ 0.01%n", valor);
            N = N % 1;
        }
        dado.close();
    }
}
