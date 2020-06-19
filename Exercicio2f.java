import java.util.Scanner;
public class Exercicio2f{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float volume, altura, largura, profundidade;

        System.out.println("Digite a altura: ");
        altura = teclado.nextFloat();

        System.out.println("Digite a largura: ");
        largura = teclado.nextFloat();

        System.out.println("Digite a profundidade: ");
        profundidade = teclado.nextFloat();



        volume = altura * largura * profundidade;

        System.out.println("O valor do volume é:" +volume);



    }
}