import java.util.Scanner;
public class Exercicio4{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salarioliquido, valorhora, quantidadehoras, desconto;


        System.out.println("Salario liquido: ");
        salarioliquido = teclado.nextFloat();
        System.out.println("Valor desconto INSS: ");
        desconto = teclado.nextFloat();
        System.out.println("Quantidade de horas: ");
        quantidadehoras = teclado.nextFloat();


        valorhora = (salarioliquido/30)/quantidadehoras;

        desconto = desconto/100;
        
        salarioliquido = salarioliquido - desconto;
        

        System.out.printf("valor hora %.2f\n", valorhora);
        System.out.printf("valor desconto  %.2f\n", desconto);
        System.out.printf("valor salario  %.2f\n", salarioliquido);



    }
}