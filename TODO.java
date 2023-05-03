public class TODO {
    String nome;
    boolean progresso;
    TODO prox;

    public TODO(String nome){
        this.nome = nome;
        this.progresso = false;
        this.prox = null;
    }
    public  TODO(String nome, TODO prox){
        this.nome = nome;
        this.progresso = false;
        this.prox = prox;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public boolean getProgresso(){
        return progresso;
    }
    public void setProgresso(boolean progresso){
        this.progresso = progresso;
    }
    public TODO getProx(){
        return prox;
    }
    public void setProx(TODO prox){
        this.prox = prox;
    }
}
