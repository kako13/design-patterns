package com.kaue.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class ProxyFactoryCGLib {
    public static <T> T createProxy(T target, Class<T> superclassType) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(superclassType);
        enhancer.setCallback(new LoggingMethodInteceptor());
        return (T) enhancer.create();
    }
}
