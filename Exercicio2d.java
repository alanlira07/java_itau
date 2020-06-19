import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float diagonal1, diagonal2, area;

        System.out.println("Digite a diagonal1: ");
        diagonal1 = teclado.nextFloat();

        System.out.println("Digite a diagonal2: ");
        diagonal2 = teclado.nextFloat();

        area = diagonal1 * diagonal2;

        System.out.println("O valor da area: "+area);



    }
}