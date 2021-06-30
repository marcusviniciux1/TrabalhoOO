// Dupla: Gabriel Toledo Netto Gribel e Marcus Vinícius Rodrigues da Silva

package trabalho01;

public abstract class Entrega extends VolumeCaixa {

    private static float VALOR_CAIXA_PEQUENA = 2.0f;
    private static float VALOR_CAIXA_MEDIA = 3.0f;
    private static float VALOR_CAIXA_GRANDE = 5.0f;

    public abstract float calcularValorFinalEntrega();

    public float calcularValorCaixa() {

        if (this.calcularDimensaoCaixa() >= 1.0f && this.calcularDimensaoCaixa() <= 1500.0f) {
            return VALOR_CAIXA_PEQUENA;
        }
            else if (this.calcularDimensaoCaixa() <= 5000.0f) {
                return VALOR_CAIXA_MEDIA;
            }
                else {
                    return VALOR_CAIXA_GRANDE;
                }
    }
}