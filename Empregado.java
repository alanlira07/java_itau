public class Empregado{
    
    private String nome;      
    private String cargo;
    private double salario;
    private int aumento;
    
    public Empregado(String no, String ca, double sa, int au){
        nome = no;
        sobrenome = so;
        salario = sa;
        
    }

public void setNome(String no){
        nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setSobrenome(String so){
        sobrenome = so;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSalario(double sa){
        salario = sa;
    }
    public int getSalario(){
        return salario;
    }


    public String imprimir(){
        return nome+" "+cargo+" " salario ";
        salario = salario + salario * salario/ 100;
    }


}

}