/**
 * Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
 * Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
 * 
 * 
 * Perimetro = XX.X
 * 
 * 
 * Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
 * 
 * 
 * Area = XX.X
 * 
 * Entrada
 * A entrada contém três valores reais.
 * 
 * Saída
 * O resultado deve ser apresentado com uma casa decimal.
 */
import java.io.IOException;
import java.util.Scanner;
public class BEE1043 {
    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);
        float A, B, C, maiorLado, LadoA, LadoB;
        boolean triangulo;
        A = dado.nextFloat();
        B = dado.nextFloat();
        C = dado.nextFloat();
        if (A > C && A > C) {
            maiorLado = A;
            LadoA = B;
            LadoB = C;
        }
        else {
            if (B > C && B > A) {
                maiorLado = B;
                LadoA = A;
                LadoB = C;
            }
            else {
                maiorLado = C;
                LadoA = A;
                LadoB = C;
            }
        }
        if (maiorLado < LadoA + LadoB) {
            triangulo = true;
        }
        else {
            triangulo = false;
        }
        if (triangulo == false) {
            System.out.printf("Area = %.1f\n", (((A + B) * C) / 2));
        }
        else {
            System.out.printf("Perimetro = %.1f\n", A + B + C) ;
        }
        dado.close();
    }
}
