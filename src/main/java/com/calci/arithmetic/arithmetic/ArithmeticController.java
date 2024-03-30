package com.calci.arithmetic.arithmetic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithmeticController {

    @RequestMapping("/add")
    public String add(){
        return "default";
    }
}
