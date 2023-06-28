package aluraDesafio;

public abstract class Titulo {
    private String Nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private String categoria;
    private double SomaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    //getters e setters
    public String getNome() {
        return Nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = this.incluidoNoPlano;
    }
    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    //getters e setters

    //Métodos
    public abstract void exibeFichaTecnica();

    public void avalia(double nota){
        this.SomaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    public double pegaMedia(){
        return (SomaDasAvaliacoes / totalDeAvaliacao);
    }
}
