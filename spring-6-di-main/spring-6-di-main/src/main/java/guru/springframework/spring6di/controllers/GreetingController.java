package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServices;
import guru.springframework.spring6di.services.GreetingServicesImpl;

public class GreetingController {

    private final GreetingServices greetingServices;

    public GreetingController() {
        this.greetingServices = new GreetingServicesImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");
        return  greetingServices.sayGreeting();
    }


}
