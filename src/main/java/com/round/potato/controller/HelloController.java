package com.round.potato.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping( "/")
    public String index() {
        return "To naprawdę ładny ziemniak";
    }

}