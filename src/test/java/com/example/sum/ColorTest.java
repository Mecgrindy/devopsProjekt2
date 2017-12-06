package com.example.sum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import com.example.sum.color.HexConverter;
import com.example.sum.color.RGBConverter;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class ColorTest {

  @Parameter(0)
  public String colorName;
  @Parameter(1)
  public String result;

  @Parameters
  public static Collection<Object[]> data() {
    Object[][] data = new Object[][] { { "red", "#FF0000" }, { "green", "#00FF00" }, { "blue", "#0000FF" } };
    return Arrays.asList(data);
  }

  private RGBConverter rgConverter = new RGBConverter("orange");

  @Test
  public void testHex() {
    HexConverter hConverter = new HexConverter(colorName);
    assertEquals(result, hConverter.getResult());
  }

  @Test
  public void testRGB() {
    assertEquals("rgb(255, 160, 0)", rgConverter.getResult());
  }

}