package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.NameService;

@RestController
public class NameController {
    @Autowired
    private NameService nameService;
    @GetMapping("/")
    public String printName(){
        return nameService.printName();
    }
}
