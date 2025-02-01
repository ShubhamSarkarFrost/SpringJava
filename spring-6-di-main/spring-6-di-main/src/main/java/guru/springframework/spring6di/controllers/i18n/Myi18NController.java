package guru.springframework.spring6di.controllers.i18n;

import guru.springframework.spring6di.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

    GreetingServices greetingServices;

    public Myi18NController(@Qualifier("i18NService") GreetingServices greetingService) {
        this.greetingServices = greetingService;
    }

    public String sayHello(){
        return greetingServices.sayGreeting();
    }

}
