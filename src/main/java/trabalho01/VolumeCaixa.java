package trabalho01;

public class VolumeCaixa {

    private float altura;
    private float comprimento;
    private float largura;
    private float volume;

    public VolumeCaixa() {
        this.altura = 0.0f;
        this.comprimento = 0.0f;
        this.largura = 0.0f;
        this.volume = 0.0f;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float calcularDimensaoCaixa() {
        this.volume = this.altura * this.largura * this.comprimento;

        if (this.volume >= 1.0f && this.volume <= 20000.0f) {
            return this.volume;
        } else {
            throw new IllegalArgumentException("Os valores passados não existem.");
        }
    }
}
