import java.util.Scanner;
public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float basemaior, basemenor, area ,altura;

        System.out.println("Digite a basemenor: ");
        basemenor = teclado.nextFloat();

        System.out.println("Digite a basemaior: ");
        basemaior = teclado.nextFloat();

        System.out.println("Digite a altura: ");
        altura = teclado.nextFloat();



        area = (basemaior + basemenor)* altura /2;
        System.out.println("O valor da area é:" +area);



    }
}