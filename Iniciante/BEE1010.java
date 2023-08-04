/**
 * Enunciado:
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 * Após, calcule e mostre o valor a ser pago.
 * 
 * Entrada:
 * O arquivo de entrada contém duas linhas de dados.
 * Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.
 * 
 * Saída:
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 * lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
 * O valor deverá ser apresentado com 2 casas após o ponto.
 */
import java.util.Scanner;
public class BEE1010 {
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int codigoPeca1, codigoPeca2, numeroPeca1, numeroPeca2;
		double valorPeca1, valorPeca2, valorFinal;
		codigoPeca1 = dado.nextInt();
		numeroPeca1 = dado.nextInt();
		valorPeca1 = dado.nextDouble();
		codigoPeca2 = dado.nextInt();
		numeroPeca2 = dado.nextInt();
		valorPeca2 = dado.nextDouble();
		valorFinal = numeroPeca1 * valorPeca1 + numeroPeca2 * valorPeca2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
		dado.close();
	}
}
