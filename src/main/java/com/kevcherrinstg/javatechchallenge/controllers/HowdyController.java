package com.kevcherrinstg.javatechchallenge.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HowdyController {

    @RequestMapping("/")
    public String index() {
        return "Howdy Y'all!";
    }
}
