package com.example.sum.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  String home(@RequestParam(value = "name", defaultValue = "Hello Pityi Palko") String name) {
    return name;
  }

}