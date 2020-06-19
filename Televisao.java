public class Televisao{
    String  marca;
    int     tamanhoTela;
    int     canal;
    int     volume;
    boolean ligada;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }
    
    void avancarCanal(){
        if (ligada == true){
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else {
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    

    void canalmax(){
        if (canal >= 0 && canal <= 99){
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            System.out.println(" o canal maximo e  99 "+marca);
        }

    }


}