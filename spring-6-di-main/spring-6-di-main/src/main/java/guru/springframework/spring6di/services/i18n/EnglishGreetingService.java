package guru.springframework.spring6di.services.i18n;

import guru.springframework.spring6di.services.GreetingServices;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "Hello User - EN";
    }
}
