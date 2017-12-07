package com.example.sum.hello;

import java.io.File;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  String home(@RequestParam(value = "name", defaultValue = "Pityi Palko") String name) {
    return "<div style='position:fixed; top:0; left:0; width:100vw; height: 100vh; background-color:#263238; color:white; text-align:center;'><h1>"
        + "Hello " + name
        + "</h1><h3><b>Mindenes alkalmazás</b> <small style='color: silver'>Devops Projekt</small></h3><h4><a href='/endpoints'>Végpontok</a></h4>"
        + "<p>A többi végpont kinézete nem lett formázva a tesztek miatt.</p>"
        + "<h3 style='color:#00E5FF'><b>by: Torma Roland és Kokrehel Grácián</b></h3></div>";
  }

  @RequestMapping("/endpoints")
  String endpoints() {
    return "<a href='/?name=Lacika'>Name Lacika</a><br>"
        + "<a href='/lower?word=DSGSVCXfsFDSF'>Lower DSGSVCXfsFDSF</a><br>"
        + "<a href='/upper?word=jsdkfgdvjkhdb'>Upper jsdkfgdvjkhdb</a><br>"
        + "<a href='/reverse?word=Ujra vad a varju'>Reverse Ujra vad a varju</a><br>"
        + "<a href='/add?nmb1=2&nmb2=3'>2+3</a><br>" + "<a href='/minus?nmb1=10&nmb2=4'>10-4</a><br>"
        + "<a href='/divide?nmb1=25&nmb2=5'>25/5</a><br>" + "<a href='/multiply?nmb1=3&nmb2=7'>3*7</a><br>"
        + "<a href='/hex?colorName=red'>Hex red</a><br>" + "<a href='/rgb?colorName=orange'>RGB orange</a><br>";
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