package com.kaue.proxy;

import com.kaue.proxy.dynamicjdk.ProxyFactoryJDK;
import com.kaue.proxy.dynamicjdk.domain.EnglishGreetingService;
import com.kaue.proxy.dynamicjdk.domain.GreetingService;

public class JDKDynamicProxyClientTest {

    public static void main(String[] args) {
        GreetingService realService = new EnglishGreetingService();
        GreetingService proxyService = ProxyFactoryJDK.createProxy(realService, GreetingService.class);

        System.out.println("\nReal Service: ");
        System.out.println(realService.greet("World"));
        System.out.println("-------------------------------");
        System.out.println("Real Service: ");
        System.out.println(realService.goodbye());
        System.out.println("-------------------------------\n");
        System.out.println("Proxy: ");
        System.out.println(proxyService.greet("World"));
        System.out.println("-------------------------------");
        System.out.println("Proxy: ");
        System.out.println(proxyService.goodbye());
        System.out.println("-------------------------------");

    }
}
