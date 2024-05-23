package com.kaue.estrutural.proxy.dynamicjdk;

import java.lang.reflect.Proxy;

public class ProxyFactoryJDK {
    public static <T> T createProxy(T target, Class<T> interfaceClass) {
        return (T) Proxy.newProxyInstance(
                interfaceClass.getClassLoader(),
                new Class<?>[]{interfaceClass},
                new LoggingInvocationHandler(target));
    }
}
