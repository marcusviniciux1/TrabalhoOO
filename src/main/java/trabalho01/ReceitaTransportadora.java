package trabalho01;

import java.util.List;

public class ReceitaTransportadora {

    public static float calcularReceitaGeradaDosFretes(List<Entrega> entregas) {

        float receitaTotal = 0.0f;

        for (Entrega entrega : entregas) {
            receitaTotal += entrega.calcularValorFinalEntrega();
        }

        return receitaTotal;
    }
}