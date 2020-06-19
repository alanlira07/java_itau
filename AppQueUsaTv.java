public class AppQueUsaTv{
    public static void main(String args[]){
        Televisao t;          // declaro a TV
        t = new Televisao();  // solicito memória para armazenar a estrutura
                              // Televisao t = new Televisao();

        t.marca = "Samsung";
        t.tamanhoTela = 42;
        t.ligada = false;
        t.canal = 100;
        t.volume = 10;

        Televisao x = new Televisao();
        x.marca = "LG";
        x.tamanhoTela = 55;
        x.ligada = true;
        x.canal = 1;
        x.volume = 5;

        t.power();
        t.avancarCanal();
        t.canalmax();
        x.power();
        x.canalmax();
        x.avancarCanal();

    }
}