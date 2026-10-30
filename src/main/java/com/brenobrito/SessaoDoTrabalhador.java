package com.brenobrito;

public class SessaoDoTrabalhador implements PrecoSessao
{

  @Override
  public double calcular(double precoBase)
  {
    return 12.0;
  }
}
