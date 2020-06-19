import java.util.Scanner;
public class Uri1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float raio, area, n = 3.14159f;

        System.out.println("Valor de raio: ");
        raio = teclado.nextFloat();

        area = n * (raio * raio);

        System.out.printf("A= %.4f\n", area);
    
    }
}