import java.util.ArrayList;

public class agenda2 {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato c) {
        contatos.add(c);
    }

    public void remover(Contato c) {
        contatos.remove(c);
    }

    public int buscar(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) return i;
        }
        return -1;
    }

    public void listar() {
        for (Contato c : contatos) {
            c.imprimeInformacoes();
            System.out.println();
        }
        System.out.println("=== FIM ===");
    }

    public void mostrar(int i) {
        contatos.get(i).imprimeInformacoes();
    }
}