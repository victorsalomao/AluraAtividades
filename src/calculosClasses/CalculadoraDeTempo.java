package calculosClasses;

import aluraDesafio.Titulo;

public class CalculadoraDeTempo {

    private int tempoEmHoras;

    public int getTempoEmHoras() {
        return tempoEmHoras;
    }

    public void inclui(Titulo titulo){
        tempoEmHoras += titulo.getDuracaoEmMinutos() / 60;
    }
}
