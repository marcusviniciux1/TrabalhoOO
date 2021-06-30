package trabalho01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntregaEnderecoCombinadoTest {

    @Test
    void calcularValorFinalEntregaCaixaPequenaMaximo() {
        EntregaEnderecoCombinado entregaCombinadaCP1 = new EntregaEnderecoCombinado();
        entregaCombinadaCP1.setAltura(4.0f);
        entregaCombinadaCP1.setComprimento(15.0f);
        entregaCombinadaCP1.setLargura(25.0f);
        assertEquals(2.0f, entregaCombinadaCP1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaPequenaMinimo() {
        EntregaEnderecoCombinado entregaCombinadaCP2 = new EntregaEnderecoCombinado();
        entregaCombinadaCP2.setAltura(1.0f);
        entregaCombinadaCP2.setComprimento(1.0f);
        entregaCombinadaCP2.setLargura(1.0f);
        assertEquals(2.0f, entregaCombinadaCP2.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaMediaMaximo() {
        EntregaEnderecoCombinado entregaCombinadaCM1 = new EntregaEnderecoCombinado();
        entregaCombinadaCM1.setAltura(8.0f);
        entregaCombinadaCM1.setComprimento(25.0f);
        entregaCombinadaCM1.setLargura(25.0f);
        assertEquals(3.0f, entregaCombinadaCM1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaMediaMinimo() {
        EntregaEnderecoCombinado entregaCombinadaCM2 = new EntregaEnderecoCombinado();
        entregaCombinadaCM2.setAltura(4.01f);
        entregaCombinadaCM2.setComprimento(15.0f);
        entregaCombinadaCM2.setLargura(25.01f);
        assertEquals(3.0f, entregaCombinadaCM2.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaGrandeMaxima() {
        EntregaEnderecoCombinado entregaCombinadaCG1 = new EntregaEnderecoCombinado();
        entregaCombinadaCG1.setAltura(16.0f);
        entregaCombinadaCG1.setComprimento(50.0f);
        entregaCombinadaCG1.setLargura(25.0f);
        assertEquals(5.0f, entregaCombinadaCG1.calcularValorFinalEntrega());
    }

    @Test
    void calcularValorFinalEntregaCaixaGrandeMinimo() {
        EntregaEnderecoCombinado entregaCombinadaCG2 = new EntregaEnderecoCombinado();
        entregaCombinadaCG2.setAltura(8.01f);
        entregaCombinadaCG2.setComprimento(25.01f);
        entregaCombinadaCG2.setLargura(25.0f);
        assertEquals(5.0f, entregaCombinadaCG2.calcularValorFinalEntrega());
    }
}