package trabalho01;

public class EntregaNormal extends Entrega {

    private float VALOR_FRETE_NORMAL = 20.0f;

    @Override
    public float calcularValorFinalEntrega() {
        return calcularValorCaixa() + VALOR_FRETE_NORMAL;
    }
}