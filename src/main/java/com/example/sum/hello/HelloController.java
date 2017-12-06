package com.example.sum.hello;

import java.io.File;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  String home(@RequestParam(value = "name", defaultValue = "Pityi Palko") String name) {
    return "Hello" + name;
  }

  @RequestMapping("/endpoints")
  String endpoints() {
    return "url: /, param: String name, default: Pityi Palko <br>" + "url: /lower, param: String word <br>"
        + "url: /upper, param: String word <br>" + "url: /reverse, param: String word <br>"
        + "url: /add, param: int nmb1, int nmb2 <br>" + "url: /minus, param: int nmb1, int nmb2<br>"
        + "url: /divide, param: int nmb1, int nmb2 <br>" + "url: /multiply, param: int nmb1, int nmb2 <br>"
        + "url: /hex, param: String colorName <br>" + "url: /rgb, param: String colorName";
  }

  @RequestMapping("/lower")
  String lower(@RequestParam(value = "word") String word) {
    return word.toLowerCase();
  }

  @RequestMapping("/upper")
  String upper(@RequestParam(value = "word") String word) {
    return word.toUpperCase();
  }

  @RequestMapping("/reverse")
  String reverse(@RequestParam(value = "word") String word) {
    char[] in = word.toCharArray();
    int begin = 0;
    int end = in.length - 1;
    char temp;
    while (end > begin) {
      temp = in[begin];
      in[begin] = in[end];
      in[end] = temp;
      end--;
      begin++;
    }
    return new String(in);
  }

}