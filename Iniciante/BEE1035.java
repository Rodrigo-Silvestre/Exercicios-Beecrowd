/**
 * Enunciado:
 * Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A,
 * e a soma de C com D for maior que a soma de A e B e se C e D, ambos,
 * forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
 * 
 * Entrada:
 * Quatro números inteiros A, B, C e D.
 * 
 * Saída:
 * Mostre a respectiva mensagem após a validação dos valores.
 */
import java.io.IOException;
import java.util.Scanner;
public class BEE1035 {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int A, B, C, D;
        A = dado.nextInt();
        B = dado.nextInt();
        C = dado.nextInt();
        D = dado.nextInt();
        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && ((A % 2) == 0)) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
        dado.close();
    }
}
