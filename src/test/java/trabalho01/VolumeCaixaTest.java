package trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeCaixaTest {

    @Test
    void calcularDimensaoCaixaTamanhoMaximo() {
        VolumeCaixa volumeCaixa1 = new VolumeCaixa();
        volumeCaixa1.setComprimento(16.0f);
        volumeCaixa1.setLargura(50.0f);
        volumeCaixa1.setAltura(25.0f);
        assertEquals(20000.0f, volumeCaixa1.calcularDimensaoCaixa());

    }

    @Test
    void calcularDimensaoCaixaTamanhoMinimo() {
        VolumeCaixa volumeCaixa2 = new VolumeCaixa();
        volumeCaixa2.setAltura(1.0f);
        volumeCaixa2.setLargura(1.0f);
        volumeCaixa2.setComprimento(1.0f);
        assertEquals(1.0f, volumeCaixa2.calcularDimensaoCaixa());
    }

    @Test
    void calcularDimensaoCaixaErro() {
        try {
            VolumeCaixa volumeCaixa3 = new VolumeCaixa();
            volumeCaixa3.setAltura(-10.0f);
            volumeCaixa3.setLargura(-10.0f);
            volumeCaixa3.setComprimento(-1.0f);
            volumeCaixa3.calcularDimensaoCaixa();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Os valores passados não existem.", e.getMessage());

        }
    }
}