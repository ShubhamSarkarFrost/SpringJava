package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServices;

public class PropertyInjectedController {

    GreetingServices greetingServices;

    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
