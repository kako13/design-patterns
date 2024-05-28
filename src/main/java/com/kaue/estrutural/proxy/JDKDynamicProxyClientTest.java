package com.kaue.estrutural.proxy;

import com.kaue.estrutural.proxy.dynamicjdk.ProxyFactoryJDK;
import com.kaue.estrutural.proxy.dynamicjdk.domain.EnglishGreetingService;
import com.kaue.estrutural.proxy.dynamicjdk.domain.GreetingService;

public class JDKDynamicProxyClientTest {

    public static void main(String[] args) {
        GreetingService proxyService = ProxyFactoryJDK.createProxy(new EnglishGreetingService(), GreetingService.class);
        System.out.println("-------------------------------");
        System.out.println("Proxy: ");
        System.out.println(proxyService.greet("World"));
        System.out.println("-------------------------------");
        System.out.println("Proxy: ");
        System.out.println(proxyService.goodbye());
        System.out.println("-------------------------------");
    }
}
