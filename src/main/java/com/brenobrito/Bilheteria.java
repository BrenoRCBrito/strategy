package com.brenobrito;

public class Bilheteria
{

  private final double precoBase;

  public Bilheteria(double precoBase)
  {
    this.precoBase = precoBase;
  }

  public double vender(PrecoSessao precoSessao)
  {
    return precoSessao.calcular(this.precoBase);
  }
}
