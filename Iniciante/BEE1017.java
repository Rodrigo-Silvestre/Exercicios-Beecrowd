/**
 * Enunciado:
 * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem,
 * ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa.
 * Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h).
 * Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários.
 * Mostre o valor com 3 casas decimais após o ponto.
 * 
 * Entrada:
 * O arquivo de entrada contém dois inteiros. 
 * O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h).
 * 
 * Saída:
 * Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
 */
import java.io.IOException;
import java.util.Scanner;
public class BEE1017 {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        int tempo, velocidade;
        double resultado = 0;
        tempo = dado.nextInt();
        velocidade = dado.nextInt();
        resultado = (tempo * velocidade) / 12f;
        System.out.printf("%.3f\n", resultado);
        dado.close();
    }
}
