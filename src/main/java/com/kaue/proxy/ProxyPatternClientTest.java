package com.kaue.proxy;


import com.kaue.proxy.manual.LoggingSaudacaoServiceImplProxy;
import com.kaue.proxy.manual.domain.SaudacaoServiceImpl;
import com.kaue.proxy.manual.domain.SaudacaoService;

public class ProxyPatternClientTest {
    public static void main(String[] args) {

        SaudacaoService realService = new SaudacaoServiceImpl();
        SaudacaoService proxyService = new LoggingSaudacaoServiceImplProxy();

        System.out.println("\nReal Service: ");
        System.out.println(realService.ola("Mundo"));
        System.out.println("-------------------------------");
        System.out.println("Real Service: ");
        System.out.println(realService.tchau());
        System.out.println("-------------------------------\n");
        System.out.println("Proxy: ");
        System.out.println(proxyService.ola("Mundo"));
        System.out.println("-------------------------------");
        System.out.println("Proxy: ");
        System.out.println(proxyService.tchau());
        System.out.println("-------------------------------");
    }
}










