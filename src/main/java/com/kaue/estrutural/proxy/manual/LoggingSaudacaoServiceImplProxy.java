package com.kaue.estrutural.proxy.manual;

import com.kaue.estrutural.proxy.manual.domain.SaudacaoService;
import com.kaue.estrutural.proxy.manual.domain.SaudacaoServiceImpl;

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
        System.out.println("Método tchau foi chamado com o arg: \"null\"");
        String tchau = saudacaoService.tchau();
        System.out.println("Método tchau devolveu " + tchau);
        return tchau;
    }
}
