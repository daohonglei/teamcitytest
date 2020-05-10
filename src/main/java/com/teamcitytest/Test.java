package com.teamcitytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class Test {
    @GetMapping("index")
    public String index(){
        return "index  222222";
    }
}
