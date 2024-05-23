package com.kaue.estrutural.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LoggingMethodInteceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("El método " + method.getName()+ " fue llamado com los args: " +
                (args != null? Arrays.toString(args):"null")
        );
        Object result = methodProxy.invokeSuper(obj, args);
        System.out.println(
                "El método " + method.getName() + " devolvió: " + result
        );
        return result;
    }
}
