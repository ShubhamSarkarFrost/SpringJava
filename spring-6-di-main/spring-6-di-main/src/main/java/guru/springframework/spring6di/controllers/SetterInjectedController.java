package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServices;

public class SetterInjectedController {

    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
