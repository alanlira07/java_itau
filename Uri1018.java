import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        int c100,c50,c20,c10,c5,c2,c1; 


        c100 = valor / 100;
        valor = valor % 100;

        c50 = valor / 50;
        valor = valor % 50;

        c20 = valor / 20;
        valor = valor % 20;

        c20 = valor / 10;
        valor = valor % 10; 

        c5 = valor / 5;
        valor = valor % 5;

        c2 = valor / 2;
        valor = valor % 2;

        c1 = valor / 1;
        valor = valor % 1;

        System.out.println(c100 + " nota(s) de R$100,00");
        System.out.println(c50 + " nota(s) de R$50,00");
        /*
        System.out.println(c20 + " nota(s) de R$20,00");
        System.out.println(c10 + " nota(s) de R$10,00");
        System.out.println(c5 + " nota(s) de R$5,00");
        System.out.println(c2 + " nota(s) de R$2,00");
        System.out.println(c1 + " nota(s) de R$1,00");
        */


    }

}