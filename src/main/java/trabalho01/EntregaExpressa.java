package trabalho01;

public class EntregaExpressa extends Entrega {

    private float VALOR_FRETE_EXPRESSO = 35.0f;

    @Override
    public float calcularValorFinalEntrega() {
        return calcularValorCaixa() + VALOR_FRETE_EXPRESSO;
    }
}