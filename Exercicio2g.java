import java.util.Scanner;
public class Exercicio2g{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float volume, lado;

        System.out.println("Digite a lado: ");
        lado = teclado.nextFloat();


        volume = lado * lado * lado;

        System.out.println("O valor do volume é:" +volume);



    }
}