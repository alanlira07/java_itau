import java.util.Scanner;
public class Uri1040{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        		
		float N1, N2, N3, N4, N5, media, nota;
	
		N1 = teclado.nextFloat();
		N2 = teclado.nextFloat();
		N3 = teclado.nextFloat();
		N4 = teclado.nextFloat();
		
		media =((N1 * 2)+(N2 * 3)+( N3 * 4)+(N4 * 1))/10;
		
		if (media >= 7.0) {
			
			 System.out.printf("Media: %.1f\n",media);
			 System.out.println("Aluno aprovado.");
			 
		}
		
		else if (media >= 5.0 && media <= 6.9) {
			
			System.out.printf("Media: %.1f\n",media);
			System.out.println("Aluno em exame.");

			N5 = teclado.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",N5);
			nota =(media + N5) / 2;
			
			if (nota >= 5.0) {
				System.out.println("Aluno aprovado.");
				
			}
            else {
				System.out.println("Aluno reprovado.");
				
			}
			
			System.out.printf("Media final: %.1f\n",nota);
			
		}
		
		else if (media < 5.0) {
			
			System.out.printf("Media: %.1f\n",media);
			System.out.println("Aluno reprovado.");
			
		}
	}

}

