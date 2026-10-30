package com.brenobrito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class BilheteriaTest
{

  @Test
  void deveCobrarMetadeNaMatine()
  {
    assertEquals(15.0, new Bilheteria(30.0).vender(new Matine()), 0.01);
  }

  @Test
  void deveCobrarOPrecoCheioNaNoturna()
  {
    assertEquals(30.0, new Bilheteria(30.0).vender(new Noturna()), 0.01);
  }

  @Test
  void deveCobrarComAcrescimoNaEstreia()
  {
    assertEquals(45.0, new Bilheteria(30.0).vender(new Estreia()), 0.01);
  }

  @Test
  void deveCobrarValorFixoNaSessaoDoTrabalhador()
  {
    assertEquals(12.0, new Bilheteria(30.0).vender(new SessaoDoTrabalhador()), 0.01);
  }

  @Test
  void deveIgnorarOPrecoBaseNaSessaoDoTrabalhador()
  {
    assertEquals(12.0, new Bilheteria(90.0).vender(new SessaoDoTrabalhador()), 0.01);
  }

  @Test
  void deveMudarOPrecoTrocandoApenasAEstrategia()
  {
    Bilheteria bilheteria = new Bilheteria(30.0);

    assertNotEquals(bilheteria.vender(new Matine()), bilheteria.vender(new Estreia()), 0.01);
  }

  @Test
  void deveAcompanharOPrecoBaseNasEstrategiasQueOUsam()
  {
    assertEquals(20.0, new Bilheteria(40.0).vender(new Matine()), 0.01);
    assertEquals(60.0, new Bilheteria(40.0).vender(new Estreia()), 0.01);
  }
}
