public class EmpregadoTeste{
    public static void main(String args[]){

    Empregado e;
    e= new Empregado("alan", "diego", 2000);

    System.out.println(e.Imprimir());
    e.aumento(15);

    }

}