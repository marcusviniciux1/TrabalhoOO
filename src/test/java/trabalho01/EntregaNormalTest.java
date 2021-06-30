package trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaNormalTest {

    @Test
    void calcularValorFinalEntregaCaixaPequenaMaxima() {
        EntregaNormal entregaNormalCP1 = new EntregaNormal();
        entregaNormalCP1.setAltura(4.0f);
        entregaNormalCP1.setComprimento(15.0f);
        entregaNormalCP1.setLargura(25.0f);
        assertEquals(22.0f, entregaNormalCP1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaPequenaMinimo() {
        EntregaNormal entregaNormalCP2 = new EntregaNormal();
        entregaNormalCP2.setAltura(1.0f);
        entregaNormalCP2.setComprimento(1.0f);
        entregaNormalCP2.setLargura(1.0f);
        assertEquals(22.0f, entregaNormalCP2.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaMediaMaxima() {
        EntregaNormal entregaNormalCM1 = new EntregaNormal();
        entregaNormalCM1.setAltura(8.0f);
        entregaNormalCM1.setComprimento(25.0f);
        entregaNormalCM1.setLargura(25.0f);
        assertEquals(23.0f, entregaNormalCM1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaMediaMinima() {
        EntregaNormal entregaNormalCM2 = new EntregaNormal();
        entregaNormalCM2.setAltura(4.01f);
        entregaNormalCM2.setComprimento(15.0f);
        entregaNormalCM2.setLargura(25.01f);
        assertEquals(23.0f, entregaNormalCM2.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaGrandeMaxima() {
        EntregaNormal entregaNormalCG1 = new EntregaNormal();
        entregaNormalCG1.setAltura(16.0f);
        entregaNormalCG1.setComprimento(50.0f);
        entregaNormalCG1.setLargura(25.0f);
        assertEquals(25.0f, entregaNormalCG1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaGrandeMinima() {
        EntregaNormal entregaNormalCG2 = new EntregaNormal();
        entregaNormalCG2.setAltura(8.01f);
        entregaNormalCG2.setComprimento(25.01f);
        entregaNormalCG2.setLargura(25.0f);
        assertEquals(25.0f, entregaNormalCG2.calcularValorFinalEntrega());
    }
}