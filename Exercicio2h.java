import java.util.Scanner;
public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float raio, altura, volume;
        float pi = 3.14f;

        System.out.println("Digite o raio: ");
        raio = teclado.nextFloat();

        System.out.println("Digite a altura: ");
        altura = teclado.nextFloat();

        volume = pi * raio * raio * altura;


        System.out.printf("O valor do volume = %.2f\n", volume);



    }
}