import java.util.Scanner;

public class Uri1064 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        float ac = 0;
        for (int i = 0; i < 6; i++) {
            float num = entrada.nextFloat();
            if (num > 0) {
                cont = cont + 1;
                ac = ac + num;
            }
        }
        
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f\n", (ac / cont));
    }
}