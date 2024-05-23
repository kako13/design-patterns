package com.kaue.estrutural.proxy.manual.domain;

public class SaudacaoServiceImpl implements SaudacaoService {
    @Override
    public String ola(String name) {
        return "Olá, " + name + "!";
    }

    @Override
    public String tchau() {
        return "Tchau!!";
    }
}
