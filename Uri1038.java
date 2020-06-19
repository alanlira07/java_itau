import java.util.Scanner;
public class Uri1038{

    public static void main(String args[]){
		int a, b;
		float valor = 0;
		
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		if (a == 1) {
			 valor =  (4.00f * b);
		}else if (a == 2) {
			valor  = (4.50f * b);
		}else if (a == 3) {
			valor  = (5.00f * b);
		}else if (a == 4) {
			valor  = (2.00f * b);
		}else if (a == 5) {
			valor  = (1.50f * b);
		}
		
		System.out.printf("Total: R$ %.2f\n",valor);
	}

}