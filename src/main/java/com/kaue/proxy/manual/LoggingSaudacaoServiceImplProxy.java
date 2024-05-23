package com.kaue.proxy.manual;

import com.kaue.proxy.manual.domain.SaudacaoServiceImpl;
import com.kaue.proxy.manual.domain.SaudacaoService;

public class LoggingSaudacaoServiceImplProxy implements SaudacaoService {
    private SaudacaoService saudacaoService = new SaudacaoServiceImpl();
    @Override
    public String ola(String name) {
        System.out.println("Método ola foi chamado com o arg: " + name);
        String ola = saudacaoService.ola(name);
        System.out.println("Método ola devolveu " + ola);
        return ola;
    }

    @Override
    public String tchau() {
        System.out.println("Método ola foi chamado com o arg: \"null\"");
        String tchau = saudacaoService.tchau();
        System.out.println("Método ola devolveu " + tchau);
        return tchau;
    }
}
