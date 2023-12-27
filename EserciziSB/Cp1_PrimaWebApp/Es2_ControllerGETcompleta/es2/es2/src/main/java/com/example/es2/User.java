package com.example.es2;

public class User {
    public String nome;
    public String provincia;
    public String saluto;

    public User(String nome, String provincia,  String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto =  "Ciao " + nome  + ", com'è il tempo in " + provincia + " ?";;
    }

}
