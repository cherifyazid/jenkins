package com.example.jenkins1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContro {


    @GetMapping("/test")
    public String test(){
        return "test Node 1 OK";
    }
}
