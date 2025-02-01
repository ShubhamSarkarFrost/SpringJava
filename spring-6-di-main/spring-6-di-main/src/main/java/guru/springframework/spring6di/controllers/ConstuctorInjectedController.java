package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstuctorInjectedController {

    private final GreetingServices greetingServices;

    public ConstuctorInjectedController(@Qualifier("greetingServicesImpl")GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
