import java.util.Scanner;

public class Uri1066 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n; 
        int par=0;
        int impar=0;
        int positivo=0; 
        int negativo=0;

        for (int i=0; i<5; i++) {
            n = input.nextInt();
            if (n % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }
            if (n > 0) {
                positivo++;
            }
            if (n < 0) {
                negativo++;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}