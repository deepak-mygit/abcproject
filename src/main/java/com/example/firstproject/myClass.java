package com.example.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClass {

    @GetMapping("abc")
    public String sayHello(){
        return "Hello welcome";
    }
}
