package com.example.sum;

import org.junit.Test;

import com.example.sum.calculator.Add;
import com.example.sum.calculator.Minus;
import com.example.sum.calculator.Divide;
import com.example.sum.calculator.Multiply;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  private Add add = new Add(2, 3);
  private Minus minus = new Minus(6, 3);
  private Divide divide = new Divide(100, 5);
  private Multiply multiply = new Multiply(4, 3);

  @Test
  public void testAdd() {
    assertEquals("5", add.getResult());
  }

  @Test
  public void testMinus() {
    assertEquals("3", minus.getResult());
  }

  @Test
  public void testDivide() {
    assertEquals("20", divide.getResult());
  }

  @Test
  public void testMultiply() {
    assertEquals("12", multiply.getResult());
  }
}