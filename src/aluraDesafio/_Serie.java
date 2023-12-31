package aluraDesafio;

public class _Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean emAndamento;
    private int minutosPorEpisodio;


    public int getTemporadas() {
        return temporadas;
    }
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Temporadas " + getTemporadas());
        System.out.println("Duração em minutos " + getDuracaoEmMinutos());
        System.out.println("Ano de Lançamento: " + getAnoDeLancamento());
    }
}
