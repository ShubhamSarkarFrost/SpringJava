package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service";
    }
}
