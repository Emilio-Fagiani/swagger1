package it.develhope.swagger01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/get")
public class MyController {

    @GetMapping("/getName")
    public String getName(){
        return "Emilio Fagiani";
    }
}

