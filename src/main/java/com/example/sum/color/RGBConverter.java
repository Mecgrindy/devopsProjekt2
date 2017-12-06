package com.example.sum.color;

public class RGBConverter extends ColorConverter {
  private String[] colorList;
  private String[] rgbList = { "rgb(255, 0, 0)", "rgb(0, 255, 0)", "rgb(0, 0, 255)", "rgb(255, 255, 0)",
      "rgb(0, 255, 255)", "rgb(160, 32, 240)", "rgb(255, 160, 0)", "rgb(0, 0, 0)", "rgb(255, 255, 255)" };

  public RGBConverter(String color) {
    super(color);
    this.colorList = super.getColorList();
  }

  public String getResult() {
    for (int i = 0; i < this.getColorList().length; i++)
      if (this.colorList[i].equals(this.getColor()))
        return this.rgbList[i];

    return "Unknown color :(";
  }

}