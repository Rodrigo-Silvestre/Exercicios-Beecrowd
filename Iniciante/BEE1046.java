/**
 * Enunciado:
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
 * sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * 
 * Entrada:
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 * 
 * Saída:
 * Apresente a duração do jogo conforme exemplo abaixo.
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int horaInicial, horaFinal;
        horaInicial = dado.nextInt();
        horaFinal = dado.nextInt();
        if (horaInicial < horaFinal) {
            System.out.println("O JOGO DUROU " + (horaFinal -horaInicial) + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU " + ((24 - horaInicial) + horaFinal) + " HORA(S)");
        }
        dado.close();
    }
}
