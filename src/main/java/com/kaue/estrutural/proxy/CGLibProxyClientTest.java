package com.kaue.estrutural.proxy;

import com.kaue.estrutural.proxy.cglib.ProxyFactoryCGLib;
import com.kaue.estrutural.proxy.cglib.SaludosServiceImpl;

public class CGLibProxyClientTest {
    public static void main(String[] args) {
        SaludosServiceImpl realService = new SaludosServiceImpl();
        SaludosServiceImpl greetingServicePoxy = ProxyFactoryCGLib.createProxy(realService, SaludosServiceImpl.class);


        System.out.println("\nReal Service: ");
        System.out.println(realService.hola("Mundo"));
        System.out.println("-------------------------------");
        System.out.println("Real Service: ");
        System.out.println(realService.adios());
        System.out.println("-------------------------------\n");
        System.out.println("Proxy: ");
        System.out.println(greetingServicePoxy.hola("Mundo"));
        System.out.println("-------------------------------");
        System.out.println("Proxy: ");
        System.out.println(greetingServicePoxy.adios());
        System.out.println("-------------------------------");
    }

}
