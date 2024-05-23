package com.kaue.estrutural.proxy.dynamicjdk.domain;

public class EnglishGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    @Override
    public String goodbye() {
        return "Goodbye!!!";
    }
}
