package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Qualifier("setterGreetingBeanInjection")
    @Autowired
    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }
}
