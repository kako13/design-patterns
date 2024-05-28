package com.kaue.estrutural.proxy;


import com.kaue.estrutural.proxy.manual.LoggingSaudacaoServiceImplProxy;
import com.kaue.estrutural.proxy.manual.domain.SaudacaoService;

public class ProxyPatternClientTest {
    public static void main(String[] args) {
        SaudacaoService proxyService = new LoggingSaudacaoServiceImplProxy();
        System.out.println("-------------------------------\n");
        System.out.println("Proxy: ");
        System.out.println(proxyService.ola("Mundo"));
        System.out.println("-------------------------------");
        System.out.println("Proxy: ");
        System.out.println(proxyService.tchau());
        System.out.println("-------------------------------");
    }
}










