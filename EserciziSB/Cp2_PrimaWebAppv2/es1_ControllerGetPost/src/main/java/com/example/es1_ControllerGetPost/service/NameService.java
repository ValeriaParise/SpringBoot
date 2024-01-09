package com.example.es1_ControllerGetPost.service;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public  String printName(String name){
        return name;
    }

    public  String revName(String name) {
        StringBuilder builder = new StringBuilder();
        for (int l = name.length() - 1; l >= 0; l--) {
            builder.append(name.charAt(l));
        }
        return builder.toString();
    }
}
