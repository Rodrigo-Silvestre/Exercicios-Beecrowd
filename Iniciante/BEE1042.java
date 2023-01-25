/**
 * Enunciado:
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente,
 * uma linha em branco e em seguida, os valores na sequência como foram lidos.
 * 
 * Entrada:
 * A entrada contem três números inteiros.
 * 
 * Saída:
 * Imprima a saída conforme foi especificado.
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int a, b, c, aux = 0, a2, b2, c2;
        a = dado.nextInt();
        b = dado.nextInt();
        c = dado.nextInt();
        a2 = a;
        b2 = b;
        c2 = c;
        if (b < a && b < c) {
            aux = a;
            a = b;
            b = aux;
        }
        else {
            if (c < a && c < b) {
                aux = a;
                a = c;
                c = aux;
            }
        }
        if (c < b) {
           aux = b;
           b = c;
           c = aux; 
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        dado.close();
    }
}
