package com.example.sum.color;

public class ColorConverter {
  private String color;
  private String[] colorList = { "red", "green", "blue", "yellow", "cyan", "purple", "orange", "black", "white" };

  public ColorConverter(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

  public String[] getColorList() {
    return this.colorList;
  }

  public String getResult() {
    return "Unknown color :(";
  }

}