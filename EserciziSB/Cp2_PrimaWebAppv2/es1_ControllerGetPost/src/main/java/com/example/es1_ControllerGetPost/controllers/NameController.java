package com.example.es1_ControllerGetPost.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.es1_ControllerGetPost.service.NameService;

@RestController
@RequestMapping("/")
public class NameController {
    @Autowired
    private NameService nameService;
    @GetMapping(path = "")
    public String getName(@RequestParam(required = true) String name)
    {
        return nameService.printName(name);
    }

    @PostMapping(path = "")
    public String getRevName (
            @RequestParam String name){
       return nameService.revName(name);
    }

  //  http://localhost:8080/?name=Maria

}
