package trabalho01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceitaTransportadoraTest {

    @Test
    void calcularReceitaGeradaDosFretes() {
        EntregaEnderecoCombinado primeiraEntregaFeita = new EntregaEnderecoCombinado();
        primeiraEntregaFeita.setAltura(4.0f);
        primeiraEntregaFeita.setComprimento(15.0f);
        primeiraEntregaFeita.setLargura(25.0f);

        EntregaNormal segundaEntregaFeita = new EntregaNormal();
        segundaEntregaFeita.setAltura(8.0f);
        segundaEntregaFeita.setComprimento(25.0f);
        segundaEntregaFeita.setLargura(25.0f);

        EntregaExpressa terceiraEntregaFeita = new EntregaExpressa();
        terceiraEntregaFeita.setAltura(16.0f);
        terceiraEntregaFeita.setComprimento(50.0f);
        terceiraEntregaFeita.setLargura(25.0f);

        List<Entrega> lista = new ArrayList<Entrega>();
        lista.add(primeiraEntregaFeita);
        lista.add(segundaEntregaFeita);
        lista.add(terceiraEntregaFeita);

        assertEquals(65.0f, ReceitaTransportadora.calcularReceitaGeradaDosFretes(lista));
    }
}