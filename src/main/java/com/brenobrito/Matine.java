package com.brenobrito;

public class Matine implements PrecoSessao
{

  @Override
  public double calcular(double precoBase)
  {
    return precoBase / 2;
  }
}
