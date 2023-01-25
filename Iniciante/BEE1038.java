/**
 * Enunciado:
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * Código:  Especificação:        Preço:
 * 1   =    Cachorro Quente   =   R$ 4.00
 * 2   =    X-Salada          =   R$ 4.50
 * 3   =    X-Bacon           =   RS 5.00
 * 4   =    Torrada Simples   =   R$ 2.00
 * 5   =    Refrigerante      =   R$ 1.50
 * 
 * Entrada:
 * O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
 * 
 * Saída:
 * O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int cod, qtd;
        double vet[] = {4, 4.50, 5, 2, 1.50};
        cod = dado.nextInt();
        qtd = dado.nextInt();
        System.out.printf("Total: R$ %1.2f\n", vet[cod - 1] * qtd);
        dado.close();
    }
}
