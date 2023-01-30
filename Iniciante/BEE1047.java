/**
 * Enunciado:
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
 * 
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 * 
 * Entrada:
 * Quatro números inteiros representando a hora de início e fim do jogo.
 * 
 * Saída:
 * Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int horaInicial, horaFinal, minutoInicial, minutoFinal, res = 0;
        int h1, h2;
        horaInicial = dado.nextInt();
        minutoInicial = dado.nextInt();
        horaFinal = dado.nextInt();
        minutoFinal = dado.nextInt();
        h1 = (horaInicial * 60) + minutoInicial;
        h2 = (horaFinal * 60)  + minutoFinal;
        if (h1 < h2) {
            res = h2 - h1;
        }
        else {
            res = ((24 * 60) - h1) + h2;
        }
        System.out.println("O JOGO DUROU " + (res / 60) + " HORA(S) E " + (res % 60) + " MINUTO(S)");
        dado.close();
    }
}
