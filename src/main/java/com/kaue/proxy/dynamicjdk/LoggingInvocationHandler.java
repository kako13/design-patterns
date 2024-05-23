package com.kaue.proxy.dynamicjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LoggingInvocationHandler implements InvocationHandler {
    private Object target;

    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method " + method.getName()+ " was called with args: " +
                (args != null?Arrays.toString(args):"null")
        );
        Object result = method.invoke(target, args);
        System.out.println(
                "Method " + method.getName() + " returns: " + result
        );
        return result;
    }
}
