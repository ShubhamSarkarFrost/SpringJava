package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Friends Do not let Friends for Property Injected";
    }
}
