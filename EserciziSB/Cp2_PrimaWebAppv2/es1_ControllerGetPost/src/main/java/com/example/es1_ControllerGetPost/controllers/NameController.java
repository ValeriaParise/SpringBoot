package com.example.es1_ControllerGetPost.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.es1_ControllerGetPost.service.NameService;

@RestController
public class NameController {
    @Autowired
    private NameService nameService;
    @GetMapping(path = "/{name}")
    public String getName(@RequestParam(value = "name" , required = true) String name){
        return nameService.printName(name);
    }

    @PostMapping(path = "/{name}")
    public String getRevName (@RequestParam(value = "name" , required = true)String name){
       return nameService.revName(name);
    }


}
