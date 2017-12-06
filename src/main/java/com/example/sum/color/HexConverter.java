package com.example.sum.color;

public class HexConverter extends ColorConverter {
  private String[] colorList;
  private String[] hexList = { "#FF0000", "#00FF00", "#0000FF", "#FFFF00", "#00FFFF", "#A020F0", "#FFA500", "#000000",
      "#FFFFFF" };

  public HexConverter(String color) {
    super(color);
    this.colorList = super.getColorList();
  }

  public String getResult() {
    for (int i = 0; i < this.getColorList().length; i++)
      if (this.colorList[i].equals(this.getColor()))
        return this.hexList[i];

    return "Unknown color :(";
  }

}