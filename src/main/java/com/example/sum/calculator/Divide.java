package com.example.sum.calculator;

public class Divide extends Sign {
  public Divide(int nmb1, int nmb2) {
    super(nmb1, nmb2);
  }

  @Override
  public String getResult() {
    return "" + (this.getNmb1() / this.getNmb2());
  }

}