package com.example.es1;

import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class es1_Controller {
    @GetMapping(path = "ciao")
    public String ciao(String nome , @RequestParam( defaultValue = "", required = false ) String cognome , String provincia){
        return "Ciao " + nome + " " + cognome +", com'è il tempo in " + provincia + "?";
    }

}
