package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicesPrimary implements GreetingServices{

    @Override
    public String sayGreeting() {
        return "Hello From the Primary Bean!!";
    }
}
