package br.com.fatec.evecontrol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evecontrol")
public class IndexController {

    @GetMapping
    public String index(){

        return "Estamos nas nuvens!";
    }
}
