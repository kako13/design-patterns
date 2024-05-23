package com.kaue.estrutural.proxy.cglib;

public class SaludosServiceImpl {
    public String hola(String name) {
        return "Hola " + name + "!";
    }

    public String adios() {
        return "Adiós!!";
    }
}
