import java.util.Scanner;
public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salariominimo, consumo, valorkw, valordesc, valortotal;

        System.out.println("Salario minimo: ");
        salariominimo = teclado.nextFloat();
        System.out.println("Consumo da residencia: ");
        consumo = teclado.nextFloat();

        valorkw = salariominimo/7;

        valortotal = valorkw * consumo;

        valordesc = valortotal - (valortotal*10)/100;


        System.out.printf("valor de cada kw R$: %.2f\n", valorkw);
        System.out.printf("valor a ser pago R$: %.2f\n", consumo);
        System.out.printf("valor a ser pago com desconto R$: %.2f\n", valordesc);



    }
}