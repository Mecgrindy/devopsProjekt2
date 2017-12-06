package com.example.sum.color;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {

  @RequestMapping("/hex")
  public String hex(@RequestParam("colorName") String colorName) {
    HexConverter cConverter = new HexConverter(colorName);
    return cConverter.getResult();
  }

  @RequestMapping("/rgb")
  public String rgb(@RequestParam("colorName") String colorName) {
    RGBConverter cConverter = new RGBConverter(colorName);
    return cConverter.getResult();
  }

}