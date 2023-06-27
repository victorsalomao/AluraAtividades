package aluraDesafio;

public class Principal {
    public static void main(String[] args) {
        _Serie Upload = new _Serie();
        Upload.setNome("Upload");
        Upload.setTemporadas(3);
        Upload.setCategoria("Ficção Cientifica");
        Upload.setAnoDeLancamento(2019);
        Upload.setEpisodiosPorTemporada(20);
        Upload.setMinutosPorEpisodio(20);
        Upload.exibeFichaTecnica();

    }
}
