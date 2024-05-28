package com.kaue.estrutural.proxy;

import com.kaue.estrutural.proxy.cglib.ProxyFactoryCGLib;
import com.kaue.estrutural.proxy.cglib.SaludosServiceImpl;

public class CGLibProxyClientTest {
    public static void main(String[] args) {
        SaludosServiceImpl greetingServicePoxy = ProxyFactoryCGLib.createProxy(new SaludosServiceImpl(), SaludosServiceImpl.class);
        System.out.println("-------------------------------\n");
        imprimeHola(greetingServicePoxy);
        System.out.println("-------------------------------");
        imprimeAdios(greetingServicePoxy);
        System.out.println("-------------------------------");
    }

    private static void imprimeAdios(SaludosServiceImpl greetingServicePoxy) {
        System.out.println("Proxy: ");
        System.out.println(greetingServicePoxy.adios());
    }

    private static void imprimeHola(SaludosServiceImpl greetingServicePoxy) {
        System.out.println("Proxy: ");
        System.out.println(greetingServicePoxy.hola("Mundo"));
    }

}
