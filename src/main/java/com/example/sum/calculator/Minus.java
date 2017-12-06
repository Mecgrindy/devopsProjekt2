package com.example.sum.calculator;

public class Minus extends Sign {
  public Minus(int nmb1, int nmb2) {
    super(nmb1, nmb2);
  }

  @Override
  public String getResult() {
    return "" + (this.getNmb1() - this.getNmb2());
  }

}