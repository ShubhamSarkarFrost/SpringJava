package guru.springframework.spring6di.services;

public class GreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from Base Service";
    }
}
