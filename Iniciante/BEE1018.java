/**
 * Enunciado:
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
 * 
 * Entrada:
 * O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).
 * 
 * Saída:
 * Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 * Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */
import java.io.IOException;
import java.util.Scanner;
public class BEE1018 {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int valor;
        int cem = 0, cinquenta = 0, vinte = 0, dez = 0, cinco = 0, dois = 0, um = 0;
        valor = dado.nextInt();
        System.out.println(valor);
        
        while (valor >= 100) {
            valor = valor - 100;
            cem++;
        }
        System.out.println(cem + " nota(s) de R$ 100,00");
    
        while (valor >= 50) {
            valor = valor - 50;
            cinquenta++;
        }
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
    
        while (valor >= 20) {
            valor = valor - 20;
            vinte++;
        }
        System.out.println(vinte + " nota(s) de R$ 20,00");
    
        while (valor >= 10) {
            valor = valor - 10;
            dez++;
        }
        System.out.println(dez + " nota(s) de R$ 10,00");
        
        while (valor >= 5) {
            valor = valor - 5;
            cinco++;
        }
        System.out.println(cinco + " nota(s) de R$ 5,00");
    
        while (valor >= 2) {
            valor = valor - 2;
            dois++;
        }
        System.out.println(dois + " nota(s) de R$ 2,00");
    
        while (valor >= 1) {
            valor = valor - 1;
            um++;
        }
        System.out.println(um + " nota(s) de R$ 1,00");
        dado.close();
    }
}
