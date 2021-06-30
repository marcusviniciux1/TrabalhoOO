package trabalho01;

public class EntregaEnderecoCombinado extends Entrega {

    @Override
    public float calcularValorFinalEntrega() {
        return calcularValorCaixa();
    }
}