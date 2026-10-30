package com.brenobrito;

public class Estreia implements PrecoSessao
{

  @Override
  public double calcular(double precoBase)
  {
    return precoBase * 1.5;
  }
}
