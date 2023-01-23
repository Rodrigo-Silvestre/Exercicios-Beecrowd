/**
 * Enunciado:
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano,
 * p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
 * 
 * Distancia = raiz quadrada de (x2 - x1)² + (y2 - y1)²
 * 
 * Entrada:
 * O arquivo de entrada contém duas linhas de dados. 
 * A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.
 * 
 * Saída:
 * Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        float x1, x2, y1, y2, soma = 0, resultado = 0;
        x1 = dado.nextFloat();
        y1 = dado.nextFloat();
        x2 = dado.nextFloat();
        y2 = dado.nextFloat();
        soma = (float) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        resultado = (float) Math.sqrt(soma);
        System.out.printf("%.4f\n", resultado);
        dado.close();
    }
}
