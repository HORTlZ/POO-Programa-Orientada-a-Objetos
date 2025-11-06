public class canal {
    int numero;
    String nome;
    public canal(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
    public int getNumero(){
        return numero;
    }
    public String getNome(){
        return nome;
    }
    public String toString(){
        return numero + "-" + nome;
    }
}