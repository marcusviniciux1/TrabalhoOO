package trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaExpressaTest {

    @Test
    void calcularValorFinalEntregaCaixaPequenaMaximo() {
        EntregaExpressa entregaExpressaCP1 = new EntregaExpressa();
        entregaExpressaCP1.setAltura(4.0f);
        entregaExpressaCP1.setComprimento(15.0f);
        entregaExpressaCP1.setLargura(25.0f);
        assertEquals(37.0f, entregaExpressaCP1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaPequenaMinimo() {
        EntregaExpressa entregaExpressaCP2 = new EntregaExpressa();
        entregaExpressaCP2.setAltura(1.0f);
        entregaExpressaCP2.setComprimento(1.0f);
        entregaExpressaCP2.setLargura(1.0f);
        assertEquals(37.0f, entregaExpressaCP2.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaMediaMaximo() {
        EntregaExpressa entregaExpressaCM1 = new EntregaExpressa();
        entregaExpressaCM1.setAltura(8.0f);
        entregaExpressaCM1.setComprimento(25.0f);
        entregaExpressaCM1.setLargura(25.0f);
        assertEquals(38.0f, entregaExpressaCM1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaMediaMinimo() {
        EntregaExpressa entregaExpressaCM2 = new EntregaExpressa();
        entregaExpressaCM2.setAltura(4.01f);
        entregaExpressaCM2.setComprimento(15.0f);
        entregaExpressaCM2.setLargura(25.01f);
        assertEquals(38.0f, entregaExpressaCM2.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaGrandeMaximo() {
        EntregaExpressa entregaExpressaCG1 = new EntregaExpressa();
        entregaExpressaCG1.setAltura(16.0f);
        entregaExpressaCG1.setComprimento(50.0f);
        entregaExpressaCG1.setLargura(25.0f);
        assertEquals(40.0f, entregaExpressaCG1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaGrandeMinimo() {
        EntregaExpressa entregaExpressaCG2 = new EntregaExpressa();
        entregaExpressaCG2.setAltura(8.01f);
        entregaExpressaCG2.setComprimento(25.01f);
        entregaExpressaCG2.setLargura(25.0f);
        assertEquals(40.0f, entregaExpressaCG2.calcularValorFinalEntrega());
    }
}