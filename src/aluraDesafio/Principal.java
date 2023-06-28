package aluraDesafio;

import calculosClasses.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {
        _Serie Upload = new _Serie();
        CalculadoraDeTempo calcular = new CalculadoraDeTempo();
        Upload.setNome("Upload");
        Upload.setTemporadas(3);
        Upload.setCategoria("Ficção Cientifica");
        Upload.setAnoDeLancamento(2019);
        Upload.setEpisodiosPorTemporada(20);
        Upload.setMinutosPorEpisodio(20);
        Upload.getDuracaoEmMinutos();
        Upload.exibeFichaTecnica();
        calcular.inclui(Upload);
        System.out.println(calcular.getTempoEmHoras());
        _Filme Batman = new _Filme();
        Batman.setNome("Batman - O Cavaleiro das Trevas");
        Batman.setDiretor("Cristopher Nolan");
        Batman.setAnoDeLancamento(2008);
        Batman.setCategoria("Hérois");
        Batman.exibeFichaTecnica();
        Batman.setDuracaoEmMinutos(1500);
        calcular.inclui(Batman);
        System.out.println(calcular.getTempoEmHoras());

    }
}
