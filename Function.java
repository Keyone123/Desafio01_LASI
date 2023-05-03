import java.util.Objects;

public class Function {
    TODO inicio;
    TODO ultimo;
    static int tamanho;
    public void adicionar(String nome){
        TODO celula = new TODO(nome);
        if(tamanho == 0)
            this.inicio = celula;
        else
            this.ultimo.setProx(celula);
        this.ultimo = celula;
        tamanho++;
    }
    public void imprimir(){
        TODO atual = this.inicio;
        if(tamanho == 0)
            System.out.println("Não há elementos na lista\n");
        while(atual != null){
            System.out.print(atual.getNome() + " - Status: ");
            if(atual.getProgresso())
                System.out.println("Concluída");
            else
                System.out.println("Em andamento");

            atual = atual.getProx();
        }
    }
    public void editar(String pesquisa, String nome_novo){
        TODO atual = this.inicio;
        while(atual != null){
            if(Objects.equals(atual.nome, pesquisa)){
                atual.setNome(nome_novo);
                System.out.println("\nNome editado com sucesso");
                break;
            }
            atual = atual.prox;
        }
    }
    public void concluir(String pesquisa){
        TODO atual = this.inicio;
        while(atual != null){
            if(Objects.equals(atual.nome, pesquisa)){
                if(atual.getProgresso()) {
                    System.out.println("\nEssa tarefa já está marcada como concluída");
                }else {
                    atual.setProgresso(true);
                    System.out.println("\nTarefa concluída com sucesso");
                    break;
                }
            }
            atual = atual.prox;
        }
    }
    public void excluir(String pesquisa) {
        TODO aux = null;
        TODO atual = this.inicio;
        while (atual != null && !Objects.equals(atual.nome, pesquisa)) {
            aux = atual;
            atual = atual.prox;
        }
        if (Objects.equals(atual.nome, pesquisa)) {
            if (aux != null)
                aux.prox = atual.prox;
            else
                this.inicio = atual.prox;
        }
        atual.prox = null;
    }
}
