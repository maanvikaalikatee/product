package com.product.items.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {


    @GetMapping("/sample")
    public String msg(){
        return "This is my controller class";
    }
}
