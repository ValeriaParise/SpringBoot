package com.example.es2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

public class Es2Controller {
    @GetMapping(path= "/ciao/{provincia}")
    public User greet(
            @PathVariable String provincia,
            @RequestParam(value = "nome" , required = false, defaultValue = "") String nome){

        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + " ?";

        return new User (nome, provincia, saluto);
    }
}
