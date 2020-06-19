public class Refrigerante{
    private String  nome;
    private double  preco;
    private int     qtdEstoque;


    public Refrigerante (String no, double pr, int qt){
        this.nome          = no;
        this.preco         = pr;
        this.qtdEstoque    = qt;

    }

    // gets + sets//

    public String getTitulo(){
        return this.titulo;
    }
    //...
    public boolean isEmprestado(){ // o "boolean" foge ao padrão de GET, sendo usado como IS
        return this.emprestado;
    }

    public void emprestar(){
        emprestado = true;
    }
    public void devolver(){
        emprestado = false;
    }

    public String imprimirInfo(){
        return titulo+"/"+autor+"("+ano+")  "+categoria+" POS:(E:"+posEstante+" P:"+posPrateleira+")"; 
    }
} 