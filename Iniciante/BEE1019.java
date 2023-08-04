/**
 * Enunciado:
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
 * e informe-o expresso no formato horas:minutos:segundos.
 * 
 * Entrada:
 * O arquivo de entrada contém um valor inteiro N.
 * 
 * Saída:
 * Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
 * conforme exemplo fornecido.
 */
import java.io.IOException;
import java.util.Scanner;
public class BEE1019 {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int N, aux, min, hora, seg;
        N = dado.nextInt();
        hora = (N / 60) / 60;
        aux = (N / 60);
        min = aux - (hora * 60);
        seg = N % 60;
        System.out.printf("%d:%d:%d\n", hora, min, seg);
        dado.close();
    }
}
