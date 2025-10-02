import java.util.ArrayList;
import java.util.List;

public class Televisao {
    private boolean ligada;
    private int volume;
    private int canalAtual;
    private final int numeroTV;
    private final List<String> canais;

    public Televisao(int numeroTV) {
        this.numeroTV = numeroTV;
        this.ligada = false;
        this.volume = 10;
        this.canalAtual = 0;
        this.canais = new ArrayList<>();
        inicializarCanais();
    }

    private void inicializarCanais() {
        canais.add("Globe");
        canais.add("SGBT");
        canais.add("RECU");
        canais.add("BanDIDO");
        canais.add("LGTV");
    }
     public void ligar(){
        ligada = true;
        System.out.println("TV LIGADINHAAAA");
     }
    public void desligar(){
        ligada = false;
        System.out.println("TV MORTaaaaaawwawaawwa");
    
    }
}
