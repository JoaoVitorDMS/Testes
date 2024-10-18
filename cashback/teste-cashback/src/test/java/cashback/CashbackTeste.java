package cashback;

import org.junit.Test;
import paranavai.ifpr.edu.br.SimuladorCashBack;
import static org.junit.Assert.assertEquals;

public class CashbackTeste {

    @Test
    public void testaCashBackLimiteInferiorParticaoABronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(-0.01, "Bronze");
        Double descontoEsperado = 0.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoAPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(-0.01, "Prata");
        Double descontoEsperado = 0.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoAOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(-0.01, "Ouro");
        Double descontoEsperado = 0.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoABronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(0.01, "Bronze");
        Double descontoEsperado = 0.0005;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoAPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(0.01, "Prata");
        Double descontoEsperado = 0.001;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoAOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(0.01, "Ouro");
        Double descontoEsperado = 0.0015;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoBBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(99.99, "Bronze");
        Double descontoEsperado = 4.9995;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoBPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(99.99, "Prata");
        Double descontoEsperado = 9.999;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoBOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(99.99, "Ouro");
        Double descontoEsperado = 14.9985;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoBBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.01, "Bronze");
        Double descontoEsperado = 5.0005;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoBPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.01, "Prata");
        Double descontoEsperado = 10.001;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoBOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.01, "Ouro");
        Double descontoEsperado = 15.0015;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoCBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.00, "Bronze");
        Double descontoEsperado = 5.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoCPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.00, "Prata");
        Double descontoEsperado = 10.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoCOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.00, "Ouro");
        Double descontoEsperado = 15.0; // Correção adicionada aqui
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoCPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.02, "Prata");
        Double descontoEsperado = 10.002;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoCOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(100.02, "Ouro");
        Double descontoEsperado = 15.003;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoDBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(499.99, "Bronze");
        Double descontoEsperado = 24.9995;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoDPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(499.99, "Prata");
        Double descontoEsperado = 49.999;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoDOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(499.99, "Ouro");
        Double descontoEsperado = 74.9985;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoDBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(500.01, "Bronze");
        Double descontoEsperado = 25.0005;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoDPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(500.01, "Prata");
        Double descontoEsperado = 50.001;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoDOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(500.01, "Ouro");
        Double descontoEsperado = 75.0015;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackZeroBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(0.0, "Bronze");
        Double descontoEsperado = 0.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackZeroPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(0.0, "Prata");
        Double descontoEsperado = 0.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackZeroOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(0.0, "Ouro");
        Double descontoEsperado = 0.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoEBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(1000.00, "Bronze");
        Double descontoEsperado = 50.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoEPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(1000.00, "Prata");
        Double descontoEsperado = 100.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteInferiorParticaoEOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(1000.00, "Ouro");
        Double descontoEsperado = 150.0;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoEBronze() {
        Double desconto = SimuladorCashBack.calculaCashBack(1000.01, "Bronze");
        Double descontoEsperado = 50.0005;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoEPrata() {
        Double desconto = SimuladorCashBack.calculaCashBack(1000.01, "Prata");
        Double descontoEsperado = 100.001;
        assertEquals(descontoEsperado, desconto, 0.00);
    }

    @Test
    public void testaCashBackLimiteSuperiorParticaoEOuro() {
        Double desconto = SimuladorCashBack.calculaCashBack(1000.01, "Ouro");
        Double descontoEsperado = 150.0015;
        assertEquals(descontoEsperado, desconto, 0.00);
    }
}
