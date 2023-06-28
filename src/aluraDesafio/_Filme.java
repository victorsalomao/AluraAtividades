package aluraDesafio;

public class _Filme extends Titulo {
    private String diretor;
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
    }
}
