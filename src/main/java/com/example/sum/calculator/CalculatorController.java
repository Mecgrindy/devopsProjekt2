package com.example.sum.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/add")
    public String add(@RequestParam(value = "nmb1", defaultValue = "0") int nmb1,
            @RequestParam(value = "nmb2", defaultValue = "0") int nmb2) {
        Add add = new Add(nmb1, nmb2);
        return add.getResult();
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam(value = "nmb1", defaultValue = "0") int nmb1,
            @RequestParam(value = "nmb2", defaultValue = "0") int nmb2) {
        Minus minus = new Minus(nmb1, nmb2);
        return minus.getResult();
    }

    @RequestMapping("/divide")
    public String divide(@RequestParam(value = "nmb1", defaultValue = "0") int nmb1,
            @RequestParam(value = "nmb2", defaultValue = "0") int nmb2) {
        Divide divide = new Divide(nmb1, nmb2);
        return divide.getResult();
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam(value = "nmb1", defaultValue = "0") int nmb1,
            @RequestParam(value = "nmb2", defaultValue = "0") int nmb2) {
        Multiply multiply = new Multiply(nmb1, nmb2);
        return multiply.getResult();
    }

}