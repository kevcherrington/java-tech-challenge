package com.kevcherrinstg.javatechchallenge.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HowdyController {

    @RequestMapping("/howdy")
    public String index() {
        return "Howdy Y'all!";
    }
}
