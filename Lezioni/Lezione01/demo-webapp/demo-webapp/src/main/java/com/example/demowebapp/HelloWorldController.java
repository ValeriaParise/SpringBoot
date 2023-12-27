package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path ="/helloWorld")
    public String helloWorld(){
        return "Hello World";
    }

    // Request Parameter

//    @GetMapping( path = "/ciao")
//    public String ciao(@RequestParam String nome, @RequestParam String cognome ){
//        return "Ciao" + nome + " " + cognome + "!";
//    }
    // sarà visualizzabile su localhost:8080/v1/ciao?nome=nomeDaInserire&cognome=cognome da inserire
    // i due parametri in questo caso sono entrambi obbligatori

    @GetMapping( path = "/ciao")
    public String ciao(@RequestParam (required = true) String nome, @RequestParam (required = false, defaultValue = " ")String cognome ){
        return "Ciao" + nome + " " + cognome + "!";
    }
    // in questo caso omettendo il cognome l'applicazione continuerà a funzionare senza generare errori
}
