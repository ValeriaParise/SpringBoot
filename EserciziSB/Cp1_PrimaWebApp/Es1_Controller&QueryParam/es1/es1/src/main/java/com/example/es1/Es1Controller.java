package com.example.es1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Es1Controller {
    @GetMapping(path = "ciao")
    public String ciao(String nome, @RequestParam(defaultValue = "", required = false) String cognome, String provincia) {
        return "Ciao " + nome + " " + cognome + ", com'è il tempo in " + provincia + "?";
    }
}

