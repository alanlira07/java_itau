public class Pessoa{
    String nome;
    String sobrenome;
    int idade;
    char sexo; 

    public Pessoa (String no, String so, int id, char se){
        nome = no;
        sobrenome = so;
        idade = id;
        sexo = se;

    }

    public void setNome(String no){
        nome = no;
        
    }

}