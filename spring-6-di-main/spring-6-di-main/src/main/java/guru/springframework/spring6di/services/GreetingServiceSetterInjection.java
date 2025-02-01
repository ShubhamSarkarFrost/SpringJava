package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingBeanInjection")
public class GreetingServiceSetterInjection implements GreetingServices{

    @Override
    public String sayGreeting() {
        return "The Following is the Greeting Service Setter Injection";
    }
}
