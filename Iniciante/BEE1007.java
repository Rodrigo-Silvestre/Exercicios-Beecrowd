/**
 * Enunciado:
 * Leia quatro valores inteiros A, B, C e D. A seguir,
 * calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 * 
 * Entrada:
 * O arquivo de entrada contém 4 valores inteiros.
 * 
 * Saída:
 * Imprima a mensagem DIFERENCA com todas as letras maiúsculas,
 * conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner( System.in);
        int A, B, C, D, diferenca;
        A = dado.nextInt();
        B = dado.nextInt();
        C = dado.nextInt();
        D = dado.nextInt();
        diferenca = A * B - C * D;
        System.out.println("DIFERENCA = " + diferenca);
        dado.close();
    }
}