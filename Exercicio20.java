import java.util.Scanner;
public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        
        float altura, ideal; 
        char sexo;

        System.out.println("Escreva altura");
        altura = teclado.nextFloat();
        System.out.println("Escreva seu sexo");
        sexo = teclado.nextChar();

        if (sexo == 'm')
        ideal = (72.7f * altura - 58);

        System.out.println("Pesoal ideal"+m);

        else if (sexo =='f')
        ideal = (62.1f*altura - 44.7f);
        System.out.println("Peso ideal" +f);
    }

}


    
